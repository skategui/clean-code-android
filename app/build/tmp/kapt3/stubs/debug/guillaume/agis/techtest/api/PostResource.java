package guillaume.agis.techtest.api;

import java.lang.System;

/**
 * Resources associated to the Post HTTP requests.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\'\u00a8\u0006\f"}, d2 = {"Lguillaume/agis/techtest/api/PostResource;", "", "getComments", "Lio/reactivex/Single;", "", "Lguillaume/agis/techtest/model/Comment;", "postId", "", "getPosts", "Lguillaume/agis/techtest/model/PostDao;", "getPostsWithoutParsing", "Lokhttp3/ResponseBody;", "app_debug"})
public abstract interface PostResource {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "posts")
    public abstract io.reactivex.Single<java.util.List<guillaume.agis.techtest.model.PostDao>> getPosts();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "posts")
    @retrofit2.http.Streaming()
    public abstract io.reactivex.Single<okhttp3.ResponseBody> getPostsWithoutParsing();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "comments")
    public abstract io.reactivex.Single<java.util.List<guillaume.agis.techtest.model.Comment>> getComments(@retrofit2.http.Query(value = "postId")
    int postId);
}