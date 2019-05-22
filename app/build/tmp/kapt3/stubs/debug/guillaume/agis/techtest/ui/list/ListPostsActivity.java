package guillaume.agis.techtest.ui.list;

import java.lang.System;

/**
 * View associated to the list of posts
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\u0012\u0010\u001f\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\'H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006("}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsActivity;", "Lguillaume/agis/techtest/common/BaseActivity;", "()V", "postsAdapter", "Lguillaume/agis/techtest/ui/list/ListPostsAdapter;", "getPostsAdapter", "()Lguillaume/agis/techtest/ui/list/ListPostsAdapter;", "setPostsAdapter", "(Lguillaume/agis/techtest/ui/list/ListPostsAdapter;)V", "viewModel", "Lguillaume/agis/techtest/ui/list/ListPostsViewModel;", "viewModelFactory", "Lguillaume/agis/techtest/ui/list/ListPostsViewModel$Factory;", "getViewModelFactory", "()Lguillaume/agis/techtest/ui/list/ListPostsViewModel$Factory;", "setViewModelFactory", "(Lguillaume/agis/techtest/ui/list/ListPostsViewModel$Factory;)V", "checkLoadingState", "", "isLoading", "", "displayEmptyListMessage", "displayError", "hideRecyclerView", "init", "initAnimation", "initListeners", "initRecyclerView", "initViewModel", "initViews", "noInternet", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openPostDetail", "post", "Lguillaume/agis/techtest/model/Post;", "render", "viewState", "Lguillaume/agis/techtest/ui/list/ListPostsViewState;", "app_debug"})
public final class ListPostsActivity extends guillaume.agis.techtest.common.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public guillaume.agis.techtest.ui.list.ListPostsViewModel.Factory viewModelFactory;
    private guillaume.agis.techtest.ui.list.ListPostsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public guillaume.agis.techtest.ui.list.ListPostsAdapter postsAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final guillaume.agis.techtest.ui.list.ListPostsViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.ui.list.ListPostsViewModel.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final guillaume.agis.techtest.ui.list.ListPostsAdapter getPostsAdapter() {
        return null;
    }
    
    public final void setPostsAdapter(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.ui.list.ListPostsAdapter p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Init the view
     */
    private final void init() {
    }
    
    private final void initListeners() {
    }
    
    /**
     * Init animation of the comment button to push the user to click on it
     */
    private final void initAnimation() {
    }
    
    /**
     * Init recycler view
     */
    private final void initRecyclerView() {
    }
    
    /**
     * init viewmodel
     */
    private final void initViewModel() {
    }
    
    /**
     * Render the view with the actions given the current state of the view
     * @param viewState current state of the view
     */
    private final void render(guillaume.agis.techtest.ui.list.ListPostsViewState viewState) {
    }
    
    /**
     * Inform the user to that the list of posts is empty
     */
    private final void displayEmptyListMessage() {
    }
    
    /**
     * Inform the user to the error
     */
    private final void displayError() {
    }
    
    /**
     * put the views in their original state
     */
    private final void initViews() {
    }
    
    /**
     * Check the state of the loading animation
     * @param isLoading true if the request is still loading, false otherwise
     */
    private final void checkLoadingState(boolean isLoading) {
    }
    
    /**
     * Inform the user to that he lost the internet connexion
     */
    private final void noInternet() {
    }
    
    /**
     * hide recycler view
     */
    private final void hideRecyclerView() {
    }
    
    /**
     * open the detail of a post in the different view
     * @param post post  to display the detail from
     */
    private final void openPostDetail(guillaume.agis.techtest.model.Post post) {
    }
    
    public ListPostsActivity() {
        super();
    }
}