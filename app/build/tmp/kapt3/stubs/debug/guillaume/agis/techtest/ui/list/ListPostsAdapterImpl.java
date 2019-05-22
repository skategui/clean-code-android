package guillaume.agis.techtest.ui.list;

import java.lang.System;

/**
 * Display the list of posts in the recyclerview
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0016\u0010\u0018\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u001aH\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsAdapterImpl;", "Lguillaume/agis/techtest/ui/list/ListPostsAdapter;", "diffCallback", "Lguillaume/agis/techtest/ui/utils/DiffCallback;", "(Lguillaume/agis/techtest/ui/utils/DiffCallback;)V", "clickSubject", "Lio/reactivex/subjects/PublishSubject;", "Lguillaume/agis/techtest/model/Post;", "kotlin.jvm.PlatformType", "posts", "Ljava/util/ArrayList;", "getClickRow", "Lio/reactivex/Observable;", "getItemCount", "", "onBindViewHolder", "", "holderHistory", "Lguillaume/agis/techtest/ui/list/ListPostsAdapterImpl$PostViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "list", "", "PostViewHolder", "app_debug"})
public final class ListPostsAdapterImpl extends guillaume.agis.techtest.ui.list.ListPostsAdapter {
    private final java.util.ArrayList<guillaume.agis.techtest.model.Post> posts = null;
    private final io.reactivex.subjects.PublishSubject<guillaume.agis.techtest.model.Post> clickSubject = null;
    private final guillaume.agis.techtest.ui.utils.DiffCallback diffCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<guillaume.agis.techtest.model.Post> getClickRow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public guillaume.agis.techtest.ui.list.ListPostsAdapterImpl.PostViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.ui.list.ListPostsAdapterImpl.PostViewHolder holderHistory, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    /**
     * Verify if there are some changes between the current and the new lists and then update the recyclerview with the difference
     */
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    java.util.List<guillaume.agis.techtest.model.Post> list) {
    }
    
    @javax.inject.Inject()
    public ListPostsAdapterImpl(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.ui.utils.DiffCallback diffCallback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a8\u0006\u000b"}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsAdapterImpl$PostViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "update", "", "post", "Lguillaume/agis/techtest/model/Post;", "clickSubject", "Lio/reactivex/subjects/PublishSubject;", "app_debug"})
    public static final class PostViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void update(@org.jetbrains.annotations.NotNull()
        guillaume.agis.techtest.model.Post post, @org.jetbrains.annotations.NotNull()
        io.reactivex.subjects.PublishSubject<guillaume.agis.techtest.model.Post> clickSubject) {
        }
        
        public PostViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}