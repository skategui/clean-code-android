package guillaume.agis.techtest.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lguillaume/agis/techtest/ui/detail/PostDetailViewState;", "", "()V", "DisplayCommentsNb", "DisplayError", "NoInternet", "OpenEmail", "RenderPost", "SeeComments", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState$RenderPost;", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState$DisplayCommentsNb;", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState$DisplayError;", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState$OpenEmail;", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState$SeeComments;", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState$NoInternet;", "app_debug"})
public abstract class PostDetailViewState {
    
    private PostDetailViewState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lguillaume/agis/techtest/ui/detail/PostDetailViewState$RenderPost;", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState;", "post", "Lguillaume/agis/techtest/model/Post;", "(Lguillaume/agis/techtest/model/Post;)V", "getPost", "()Lguillaume/agis/techtest/model/Post;", "app_debug"})
    public static final class RenderPost extends guillaume.agis.techtest.ui.detail.PostDetailViewState {
        @org.jetbrains.annotations.NotNull()
        private final guillaume.agis.techtest.model.Post post = null;
        
        @org.jetbrains.annotations.NotNull()
        public final guillaume.agis.techtest.model.Post getPost() {
            return null;
        }
        
        public RenderPost(@org.jetbrains.annotations.NotNull()
        guillaume.agis.techtest.model.Post post) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lguillaume/agis/techtest/ui/detail/PostDetailViewState$DisplayCommentsNb;", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState;", "nbComment", "", "(I)V", "getNbComment", "()I", "app_debug"})
    public static final class DisplayCommentsNb extends guillaume.agis.techtest.ui.detail.PostDetailViewState {
        private final int nbComment = 0;
        
        public final int getNbComment() {
            return 0;
        }
        
        public DisplayCommentsNb(int nbComment) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lguillaume/agis/techtest/ui/detail/PostDetailViewState$DisplayError;", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "app_debug"})
    public static final class DisplayError extends guillaume.agis.techtest.ui.detail.PostDetailViewState {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String error = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getError() {
            return null;
        }
        
        public DisplayError(@org.jetbrains.annotations.Nullable()
        java.lang.String error) {
            super();
        }
        
        public DisplayError() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lguillaume/agis/techtest/ui/detail/PostDetailViewState$OpenEmail;", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState;", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "app_debug"})
    public static final class OpenEmail extends guillaume.agis.techtest.ui.detail.PostDetailViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String email = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmail() {
            return null;
        }
        
        public OpenEmail(@org.jetbrains.annotations.NotNull()
        java.lang.String email) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lguillaume/agis/techtest/ui/detail/PostDetailViewState$SeeComments;", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState;", "post", "Lguillaume/agis/techtest/model/Post;", "comments", "", "Lguillaume/agis/techtest/model/Comment;", "(Lguillaume/agis/techtest/model/Post;Ljava/util/List;)V", "getComments", "()Ljava/util/List;", "getPost", "()Lguillaume/agis/techtest/model/Post;", "app_debug"})
    public static final class SeeComments extends guillaume.agis.techtest.ui.detail.PostDetailViewState {
        @org.jetbrains.annotations.NotNull()
        private final guillaume.agis.techtest.model.Post post = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<guillaume.agis.techtest.model.Comment> comments = null;
        
        @org.jetbrains.annotations.NotNull()
        public final guillaume.agis.techtest.model.Post getPost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<guillaume.agis.techtest.model.Comment> getComments() {
            return null;
        }
        
        public SeeComments(@org.jetbrains.annotations.NotNull()
        guillaume.agis.techtest.model.Post post, @org.jetbrains.annotations.NotNull()
        java.util.List<guillaume.agis.techtest.model.Comment> comments) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lguillaume/agis/techtest/ui/detail/PostDetailViewState$NoInternet;", "Lguillaume/agis/techtest/ui/detail/PostDetailViewState;", "()V", "app_debug"})
    public static final class NoInternet extends guillaume.agis.techtest.ui.detail.PostDetailViewState {
        public static final guillaume.agis.techtest.ui.detail.PostDetailViewState.NoInternet INSTANCE = null;
        
        private NoInternet() {
            super();
        }
    }
}