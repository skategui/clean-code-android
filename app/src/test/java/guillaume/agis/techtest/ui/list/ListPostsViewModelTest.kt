package guillaume.agis.techtest.ui.list


import com.google.common.truth.Truth.assertThat
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import guillaume.agis.techtest.api.HttpErrorUtils
import guillaume.agis.techtest.rule.BaseRule
import guillaume.agis.techtest.usecase.PostsUseCase
import guillaume.agis.techtest.utils.DataBuilder
import io.reactivex.Single
import org.junit.Before
import org.junit.Test
import java.net.UnknownHostException

class ListPostsViewModelTest : BaseRule() {

    private lateinit var viewModel: ListPostsViewModel

    private val postManager = mock<PostsUseCase>()
    private val posts = DataBuilder.providePostsList()


    @Before
    fun setUp() {
        viewModel = ListPostsViewModel(postManager, HttpErrorUtils())
    }

    @Test
    fun `Given a list of posts when viewModel is created then display this list`() {

        whenever(postManager.getPosts()).thenReturn(Single.just(posts))

        val testObserver = viewModel.viewStateObservable.test()

        viewModel.onCreate(mock())
        val state =testObserver
            .assertNoErrors()
            .values()[1]

        assertThat(state.cast<ListPostsViewState.DisplayPostsList>().posts).isEqualTo(posts)
    }


    @Test
    fun `Given the viewmodel created when the posts list is loading then display the loader `() {

        whenever(postManager.getPosts()).thenReturn(Single.just(posts))

        val testObserver = viewModel.viewStateObservable.test()

        viewModel.onCreate(mock())
        testObserver
            .assertNoErrors()
            .assertValueAt(0, ListPostsViewState.ShowLoading)
    }


    @Test
    fun `Given the viewmodel created when the refresh button is clicked then load the posts list`() {

        whenever(postManager.getPosts()).thenReturn(Single.just(posts))

        val testObserver = viewModel.viewStateObservable.test()

        viewModel.onReloadClicked()
        testObserver
            .assertNoErrors()
            .assertValueAt(0, ListPostsViewState.ShowLoading)
    }

    @Test
    fun `Given an empty list of posts when viewModel is created then send DisplayEmptyListMessage`() {
        whenever(postManager.getPosts()).thenReturn(Single.just(emptyList()))

        val testObserver = viewModel.viewStateObservable.test()

        viewModel.onCreate(mock())

        val state = testObserver
            .assertNoErrors()
            .values()[1]

        assertThat(state is ListPostsViewState.DisplayEmptyListMessage).isTrue()
    }

    @Test
    fun `Given an error when loading the posts then send an error`() {
        val errorMsg = "errorMsg"
        whenever(postManager.getPosts()).thenReturn(Single.error(Throwable(errorMsg)))

        val testObserver = viewModel.viewStateObservable.test()

        viewModel.onCreate(mock())


        val state = testObserver
            .assertNoErrors()
            .values()[1]

        assertThat(state.cast<ListPostsViewState.Error>().error).isEqualTo(errorMsg)
    }

    @Test
    fun `Given no internet connexion when loading the comments then emit No internet action`() {
        whenever(postManager.getPosts()).thenReturn(Single.error(UnknownHostException()))

        val testObserver = viewModel.viewStateObservable.test()

        viewModel.onCreate(mock())

        testObserver
            .assertNoErrors()
            .assertValueAt(1, ListPostsViewState.NoInternet)
    }


    @Test
    fun `Given an actual list of posts when a row is clicked then emit a OpenPostDetail with the post`() {
        whenever(postManager.getPosts()).thenReturn(Single.just(posts))

        val testObserver = viewModel.viewStateObservable.test()
        val post = DataBuilder.providePost()

        viewModel.onRowClicked(post)

        val state = testObserver
            .assertNoErrors()
            .values()[0]
        assertThat(state.cast<ListPostsViewState.OpenPostDetail>().post).isEqualTo(post)
    }
}

internal fun <T> ListPostsViewState.cast(): T = this as T