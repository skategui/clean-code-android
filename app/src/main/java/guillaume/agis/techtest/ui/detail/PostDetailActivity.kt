package guillaume.agis.techtest.ui.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.annotation.VisibleForTesting
import androidx.lifecycle.ViewModelProviders
import com.airbnb.lottie.LottieDrawable.INFINITE
import com.airbnb.lottie.LottieDrawable.REVERSE
import guillaume.agis.techtest.R
import guillaume.agis.techtest.api.io
import guillaume.agis.techtest.common.BaseActivity
import guillaume.agis.techtest.model.Comment
import guillaume.agis.techtest.model.Post
import guillaume.agis.techtest.model.User
import kotlinx.android.synthetic.main.activity_post_detail.*
import javax.inject.Inject

/**
 * View associated to the detail of a post
 */
class PostDetailActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: PostDetailViewModel.Factory


    private lateinit var viewModel: PostDetailViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_detail)
        getPostFromIntent()
    }

    /**
     * Get the post from the intent , if not found close the view
     */
    private fun getPostFromIntent() {
        val post = intent?.extras?.get(POST_SELECTED) as Post?

        post?.run {
            initView()
            initViewModel(this)
        } ?: finish()
    }

    /**
     * Init the view
     */
    private fun initView() {
        initAnimation()
        initListeners()
        initToolbar()
    }

    /**
     * Init toolbar
     */
    private fun initToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle(0)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    /**
     * Init animation of the comment button to push the user to click on it
     */
    private fun initAnimation() {
        // set animation
        commentAnimation.repeatMode = REVERSE
        commentAnimation.repeatCount = INFINITE
        commentAnimation.playAnimation()
    }

    /**
     * init listeners
     */
    private fun initListeners() {
        llSeeComments.setOnClickListener { viewModel.onCommentBtnClicked() }
        tvEmail.setOnClickListener { viewModel.onEmailClicked() }
    }


    /**
     * init viewmodel with the post
     * @param post current post
     */
    private fun initViewModel(post: Post) {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(PostDetailViewModel::class.java)
        lifecycle.addObserver(viewModel)
        viewModel.setPost(post)
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
    private fun render(viewState: PostDetailViewState) {
        when (viewState) {
            is PostDetailViewState.RenderPost -> {
                renderPostInfo(viewState.post)
                renderProfileInfo(viewState.post.user)
            }
            is PostDetailViewState.DisplayCommentsNb -> renderCommentsSection(viewState.nbComment)
            is PostDetailViewState.NoInternet -> noInternet()
            is PostDetailViewState.DisplayError -> displayErrorMsg()
            is PostDetailViewState.OpenEmail -> openEmail(viewState.email)
            is PostDetailViewState.SeeComments -> seeComments(viewState.post, viewState.comments)
        }
    }

    /**
     * Render the section associated to the post info
     * @param post user to post the info from
     */
    private fun renderPostInfo(post: Post) {
        tvTitle.text = post.title
        tvBody.text = post.body
    }

    /**
     * Render the section associated to the user info
     * @param user user to display the info from
     */
    private fun renderProfileInfo(user: User) {
        ivAvatar.loadRoundedAvatar(user.id)
        tvFullName.text = user.username
        tvEmail.visibility = View.VISIBLE
    }

    /**
     * Render the section associated to the comments given the current state of the view
     * @param nbComment nb comment associated to this post
     */
    private fun renderCommentsSection(nbComment: Int) {
        if (nbComment == 0)
            llSeeComments.visibility = View.GONE
        else {
            tvCommentNbr.text = String.format(getString(R.string.post_detail_see_comments), nbComment)
            llSeeComments.visibility = View.VISIBLE

        }

    }


    /**
     * open the popup with the comments
     * @param post post current post, if provided
     * @param comments list of comments associated to the post
     */
    private fun seeComments(post: Post?, comments: List<Comment>) {
        post?.run { commentsList.openCommentsList(title, comments) }
    }

    /**
     * Inform the user to the error
     */
    private fun displayErrorMsg() {
        Toast.makeText(this, getString(R.string.error_try_again_later), Toast.LENGTH_LONG)
            .show()
    }

    /**
     * open Email app and prefill with the user email
     * @param email email of the user to prefill
     */
    private fun openEmail(email: String) {
        val emailIntent = Intent(Intent.ACTION_SEND)

        emailIntent.type = "plain/text"
        emailIntent.putExtra(Intent.EXTRA_EMAIL, listOf(email).toTypedArray())
        startActivity(Intent.createChooser(emailIntent, getString(R.string.send_email_title)))
    }


    /**
     * Inform the user to that he lost the internet connexion
     */
    private fun noInternet() {
        Toast.makeText(this, getString(R.string.lost_internet), Toast.LENGTH_LONG)
            .show()
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // handle arrow click here
        if (item.itemId === android.R.id.home) {
            finish()
        }

        return super.onOptionsItemSelected(item)
    }


    companion object {

        @VisibleForTesting
        const val POST_SELECTED = "post_selected"

        /**
         * Start the activity with the post associated to the view
         * @param context current context
         * @param post post associated to the view
         */
        fun start(context: Context, post: Post) {
            val intent = Intent(context, PostDetailActivity::class.java)
            intent.putExtra(POST_SELECTED, post)
            context.startActivity(intent)

        }
    }


}
