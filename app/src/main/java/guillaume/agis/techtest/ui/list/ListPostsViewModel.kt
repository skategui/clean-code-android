package guillaume.agis.techtest.ui.list

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import guillaume.agis.techtest.api.HttpErrorUtils
import guillaume.agis.techtest.api.io
import guillaume.agis.techtest.common.BaseViewModel
import guillaume.agis.techtest.model.Post
import guillaume.agis.techtest.usecase.PostsUseCase
import javax.inject.Inject


/**
 * Viewmodel responsible for the business logic associated to the list of posts view
 */
class ListPostsViewModel
@Inject constructor(
    private val postUseCase: PostsUseCase,
    private val httpErrorUtils: HttpErrorUtils
) : BaseViewModel<ListPostsViewState>(),
    DefaultLifecycleObserver {

    /**
     * Associated to the lifecycle of the activity; load the list of posts when the activity
     * is created
     *  @param owner LifecycleOwner
     */
    override fun onCreate(owner: LifecycleOwner) {
        loadPosts()
    }


    /**
     * Reload posts list
     */
    fun onReloadClicked() {
        loadPosts()
    }

    /**
     * Callback when a row of the list of posts is clicked; emit a OpenPostDetail
     * action with the post associated to the row clicked
     *  @param post post associated to the row clicked
     */
    fun onRowClicked(post: Post) {
        emitViewState(ListPostsViewState.OpenPostDetail(post))
    }

    /**
     * Load the list of posts to display
     */
    private fun loadPosts() {
        disposables.add(
            postUseCase.getPosts()
                .doOnSubscribe { emitViewState(ListPostsViewState.ShowLoading) }
                .io()
                .subscribe(this::success, this::postsErrors)
        )
    }

    /**
     * Emit the list of posts if not empty, otherwise emit a message to the user to inform that the list is empty
     *  @param posts Posts loaded
     */
    private fun success(posts: List<Post>) {
        if (posts.isEmpty())
            emitViewState(ListPostsViewState.DisplayEmptyListMessage)
        else
            emitViewState(ListPostsViewState.DisplayPostsList(posts))
    }

    /**
     * Error thrown from the request to lost the post. Emit the error with the message to the view
     */
    private fun postsErrors(throwable: Throwable) {
        when (httpErrorUtils.hasLostInternet(throwable)) {
            true -> emitViewState(ListPostsViewState.NoInternet)
            false -> emitViewState(ListPostsViewState.Error(throwable.message))
        }
    }


    class Factory
    @Inject constructor(
        private val postUseCase: PostsUseCase,
        private val httpErrorUtils: HttpErrorUtils
    ) : ViewModelProvider.Factory {
        @SuppressWarnings("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return ListPostsViewModel(postUseCase, httpErrorUtils) as T
        }
    }
}