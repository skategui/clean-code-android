package guillaume.agis.techtest.ui.customview;

import java.lang.System;

/**
 * Custom view to display the list of comments as a popup.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u001c\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\b\u0010\u001b\u001a\u00020\u0012H\u0002R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lguillaume/agis/techtest/ui/customview/CommentsListView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "commentsAdapter", "Lguillaume/agis/techtest/ui/detail/CommentsAdapter;", "getCommentsAdapter", "()Lguillaume/agis/techtest/ui/detail/CommentsAdapter;", "setCommentsAdapter", "(Lguillaume/agis/techtest/ui/detail/CommentsAdapter;)V", "hide", "", "init", "initRecyclerView", "openCommentsList", "title", "", "list", "", "Lguillaume/agis/techtest/model/Comment;", "setListeners", "app_debug"})
public final class CommentsListView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public guillaume.agis.techtest.ui.detail.CommentsAdapter commentsAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final guillaume.agis.techtest.ui.detail.CommentsAdapter getCommentsAdapter() {
        return null;
    }
    
    public final void setCommentsAdapter(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.ui.detail.CommentsAdapter p0) {
    }
    
    /**
     * init custom view
     */
    private final void init() {
    }
    
    /**
     * init recyclerview
     */
    private final void initRecyclerView() {
    }
    
    /**
     * drag n close listeners
     */
    private final void setListeners() {
    }
    
    /**
     * Hide popup
     */
    private final void hide() {
    }
    
    /**
     * display the list of comments
     * @param title title of the popup to display
     * @param list list of comments
     */
    public final void openCommentsList(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.util.List<guillaume.agis.techtest.model.Comment> list) {
    }
    
    public CommentsListView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public CommentsListView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CommentsListView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
}