package guillaume.agis.techtest.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsViewState;", "", "()V", "DisplayEmptyListMessage", "DisplayPostsList", "Error", "NoInternet", "OpenPostDetail", "ShowLoading", "Lguillaume/agis/techtest/ui/list/ListPostsViewState$DisplayPostsList;", "Lguillaume/agis/techtest/ui/list/ListPostsViewState$OpenPostDetail;", "Lguillaume/agis/techtest/ui/list/ListPostsViewState$Error;", "Lguillaume/agis/techtest/ui/list/ListPostsViewState$NoInternet;", "Lguillaume/agis/techtest/ui/list/ListPostsViewState$ShowLoading;", "Lguillaume/agis/techtest/ui/list/ListPostsViewState$DisplayEmptyListMessage;", "app_debug"})
public abstract class ListPostsViewState {
    
    private ListPostsViewState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsViewState$DisplayPostsList;", "Lguillaume/agis/techtest/ui/list/ListPostsViewState;", "posts", "", "Lguillaume/agis/techtest/model/Post;", "(Ljava/util/List;)V", "getPosts", "()Ljava/util/List;", "app_debug"})
    public static final class DisplayPostsList extends guillaume.agis.techtest.ui.list.ListPostsViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<guillaume.agis.techtest.model.Post> posts = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<guillaume.agis.techtest.model.Post> getPosts() {
            return null;
        }
        
        public DisplayPostsList(@org.jetbrains.annotations.NotNull()
        java.util.List<guillaume.agis.techtest.model.Post> posts) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsViewState$OpenPostDetail;", "Lguillaume/agis/techtest/ui/list/ListPostsViewState;", "post", "Lguillaume/agis/techtest/model/Post;", "(Lguillaume/agis/techtest/model/Post;)V", "getPost", "()Lguillaume/agis/techtest/model/Post;", "app_debug"})
    public static final class OpenPostDetail extends guillaume.agis.techtest.ui.list.ListPostsViewState {
        @org.jetbrains.annotations.NotNull()
        private final guillaume.agis.techtest.model.Post post = null;
        
        @org.jetbrains.annotations.NotNull()
        public final guillaume.agis.techtest.model.Post getPost() {
            return null;
        }
        
        public OpenPostDetail(@org.jetbrains.annotations.NotNull()
        guillaume.agis.techtest.model.Post post) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsViewState$Error;", "Lguillaume/agis/techtest/ui/list/ListPostsViewState;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "app_debug"})
    public static final class Error extends guillaume.agis.techtest.ui.list.ListPostsViewState {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String error = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getError() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.lang.String error) {
            super();
        }
        
        public Error() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsViewState$NoInternet;", "Lguillaume/agis/techtest/ui/list/ListPostsViewState;", "()V", "app_debug"})
    public static final class NoInternet extends guillaume.agis.techtest.ui.list.ListPostsViewState {
        public static final guillaume.agis.techtest.ui.list.ListPostsViewState.NoInternet INSTANCE = null;
        
        private NoInternet() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsViewState$ShowLoading;", "Lguillaume/agis/techtest/ui/list/ListPostsViewState;", "()V", "app_debug"})
    public static final class ShowLoading extends guillaume.agis.techtest.ui.list.ListPostsViewState {
        public static final guillaume.agis.techtest.ui.list.ListPostsViewState.ShowLoading INSTANCE = null;
        
        private ShowLoading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsViewState$DisplayEmptyListMessage;", "Lguillaume/agis/techtest/ui/list/ListPostsViewState;", "()V", "app_debug"})
    public static final class DisplayEmptyListMessage extends guillaume.agis.techtest.ui.list.ListPostsViewState {
        public static final guillaume.agis.techtest.ui.list.ListPostsViewState.DisplayEmptyListMessage INSTANCE = null;
        
        private DisplayEmptyListMessage() {
            super();
        }
    }
}