package guillaume.agis.techtest.ui.detail;

import java.lang.System;

/**
 * Viewmodel responsible for the business logic associated to the post detail view
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rR\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lguillaume/agis/techtest/ui/detail/PostDetailViewModel;", "Lguillaume/agis/techtest/common/BaseViewModel;", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState;", "postUseCase", "Lguillaume/agis/techtest/usecase/PostsUseCase;", "httpErrorUtils", "Lguillaume/agis/techtest/api/HttpErrorUtils;", "(Lguillaume/agis/techtest/usecase/PostsUseCase;Lguillaume/agis/techtest/api/HttpErrorUtils;)V", "comments", "Ljava/util/ArrayList;", "Lguillaume/agis/techtest/model/Comment;", "Lkotlin/collections/ArrayList;", "post", "Lguillaume/agis/techtest/model/Post;", "loadComments", "", "postId", "", "onCommentBtnClicked", "onEmailClicked", "postsErrors", "throwable", "", "setPost", "Factory", "app_debug"})
public final class PostDetailViewModel extends guillaume.agis.techtest.common.BaseViewModel<guillaume.agis.techtest.ui.detail.PostDetailViewState> {
    private guillaume.agis.techtest.model.Post post;
    private final java.util.ArrayList<guillaume.agis.techtest.model.Comment> comments = null;
    private final guillaume.agis.techtest.usecase.PostsUseCase postUseCase = null;
    private final guillaume.agis.techtest.api.HttpErrorUtils httpErrorUtils = null;
    
    /**
     * set the post to load the comments associated to it
     * @param post post associated
     */
    public final void setPost(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.model.Post post) {
    }
    
    /**
     * Emit a the SeeComments action when the comment button is clicked
     */
    public final void onCommentBtnClicked() {
    }
    
    /**
     * Emit a the OpenEmail action when the email button is clicked
     */
    public final void onEmailClicked() {
    }
    
    /**
     * Load comments list given a post id
     * @param postId id of the post associated
     */
    private final void loadComments(int postId) {
    }
    
    /**
     * Emit the error to the view
     * @param throwable throwable thrown
     */
    private final void postsErrors(java.lang.Throwable throwable) {
    }
    
    @javax.inject.Inject()
    public PostDetailViewModel(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.usecase.PostsUseCase postUseCase, @org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.api.HttpErrorUtils httpErrorUtils) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lguillaume/agis/techtest/ui/detail/PostDetailViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "postUseCase", "Lguillaume/agis/techtest/usecase/PostsUseCase;", "httpErrorUtils", "Lguillaume/agis/techtest/api/HttpErrorUtils;", "(Lguillaume/agis/techtest/usecase/PostsUseCase;Lguillaume/agis/techtest/api/HttpErrorUtils;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
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