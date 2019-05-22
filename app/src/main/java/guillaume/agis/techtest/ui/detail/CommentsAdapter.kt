package guillaume.agis.techtest.ui.detail

import androidx.recyclerview.widget.RecyclerView
import guillaume.agis.techtest.model.Comment


abstract class CommentsAdapter : RecyclerView.Adapter<CommentsAdapterImpl.PostViewHolder>() {

    abstract fun update(list: List<Comment>)
}
