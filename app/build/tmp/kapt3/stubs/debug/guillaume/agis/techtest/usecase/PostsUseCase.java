package guillaume.agis.techtest.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H&\u00a8\u0006\n"}, d2 = {"Lguillaume/agis/techtest/usecase/PostsUseCase;", "", "getCommentsByPostId", "Lio/reactivex/Single;", "", "Lguillaume/agis/techtest/model/Comment;", "postId", "", "getPosts", "Lguillaume/agis/techtest/model/Post;", "app_debug"})
public abstract interface PostsUseCase {
    
    /**
     * Get the posts list from the server
     * @return [Single] [List] [Post]  list of posts fetched
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<guillaume.agis.techtest.model.Post>> getPosts();
    
    /**
     * Get the postId of comments given a post ID
     * @param postId id of the post to load
     * @return [Single] [List] [Comment]  list of comments associated to this post
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<guillaume.agis.techtest.model.Comment>> getCommentsByPostId(int postId);
}