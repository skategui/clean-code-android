package guillaume.agis.techtest.ui.list

import androidx.recyclerview.widget.RecyclerView
import guillaume.agis.techtest.model.Post
import io.reactivex.Observable

abstract class ListPostsAdapter : RecyclerView.Adapter<ListPostsAdapterImpl.PostViewHolder>() {

    abstract fun update(list: List<Post>)

    abstract fun getClickRow(): Observable<Post>
}
