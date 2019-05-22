package guillaume.agis.techtest.ui.detail

import com.google.common.truth.Truth.assertThat
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import guillaume.agis.techtest.api.HttpErrorUtils
import guillaume.agis.techtest.model.Comment
import guillaume.agis.techtest.rule.BaseRule
import guillaume.agis.techtest.usecase.PostsUseCase
import guillaume.agis.techtest.utils.DataBuilder
import io.reactivex.Single
import org.junit.Before
import org.junit.Test
import java.net.UnknownHostException

/**
 * Used to test async code in RxAndroid in the test
 */
class PostDetailViewModelTest : BaseRule() {

    private lateinit var viewModel: PostDetailViewModel
    private val postManager = mock<PostsUseCase>()
    private val comments = listOf<Comment>(mock(), mock())

    private val post = DataBuilder.providePost()


    @Before
    fun setUp() {
        viewModel = PostDetailViewModel(postManager, HttpErrorUtils())
        whenever(postManager.getCommentsByPostId(any())).thenReturn(Single.just(comments))
    }

    @Test
    fun `Given the set of a post of the viewModel then emit this post`() {
        val testObserver = viewModel.viewStateObservable.test()
        viewModel.setPost(post)
        val state = testObserver
            .assertNoErrors()
            .values()[0]

        assertThat(state.cast<PostDetailViewState.RenderPost>().post).isEqualTo(post)
    }

    @Test
    fun `Given a list of comments when viewModel is created then display this list`() {

        val testObserver = viewModel.viewStateObservable.test()

        viewModel.setPost(post)
        val state = testObserver
            .assertNoErrors()
            .values()[1]

        assertThat(state.cast<PostDetailViewState.DisplayCommentsNb>().nbComment).isEqualTo(comments.size)
    }


    @Test
    fun `Given an error when loading the comments then send an error`() {
        val errorMsg = "errorMsg"
        whenever(postManager.getCommentsByPostId(any())).thenReturn(Single.error(Throwable(errorMsg)))

        val testObserver = viewModel.viewStateObservable.test()

        viewModel.setPost(post)

        val state = testObserver
            .assertNoErrors()
            .values()[1]

        assertThat(state.cast<PostDetailViewState.DisplayError>().error).isEqualTo(errorMsg)
    }

    @Test
    fun `Given no internet connexion when loading the comments then emit No internet action`() {
        whenever(postManager.getCommentsByPostId(any())).thenReturn(Single.error(UnknownHostException()))

        val testObserver = viewModel.viewStateObservable.test()

        viewModel.setPost(post)

        testObserver
            .assertNoErrors()
            .assertValueAt(1, PostDetailViewState.NoInternet)
    }

    @Test
    fun `Given the button visible When the comments button is clicked then emit SeeComments`() {
        val testObserver = viewModel.viewStateObservable.test()



        viewModel.setPost(post)
        viewModel.onCommentBtnClicked()

        val state = testObserver
            .assertNoErrors()
            .values()[2]

        assertThat(state.cast<PostDetailViewState.SeeComments>().post).isEqualTo(post)
        assertThat(state.cast<PostDetailViewState.SeeComments>().comments).isEqualTo(comments)
    }

    @Test
    fun `Given a post set When the email icon is clicked then emit OpenEmail with the user email`() {
        val testObserver = viewModel.viewStateObservable.test()

        viewModel.setPost(post)
        viewModel.onEmailClicked()

        val state = testObserver
            .assertNoErrors()
            .values()[2]

        assertThat(state.cast<PostDetailViewState.OpenEmail>().email).isEqualTo(post.user.email)
    }
}

internal fun <T> PostDetailViewState.cast(): T = this as T