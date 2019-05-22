package guillaume.agis.techtest.ui.detail;

import java.lang.System;

/**
 * Display the list of comments in the recyclerview
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0016\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lguillaume/agis/techtest/ui/detail/CommentsAdapterImpl;", "Lguillaume/agis/techtest/ui/detail/CommentsAdapter;", "diffCallback", "Lguillaume/agis/techtest/ui/utils/DiffCallback;", "(Lguillaume/agis/techtest/ui/utils/DiffCallback;)V", "comments", "Ljava/util/ArrayList;", "Lguillaume/agis/techtest/model/Comment;", "getItemCount", "", "onBindViewHolder", "", "holderHistory", "Lguillaume/agis/techtest/ui/detail/CommentsAdapterImpl$PostViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "list", "", "PostViewHolder", "app_debug"})
public final class CommentsAdapterImpl extends guillaume.agis.techtest.ui.detail.CommentsAdapter {
    private final java.util.ArrayList<guillaume.agis.techtest.model.Comment> comments = null;
    private final guillaume.agis.techtest.ui.utils.DiffCallback diffCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public guillaume.agis.techtest.ui.detail.CommentsAdapterImpl.PostViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.ui.detail.CommentsAdapterImpl.PostViewHolder holderHistory, int position) {
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
    java.util.List<guillaume.agis.techtest.model.Comment> list) {
    }
    
    @javax.inject.Inject()
    public CommentsAdapterImpl(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.ui.utils.DiffCallback diffCallback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lguillaume/agis/techtest/ui/detail/CommentsAdapterImpl$PostViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "update", "", "comment", "Lguillaume/agis/techtest/model/Comment;", "app_debug"})
    public static final class PostViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void update(@org.jetbrains.annotations.NotNull()
        guillaume.agis.techtest.model.Comment comment) {
        }
        
        public PostViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}