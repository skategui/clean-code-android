package guillaume.agis.techtest.ui.detail;

import java.lang.System;

/**
 * View associated to the detail of a post
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\fH\u0002J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\'\u001a\u00020\f2\u0006\u0010(\u001a\u00020)H\u0002J \u0010*\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006/"}, d2 = {"Lguillaume/agis/techtest/ui/detail/PostDetailActivity;", "Lguillaume/agis/techtest/common/BaseActivity;", "()V", "viewModel", "Lguillaume/agis/techtest/ui/detail/PostDetailViewModel;", "viewModelFactory", "Lguillaume/agis/techtest/ui/detail/PostDetailViewModel$Factory;", "getViewModelFactory", "()Lguillaume/agis/techtest/ui/detail/PostDetailViewModel$Factory;", "setViewModelFactory", "(Lguillaume/agis/techtest/ui/detail/PostDetailViewModel$Factory;)V", "displayErrorMsg", "", "getPostFromIntent", "initAnimation", "initListeners", "initToolbar", "initView", "initViewModel", "post", "Lguillaume/agis/techtest/model/Post;", "noInternet", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "openEmail", "email", "", "render", "viewState", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState;", "renderCommentsSection", "nbComment", "", "renderPostInfo", "renderProfileInfo", "user", "Lguillaume/agis/techtest/model/User;", "seeComments", "comments", "", "Lguillaume/agis/techtest/model/Comment;", "Companion", "app_debug"})
public final class PostDetailActivity extends guillaume.agis.techtest.common.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public guillaume.agis.techtest.ui.detail.PostDetailViewModel.Factory viewModelFactory;
    private guillaume.agis.techtest.ui.detail.PostDetailViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POST_SELECTED = "post_selected";
    public static final guillaume.agis.techtest.ui.detail.PostDetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final guillaume.agis.techtest.ui.detail.PostDetailViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.ui.detail.PostDetailViewModel.Factory p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Get the post from the intent , if not found close the view
     */
    private final void getPostFromIntent() {
    }
    
    /**
     * Init the view
     */
    private final void initView() {
    }
    
    /**
     * Init toolbar
     */
    private final void initToolbar() {
    }
    
    /**
     * Init animation of the comment button to push the user to click on it
     */
    private final void initAnimation() {
    }
    
    /**
     * init listeners
     */
    private final void initListeners() {
    }
    
    /**
     * init viewmodel with the post
     * @param post current post
     */
    private final void initViewModel(guillaume.agis.techtest.model.Post post) {
    }
    
    /**
     * Render the view with the actions given the current state of the view
     * @param viewState current state of the view
     */
    private final void render(guillaume.agis.techtest.ui.detail.PostDetailViewState viewState) {
    }
    
    /**
     * Render the section associated to the post info
     * @param post user to post the info from
     */
    private final void renderPostInfo(guillaume.agis.techtest.model.Post post) {
    }
    
    /**
     * Render the section associated to the user info
     * @param user user to display the info from
     */
    private final void renderProfileInfo(guillaume.agis.techtest.model.User user) {
    }
    
    /**
     * Render the section associated to the comments given the current state of the view
     * @param nbComment nb comment associated to this post
     */
    private final void renderCommentsSection(int nbComment) {
    }
    
    /**
     * open the popup with the comments
     * @param post post current post, if provided
     * @param comments list of comments associated to the post
     */
    private final void seeComments(guillaume.agis.techtest.model.Post post, java.util.List<guillaume.agis.techtest.model.Comment> comments) {
    }
    
    /**
     * Inform the user to the error
     */
    private final void displayErrorMsg() {
    }
    
    /**
     * open Email app and prefill with the user email
     * @param email email of the user to prefill
     */
    private final void openEmail(java.lang.String email) {
    }
    
    /**
     * Inform the user to that he lost the internet connexion
     */
    private final void noInternet() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public PostDetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u00a8\u0006\f"}, d2 = {"Lguillaume/agis/techtest/ui/detail/PostDetailActivity$Companion;", "", "()V", "POST_SELECTED", "", "POST_SELECTED$annotations", "start", "", "context", "Landroid/content/Context;", "post", "Lguillaume/agis/techtest/model/Post;", "app_debug"})
    public static final class Companion {
        
        @androidx.annotation.VisibleForTesting()
        public static void POST_SELECTED$annotations() {
        }
        
        /**
         * Start the activity with the post associated to the view
         * @param context current context
         * @param post post associated to the view
         */
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        guillaume.agis.techtest.model.Post post) {
        }
        
        private Companion() {
            super();
        }
    }
}