package guillaume.agis.techtest.ui.list;

import java.lang.System;

/**
 * Viewmodel responsible for the business logic associated to the list of posts view
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsViewModel;", "Lguillaume/agis/techtest/common/BaseViewModel;", "Lguillaume/agis/techtest/ui/list/ListPostsViewState;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "postUseCase", "Lguillaume/agis/techtest/usecase/PostsUseCase;", "httpErrorUtils", "Lguillaume/agis/techtest/api/HttpErrorUtils;", "(Lguillaume/agis/techtest/usecase/PostsUseCase;Lguillaume/agis/techtest/api/HttpErrorUtils;)V", "loadPosts", "", "onCreate", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onReloadClicked", "onRowClicked", "post", "Lguillaume/agis/techtest/model/Post;", "postsErrors", "throwable", "", "success", "posts", "", "Factory", "app_debug"})
public final class ListPostsViewModel extends guillaume.agis.techtest.common.BaseViewModel<guillaume.agis.techtest.ui.list.ListPostsViewState> implements androidx.lifecycle.DefaultLifecycleObserver {
    private final guillaume.agis.techtest.usecase.PostsUseCase postUseCase = null;
    private final guillaume.agis.techtest.api.HttpErrorUtils httpErrorUtils = null;
    
    /**
     * Associated to the lifecycle of the activity; load the list of posts when the activity
     * is created
     * @param owner LifecycleOwner
     */
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    /**
     * Reload posts list
     */
    public final void onReloadClicked() {
    }
    
    /**
     * Callback when a row of the list of posts is clicked; emit a OpenPostDetail
     * action with the post associated to the row clicked
     * @param post post associated to the row clicked
     */
    public final void onRowClicked(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.model.Post post) {
    }
    
    /**
     * Load the list of posts to display
     */
    private final void loadPosts() {
    }
    
    /**
     * Emit the list of posts if not empty, otherwise emit a message to the user to inform that the list is empty
     * @param posts Posts loaded
     */
    private final void success(java.util.List<guillaume.agis.techtest.model.Post> posts) {
    }
    
    /**
     * Error thrown from the request to lost the post. Emit the error with the message to the view
     */
    private final void postsErrors(java.lang.Throwable throwable) {
    }
    
    @javax.inject.Inject()
    public ListPostsViewModel(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.usecase.PostsUseCase postUseCase, @org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.api.HttpErrorUtils httpErrorUtils) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "postUseCase", "Lguillaume/agis/techtest/usecase/PostsUseCase;", "httpErrorUtils", "Lguillaume/agis/techtest/api/HttpErrorUtils;", "(Lguillaume/agis/techtest/usecase/PostsUseCase;Lguillaume/agis/techtest/api/HttpErrorUtils;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final guillaume.agis.techtest.usecase.PostsUseCase postUseCase = null;
        private final guillaume.agis.techtest.api.HttpErrorUtils httpErrorUtils = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.SuppressWarnings(value = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        @javax.inject.Inject()
        public Factory(@org.jetbrains.annotations.NotNull()
        guillaume.agis.techtest.usecase.PostsUseCase postUseCase, @org.jetbrains.annotations.NotNull()
        guillaume.agis.techtest.api.HttpErrorUtils httpErrorUtils) {
            super();
        }
    }
}