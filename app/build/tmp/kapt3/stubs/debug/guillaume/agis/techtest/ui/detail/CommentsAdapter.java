package guillaume.agis.techtest.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&\u00a8\u0006\t"}, d2 = {"Lguillaume/agis/techtest/ui/detail/CommentsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lguillaume/agis/techtest/ui/detail/CommentsAdapterImpl$PostViewHolder;", "()V", "update", "", "list", "", "Lguillaume/agis/techtest/model/Comment;", "app_debug"})
public abstract class CommentsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<guillaume.agis.techtest.ui.detail.CommentsAdapterImpl.PostViewHolder> {
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    java.util.List<guillaume.agis.techtest.model.Comment> list);
    
    public CommentsAdapter() {
        super();
    }
}