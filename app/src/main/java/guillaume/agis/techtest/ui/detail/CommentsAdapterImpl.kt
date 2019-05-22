package guillaume.agis.techtest.ui.detail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import guillaume.agis.techtest.R
import guillaume.agis.techtest.model.Comment
import guillaume.agis.techtest.ui.utils.DiffCallback
import kotlinx.android.synthetic.main.item_comment.view.*
import kotlinx.android.synthetic.main.item_post.view.ivAvatar
import kotlinx.android.synthetic.main.item_post.view.tvBody
import javax.inject.Inject


/**
 * Display the list of comments in the recyclerview
 */
class CommentsAdapterImpl
@Inject constructor(private val diffCallback: DiffCallback) : CommentsAdapter() {

    private val comments = ArrayList<Comment>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comment, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holderHistory: PostViewHolder, position: Int) {
        holderHistory.update(comments[position])
    }

    override fun getItemCount() = comments.size

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun update(comment: Comment) = with(itemView) {
            ivAvatar.loadRandomAvatar()
            tvFullName.text = comment.name
            tvBody.text = comment.body
        }
    }


    /**
     * Verify if there are some changes between the current and the new lists and then update the recyclerview with the difference
     */
    override fun update(list: List<Comment>) {
        diffCallback.compareLists(this.comments, list)
        val differenceFound = DiffUtil.calculateDiff(diffCallback)
        this.comments.clear()
        this.comments.addAll(list)
        differenceFound.dispatchUpdatesTo(this)
    }
}
