package guillaume.agis.techtest.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import guillaume.agis.techtest.api.HttpErrorUtils
import guillaume.agis.techtest.api.io
import guillaume.agis.techtest.common.BaseViewModel
import guillaume.agis.techtest.model.Comment
import guillaume.agis.techtest.model.Post
import guillaume.agis.techtest.usecase.PostsUseCase
import javax.inject.Inject

/**
 * Viewmodel responsible for the business logic associated to the post detail view
 */
class PostDetailViewModel
@Inject constructor(
    private val postUseCase: PostsUseCase,
    private val httpErrorUtils: HttpErrorUtils
) : BaseViewModel<PostDetailViewState>() {

    private lateinit var post: Post
    private val comments: ArrayList<Comment> = ArrayList()

    /**
     * set the post to load the comments associated to it
     *  @param post post associated
     */
    fun setPost(post: Post) {
        this.post = post
        emitViewState(PostDetailViewState.RenderPost(post))
        loadComments(post.id)
    }


    /**
     * Emit a the SeeComments action when the comment button is clicked
     */
    fun onCommentBtnClicked() {
        emitViewState(PostDetailViewState.SeeComments(post, comments))
    }

    /**
     * Emit a the OpenEmail action when the email button is clicked
     */
    fun onEmailClicked() {
        emitViewState(PostDetailViewState.OpenEmail(email = post.user.email))
    }

    /**
     * Load comments list given a post id
     *  @param postId id of the post associated
     */
    private fun loadComments(postId: Int) {
        disposables.add(
            postUseCase.getCommentsByPostId(postId)
                .io()
                .subscribe({ comments ->
                    this.comments.clear()
                    this.comments.addAll(comments)
                    emitViewState(PostDetailViewState.DisplayCommentsNb(comments.size))
                }, this::postsErrors)
        )
    }

    /**
     * Emit the error to the view
     *  @param throwable throwable thrown
     */
    private fun postsErrors(throwable: Throwable) {

        when (httpErrorUtils.hasLostInternet(throwable)) {
            true -> emitViewState(PostDetailViewState.NoInternet)
            false -> emitViewState(PostDetailViewState.DisplayError(throwable.message))
        }
    }


    class Factory
    @Inject constructor(
        private val postUseCase: PostsUseCase,
        private val httpErrorUtils: HttpErrorUtils
    ) : ViewModelProvider.Factory {
        @SuppressWarnings("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return PostDetailViewModel(postUseCase, httpErrorUtils) as T
        }
    }
}