package guillaume.agis.techtest.ui.list

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbnb.lottie.LottieDrawable.INFINITE
import com.airbnb.lottie.LottieDrawable.REVERSE
import guillaume.agis.techtest.R
import guillaume.agis.techtest.api.io
import guillaume.agis.techtest.common.BaseActivity
import guillaume.agis.techtest.model.Post
import guillaume.agis.techtest.ui.detail.PostDetailActivity
import kotlinx.android.synthetic.main.activity_list_posts.*
import javax.inject.Inject

/**
 * View associated to the list of posts
 */
class ListPostsActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ListPostsViewModel.Factory

    private lateinit var viewModel: ListPostsViewModel

    @Inject
    lateinit var postsAdapter: ListPostsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_posts)
        init()
        initViewModel()
    }

    /**
     * Init the view
     */
    private fun init() {
        initAnimation()
        initRecyclerView()
        initListeners()
        initViews()
    }

    private fun initListeners() {
        tvReload.setOnClickListener { viewModel.onReloadClicked() }
    }

    /**
     * Init animation of the comment button to push the user to click on it
     */
    private fun initAnimation() {
        // set animation
        animation.repeatMode = REVERSE
        animation.repeatCount = INFINITE
    }

    /**
     * Init recycler view
     */
    private fun initRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = postsAdapter
        disposables.add(postsAdapter.getClickRow().subscribe { viewModel.onRowClicked(it) })
    }

    /**
     * init viewmodel
     */
    private fun initViewModel() {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ListPostsViewModel::class.java)
        lifecycle.addObserver(viewModel)
        disposables.add(
            viewModel.viewStateObservable
                .io()
                .subscribe(this::render, Throwable::printStackTrace)
        )
    }

    /**
     * Render the view with the actions given the current state of the view
     * @param viewState current state of the view
     */
    private fun render(viewState: ListPostsViewState) {
        initViews()
        when (viewState) {
            is ListPostsViewState.ShowLoading -> checkLoadingState(true)
            is ListPostsViewState.DisplayPostsList -> postsAdapter.update(viewState.posts)
            is ListPostsViewState.NoInternet -> noInternet()
            is ListPostsViewState.OpenPostDetail -> openPostDetail(viewState.post)
            is ListPostsViewState.Error -> displayError()
            is ListPostsViewState.DisplayEmptyListMessage -> displayEmptyListMessage()
        }
    }

    /**
     * Inform the user to that the list of posts is empty
     */
    private fun displayEmptyListMessage() {
        llState.visibility = View.VISIBLE
        animation.setAnimation(R.raw.empty_list_animation)
        tvStateTitle.text = getString(R.string.error_no_post_available)
        animation.playAnimation()
        hideRecyclerView()
    }


    /**
     * Inform the user to the error
     */
    private fun displayError() {
        llState.visibility = View.VISIBLE
        animation.setAnimation(R.raw.error_animation)
        tvStateTitle.text = getString(R.string.error_try_again_later)
        animation.playAnimation()
        hideRecyclerView()
    }

    /**
     * put the views in their original state
     */
    private fun initViews() {
        checkLoadingState(false)
        animation.clearAnimation()
        recyclerView.visibility = View.VISIBLE
        tvReload.visibility = View.GONE
    }

    /**
     * Check the state of the loading animation
     * @param isLoading true if the request is still loading, false otherwise
     */
    private fun checkLoadingState(isLoading: Boolean) {
        if (isLoading) {
            animation.setAnimation(R.raw.loading_animation)
            animation.playAnimation()
            tvStateTitle.text = getString(R.string.loading_in_progress)
            llState.visibility = View.VISIBLE
            hideRecyclerView()
        } else {
            llState.visibility = View.GONE
        }
    }

    /**
     * Inform the user to that he lost the internet connexion
     */
    private fun noInternet() {
        llState.visibility = View.VISIBLE
        tvStateTitle.text = getString(R.string.error_no_internet_connexion)
        animation.setAnimation(R.raw.error_animation)
        tvReload.visibility = View.VISIBLE
        animation.playAnimation()
        hideRecyclerView()
    }

    /**
     * hide recycler view
     */
    private fun hideRecyclerView() {
        recyclerView.visibility = View.INVISIBLE
    }

    /**
     * open the detail of a post in the different view
     * @param post post  to display the detail from
     */
    private fun openPostDetail(post: Post) {
        PostDetailActivity.start(this, post)
    }
}
