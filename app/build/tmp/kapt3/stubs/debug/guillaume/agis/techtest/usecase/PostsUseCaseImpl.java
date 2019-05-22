package guillaume.agis.techtest.usecase;

import java.lang.System;

/**
 * Post Use Case is responsible to manage all the business logic related to the Post
 * such as associated a user to a loaded post (in this example)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lguillaume/agis/techtest/usecase/PostsUseCaseImpl;", "Lguillaume/agis/techtest/usecase/PostsUseCase;", "usersUseCase", "Lguillaume/agis/techtest/usecase/UsersUseCase;", "postsRepository", "Lguillaume/agis/techtest/repo/PostsRepository;", "(Lguillaume/agis/techtest/usecase/UsersUseCase;Lguillaume/agis/techtest/repo/PostsRepository;)V", "createPostByByUserId", "Lio/reactivex/Single;", "Lguillaume/agis/techtest/model/Post;", "post", "Lguillaume/agis/techtest/model/PostDao;", "getCommentsByPostId", "", "Lguillaume/agis/techtest/model/Comment;", "postId", "", "getPosts", "app_debug"})
public final class PostsUseCaseImpl implements guillaume.agis.techtest.usecase.PostsUseCase {
    private final guillaume.agis.techtest.usecase.UsersUseCase usersUseCase = null;
    private final guillaume.agis.techtest.repo.PostsRepository postsRepository = null;
    
    /**
     * Get the posts list from the server
     * Use ConcatMap in order to keep the order
     * @return [Single] [List] [Post]  list of posts fetched from server
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<guillaume.agis.techtest.model.Post>> getPosts() {
        return null;
    }
    
    /**
     * Get the postId of comments given a post ID
     * @param postId id of the post to load
     * @return [Single] [List] [Comment]  list of comments associated to this post
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<guillaume.agis.techtest.model.Comment>> getCommentsByPostId(int postId) {
        return null;
    }
    
    /**
     * Create a post with its associated user given a postDao object
     * @return  [Post]  post object created
     */
    private final io.reactivex.Single<guillaume.agis.techtest.model.Post> createPostByByUserId(guillaume.agis.techtest.model.PostDao post) {
        return null;
    }
    
    @javax.inject.Inject()
    public PostsUseCaseImpl(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.usecase.UsersUseCase usersUseCase, @org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.repo.PostsRepository postsRepository) {
        super();
    }
}