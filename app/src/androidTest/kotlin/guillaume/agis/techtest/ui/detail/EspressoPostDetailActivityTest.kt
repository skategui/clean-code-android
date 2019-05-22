package guillaume.agis.techtest.ui.detail

import android.app.Activity
import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.DispatchingAndroidInjector_Factory
import guillaume.agis.techtest.MainApplication
import guillaume.agis.techtest.R
import guillaume.agis.techtest.api.HttpErrorUtils
import guillaume.agis.techtest.ui.utils.CustomAssertions
import guillaume.agis.techtest.ui.utils.RecyclerViewMatcher.Companion.withRecyclerView
import guillaume.agis.techtest.usecase.PostsUseCase
import guillaume.agis.techtest.utils.DataBuilder
import io.reactivex.Single
import org.hamcrest.CoreMatchers.not
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.net.UnknownHostException
import javax.inject.Provider

@RunWith(AndroidJUnit4::class)
class EspressoPostDetailActivityTest {

    private val postUseCase = mock<PostsUseCase>()

    private val testViewModelFactory = PostDetailViewModel.Factory(postUseCase, HttpErrorUtils())

    @get:Rule
    val activityTestRule = ActivityTestRule<PostDetailActivity>(PostDetailActivity::class.java, false, false)

    private fun initDispatcherAndLaunchActivity(intent: Intent? = null) {
        val myApp =
            InstrumentationRegistry.getInstrumentation().targetContext.applicationContext as MainApplication
        myApp.dispatchingAndroidInjector = createFakeActivityInjector {
            viewModelFactory = testViewModelFactory
        }
        activityTestRule.launchActivity(intent)
    }

    @Before
    fun setup() {
        whenever(postUseCase.getCommentsByPostId(any())).thenReturn(Single.just(DataBuilder.provideCommentsList()))
    }


    @Test
    fun given_a_connexion_when_fetching_comments_then_show_comment_btn_with_the_popup() {

        val intent = Intent()
        val post = DataBuilder.providePost()
        intent.putExtra(PostDetailActivity.POST_SELECTED, post)
        initDispatcherAndLaunchActivity(intent)

        onView(withId(R.id.tvFullName)).check(matches(isDisplayed()))
        onView(withId(R.id.tvEmail)).check(matches(isDisplayed()))
        onView(withId(R.id.tvFullName)).check(matches(withText(post.user.username)))
        onView(withId(R.id.tvEmail)).check(matches(isClickable()))
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvBody)).check(matches(isDisplayed()))

        onView(withId(R.id.tvTitle)).check(matches(withText(post.title)))
        onView(withId(R.id.tvBody)).check(matches(withText(post.body)))

        onView(withId(R.id.llSeeComments)).check(matches(isDisplayed()))
        onView(withId(R.id.llSeeComments)).check(matches(isClickable()))
        onView(withId(R.id.tvCommentNbr)).check(
            matches(
                withText(
                    String.format(
                        activityTestRule.activity.getString(
                            R.string.post_detail_see_comments
                        ),
                        DataBuilder.provideCommentsList().size
                    )
                )
            )
        )

        onView(withId(R.id.commentsList)).check(matches(not((isDisplayed()))))
        onView(withId(R.id.popup_title)).check(matches(not(isDisplayed())))
        onView(withId(R.id.recyclerCommentsView)).check(matches(not(isDisplayed())))

        onView(withId(R.id.llSeeComments)).perform(click())

        onView(withId(R.id.popup_title)).check(matches(isDisplayed()))
        onView(withId(R.id.popup_title)).check(matches(withText(post.title)))
        onView(withId(R.id.recyclerCommentsView)).check(matches(isDisplayed()))

        val comments = DataBuilder.provideCommentsList()

        for (index in 0 until comments.size) {
            val comment = comments[index]
            onView(
                withRecyclerView(R.id.recyclerCommentsView)
                    .atPositionOnView(index, R.id.tvFullName)
            ).check(matches(withText(comment.name)))

            onView(
                withRecyclerView(R.id.recyclerCommentsView)
                    .atPositionOnView(index, R.id.tvBody)
            ).check(matches(withText(comment.body)))
        }

        onView(withId(R.id.recyclerCommentsView))
            .check(CustomAssertions.hasItemCount(comments.size))

    }


    @Test
    fun given_an_error_of_connexion_when_fetching_posts_then_hide_comment_btn() {

        whenever(postUseCase.getCommentsByPostId(any())).thenReturn(Single.error(UnknownHostException()))

        val intent = Intent()
        val post = DataBuilder.providePost()
        intent.putExtra(PostDetailActivity.POST_SELECTED, post)
        initDispatcherAndLaunchActivity(intent)

        onView(withId(R.id.tvFullName)).check(matches(isDisplayed()))
        onView(withId(R.id.tvEmail)).check(matches(isDisplayed()))
        onView(withId(R.id.tvEmail)).check(matches(isClickable()))
        onView(withId(R.id.tvFullName)).check(matches(withText(post.user.username)))
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvBody)).check(matches(isDisplayed()))

        onView(withId(R.id.tvTitle)).check(matches(withText(post.title)))
        onView(withId(R.id.tvBody)).check(matches(withText(post.body)))

        onView(withId(R.id.commentsList)).check(matches(not((isDisplayed()))))
        onView(withId(R.id.popup_title)).check(matches(not(isDisplayed())))
        onView(withId(R.id.recyclerCommentsView)).check(matches(not(isDisplayed())))
    }

    // utils
    private fun createFakeActivityInjector(block: PostDetailActivity.() -> Unit)
            : DispatchingAndroidInjector<Activity> {
        val injector = AndroidInjector<Activity> { instance ->
            if (instance is PostDetailActivity) {
                instance.block()
            }
        }
        val factory = AndroidInjector.Factory<Activity> { injector }
        val map = mapOf(
            Pair<Class<*>,
                    Provider<AndroidInjector.Factory<*>>>(PostDetailActivity::class.java, Provider { factory })
        )
        return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(map, emptyMap(), emptyMap(), emptyMap())
    }
}