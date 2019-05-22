package guillaume.agis.techtest.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH&\u00a8\u0006\u000b"}, d2 = {"Lguillaume/agis/techtest/ui/list/ListPostsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lguillaume/agis/techtest/ui/list/ListPostsAdapterImpl$PostViewHolder;", "()V", "getClickRow", "Lio/reactivex/Observable;", "Lguillaume/agis/techtest/model/Post;", "update", "", "list", "", "app_debug"})
public abstract class ListPostsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<guillaume.agis.techtest.ui.list.ListPostsAdapterImpl.PostViewHolder> {
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    java.util.List<guillaume.agis.techtest.model.Post> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<guillaume.agis.techtest.model.Post> getClickRow();
    
    public ListPostsAdapter() {
        super();
    }
}