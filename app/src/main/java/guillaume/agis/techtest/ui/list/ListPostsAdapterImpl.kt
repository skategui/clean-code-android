package guillaume.agis.techtest.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import guillaume.agis.techtest.R
import guillaume.agis.techtest.model.Post
import guillaume.agis.techtest.ui.utils.DiffCallback
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.item_post.view.*
import javax.inject.Inject

/**
 * Display the list of posts in the recyclerview
 */
class ListPostsAdapterImpl
@Inject constructor(private val diffCallback: DiffCallback) : ListPostsAdapter() {

    private val posts = ArrayList<Post>()

    private val clickSubject = PublishSubject.create<Post>()

    override fun getClickRow(): Observable<Post> {
        return clickSubject
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holderHistory: PostViewHolder, position: Int) {
        holderHistory.update(posts[position], clickSubject)
    }

    override fun getItemCount() = posts.size

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun update(post: Post, clickSubject: PublishSubject<Post>) = with(itemView) {
            ivAvatar.loadRoundedAvatar(post.user.id)
            tvTitle.text = post.title
            tvBody.text = post.body
            setOnClickListener { clickSubject.onNext(post) }
        }
    }

    /**
     * Verify if there are some changes between the current and the new lists and then update the recyclerview with the difference
     */
    override fun update(list: List<Post>) {
        diffCallback.compareLists(this.posts, list)
        val differenceFound = DiffUtil.calculateDiff(diffCallback)
        this.posts.clear()
        this.posts.addAll(list)
        differenceFound.dispatchUpdatesTo(this)
    }
}
