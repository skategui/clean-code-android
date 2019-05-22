package guillaume.agis.techtest.usecase

import guillaume.agis.techtest.model.Comment
import guillaume.agis.techtest.model.Post
import guillaume.agis.techtest.model.PostDao
import guillaume.agis.techtest.repo.PostsRepository
import io.reactivex.Single
import javax.inject.Inject


/**
 * Post Use Case is responsible to manage all the business logic related to the Post
 * such as associated a user to a loaded post (in this example)
 */
class PostsUseCaseImpl
@Inject constructor(
    private val usersUseCase: UsersUseCase,
    private val postsRepository: PostsRepository
) : PostsUseCase {

    /**
     * Get the posts list from the server
     * Use ConcatMap in order to keep the order
     *  @return [Single] [List] [Post]  list of posts fetched from server
     */
    override fun getPosts(): Single<List<Post>> {
        return postsRepository.getPosts()
            .flattenAsObservable { it }
            .concatMapSingle(this::createPostByByUserId)
            .toList()
    }

    /**
     * Get the postId of comments given a post ID
     *  @param postId id of the post to load
     *  @return [Single] [List] [Comment]  list of comments associated to this post
     */
    override fun getCommentsByPostId(postId: Int): Single<List<Comment>> {
        return postsRepository.getCommentsByPostId(postId)
    }

    /**
     * Create a post with its associated user given a postDao object
     *  @return  [Post]  post object created
     */
    private fun createPostByByUserId(post: PostDao): Single<Post> {
        return usersUseCase.getUserById(post.userId).map { user ->
            Post(
                user = user,
                id = post.id,
                title = post.title,
                body = post.body
            )
        }
    }

}


