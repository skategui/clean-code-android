package guillaume.agis.techtest.ui.list

import android.app.Activity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.DispatchingAndroidInjector_Factory
import guillaume.agis.techtest.MainApplication
import guillaume.agis.techtest.R
import guillaume.agis.techtest.api.HttpErrorUtils
import guillaume.agis.techtest.ui.utils.CustomAssertions.Companion.hasItemCount
import guillaume.agis.techtest.ui.utils.DiffCallback
import guillaume.agis.techtest.ui.utils.RecyclerViewMatcher.Companion.withRecyclerView
import guillaume.agis.techtest.usecase.PostsUseCase
import guillaume.agis.techtest.utils.DataBuilder
import io.reactivex.Single
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.net.UnknownHostException
import javax.inject.Provider


@RunWith(AndroidJUnit4::class)
class EspressoListPostsActivityTest {

    private val postUseCase = mock<PostsUseCase>()

    private val postsAdapterMock = ListPostsAdapterImpl(DiffCallback())

    private val testViewModelFactory = ListPostsViewModel.Factory(postUseCase, HttpErrorUtils())

    @get:Rule
    val activityTestRule = ActivityTestRule<ListPostsActivity>(ListPostsActivity::class.java, false, false)

    // inject the mock and the created ViewModelFactory (with the PostUseCase mocked) into the view
    private fun initDispatcherAndLaunchActivity() {
        val myApp =
            InstrumentationRegistry.getInstrumentation().targetContext.applicationContext as MainApplication
        myApp.dispatchingAndroidInjector = createFakeActivityInjector {
            viewModelFactory = testViewModelFactory
            postsAdapter = postsAdapterMock
        }
        activityTestRule.launchActivity(null)
    }

    @Test
    fun given_a_connexion_when_fetching_posts_then_show_the_posts_list() {

        val posts = DataBuilder.providePostsList()
        whenever(postUseCase.getPosts()).thenReturn(Single.just(DataBuilder.providePostsList()))
        initDispatcherAndLaunchActivity()

        onView(withId(R.id.llState)).check(matches(not(isDisplayed())))
        onView(withId(R.id.recyclerView)).check(matches(isDisplayed()))
        onView(withId(R.id.recyclerView)).check(hasItemCount(posts.size))


        for (index in 0 until posts.size) {
            val post = posts[index]
            onView(
                withRecyclerView(R.id.recyclerView)
                    .atPositionOnView(index, R.id.tvTitle)
            ).check(matches(withText(post.title)))

            onView(
                withRecyclerView(R.id.recyclerView)
                    .atPositionOnView(index, R.id.tvBody)
            ).check(matches(withText(post.body)))

            onView(
                withRecyclerView(R.id.recyclerView)
                    .atPositionOnView(index, R.id.cardView)
            ).check(matches(isClickable()))
        }
    }


    @Test
    fun given_an_error_of_connexion_when_fetching_posts_then_show_error_msg() {

        whenever(postUseCase.getPosts()).thenReturn(Single.error(UnknownHostException()))
        initDispatcherAndLaunchActivity()


        onView(withId(R.id.llState)).check(matches(isDisplayed()))
        onView(withId(R.id.tvStateTitle)).check(matches(withText(R.string.error_no_internet_connexion)))
        onView(withId(R.id.recyclerView)).check(matches(not(isDisplayed())))
        onView(withId(R.id.tvReload)).check(matches(isClickable()))
        onView(withId(R.id.tvReload)).check(matches(isDisplayed()))
    }

    @Test
    fun given_an_empty_list_when_fetching_posts_then_show_empty_list_msg() {

        whenever(postUseCase.getPosts()).thenReturn(Single.just(emptyList()))
        initDispatcherAndLaunchActivity()

        onView(withId(R.id.llState)).check(matches(isDisplayed()))
        onView(withId(R.id.tvStateTitle)).check(matches(withText(R.string.error_no_post_available)))
        onView(withId(R.id.recyclerView)).check(matches(not(isDisplayed())))
        onView(withId(R.id.tvReload)).check(matches(not(isDisplayed())))

    }

    @Test
    fun given_an_error_when_fetching_posts_then_show_a_generic_error_msg() {

        whenever(postUseCase.getPosts()).thenReturn(Single.error(Throwable("error")))

        initDispatcherAndLaunchActivity()

        onView(withId(R.id.llState)).check(matches(isDisplayed()))
        onView(withId(R.id.tvStateTitle)).check(matches(withText((R.string.error_try_again_later))))
        onView(withId(R.id.recyclerView)).check(matches(not(isDisplayed())))
        onView(withId(R.id.tvReload)).check(matches(not(isDisplayed())))
    }


    // utils
    private fun createFakeActivityInjector(block: ListPostsActivity.() -> Unit)
            : DispatchingAndroidInjector<Activity> {
        val injector = AndroidInjector<Activity> { instance ->
            if (instance is ListPostsActivity) {
                instance.block()
            }
        }
        val factory = AndroidInjector.Factory<Activity> { injector }
        val map = mapOf(
            Pair<Class<*>,
            Provider<AndroidInjector.Factory<*>>>(ListPostsActivity::class.java, Provider { factory })
        )
        return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(map, emptyMap(), emptyMap(), emptyMap())
    }

}


