package guillaume.agis.techtest.repo;

import java.lang.System;

/**
 * Post repository is responsible to make all the requests to the server associated to the Post
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006H\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lguillaume/agis/techtest/repo/PostsRepositoryImpl;", "Lguillaume/agis/techtest/repo/PostsRepository;", "postResource", "Lguillaume/agis/techtest/api/PostResource;", "(Lguillaume/agis/techtest/api/PostResource;)V", "getCommentsByPostId", "Lio/reactivex/Single;", "", "Lguillaume/agis/techtest/model/Comment;", "postId", "", "getPosts", "Lguillaume/agis/techtest/model/PostDao;", "getPostsWithoutParsing", "app_debug"})
public final class PostsRepositoryImpl implements guillaume.agis.techtest.repo.PostsRepository {
    private final guillaume.agis.techtest.api.PostResource postResource = null;
    
    /**
     * Get the list of posts from the server
     *
     * @return [Single]  [List]  [PostDao] list of posts found
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<guillaume.agis.techtest.model.PostDao>> getPosts() {
        return null;
    }
    
    /**
     * Get the list of posts from the server, but does not map the response to the list of object directly
     *
     * @return [Single]  [List]  [PostDao] list of posts found
     */
    private final io.reactivex.Single<java.util.List<guillaume.agis.techtest.model.PostDao>> getPostsWithoutParsing() {
        return null;
    }
    
    /**
     * Get the list of comments given a post Id
     * @param postId id of the post to load
     * @return [Single]  [List]  [Comment] ist of comment found
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<guillaume.agis.techtest.model.Comment>> getCommentsByPostId(int postId) {
        return null;
    }
    
    @javax.inject.Inject()
    public PostsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.api.PostResource postResource) {
        super();
    }
}