package guillaume.agis.techtest.ui.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.davidmiguel.dragtoclose.DragListener
import guillaume.agis.techtest.MainApplication
import guillaume.agis.techtest.R
import guillaume.agis.techtest.model.Comment
import guillaume.agis.techtest.ui.detail.CommentsAdapter
import kotlinx.android.synthetic.main.custom_comments_list.view.*
import javax.inject.Inject

/**
 * Custom view to display the list of comments as a popup.
 */

class CommentsListView : FrameLayout {

    @Inject
    lateinit var commentsAdapter: CommentsAdapter

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init()
    }

    /**
     * init custom view
     */
    private fun init() {
        MainApplication.appComponent.inject(this)
        View.inflate(context, R.layout.custom_comments_list, this)
        hide()
        setListeners()
        initRecyclerView()
    }

    /**
     * init recyclerview
     */
    private fun initRecyclerView() {
        recyclerCommentsView.layoutManager = LinearLayoutManager(context)
        val layoutManager = LinearLayoutManager(context)
        recyclerCommentsView.layoutManager = layoutManager
        recyclerCommentsView.itemAnimator = DefaultItemAnimator()
        recyclerCommentsView.adapter = commentsAdapter
    }

    /**
     * drag n close listeners
     */
    private fun setListeners() {
        dragToClose.setDragListener(object : DragListener {
            override fun onStartDraggingView() {

            }

            override fun onDragging(dragOffset: Float) {

            }

            override fun onViewCosed() {
                hide()
            }
        })
    }


    /**
     * Hide popup
     */
    private fun hide() {
        visibility = View.GONE
    }


    /**
     * display the list of comments
     *  @param title title of the popup to display
     *  @param list list of comments
     */
    fun openCommentsList(title: String, list: List<Comment>) {
        popup_title.text = title
        commentsAdapter.update(list)
        visibility = View.VISIBLE
        dragToClose.openDraggableContainer()
    }
}
