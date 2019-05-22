package guillaume.agis.techtest.ui.detail

import guillaume.agis.techtest.model.Comment
import guillaume.agis.techtest.model.Post


// states possible of the  post detail view
sealed class PostDetailViewState {
    class RenderPost(val post: Post) : PostDetailViewState()
    class DisplayCommentsNb(val nbComment: Int) : PostDetailViewState()
    class DisplayError(val error: String? = "") : PostDetailViewState()
    class OpenEmail(val email: String) : PostDetailViewState()
    class SeeComments(val post: Post, val comments: List<Comment>) : PostDetailViewState()
    object NoInternet : PostDetailViewState()
}