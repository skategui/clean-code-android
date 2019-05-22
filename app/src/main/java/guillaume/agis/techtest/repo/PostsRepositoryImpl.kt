package guillaume.agis.techtest.repo

import guillaume.agis.techtest.api.PostResource
import guillaume.agis.techtest.api.io
import guillaume.agis.techtest.api.toObjectsList
import guillaume.agis.techtest.model.Comment
import guillaume.agis.techtest.model.PostDao
import io.reactivex.Single
import javax.inject.Inject


/**
 * Post repository is responsible to make all the requests to the server associated to the Post
 */
class PostsRepositoryImpl
@Inject constructor(private val postResource: PostResource) : PostsRepository {

    /**
     * Get the list of posts from the server
     *
     *  @return [Single]  [List]  [PostDao] list of posts found
     */
    override fun getPosts(): Single<List<PostDao>> {
        return getPostsWithoutParsing()

        /*

        Could use the simple getPosts() and map all the response inside list of Object directly but it's not very efficient
        mainly if the size of the json load (of the list of posts) will become huge.
        Current here is the benchmark for the getPosts() method

        Time to load : 138 ms
        Used memory: 376928 (376 KB)

        Using the getPostsWithoutParsing Does not map the response to the list an object, instead create the object
        only when parsed, on the fly.
        Even with a small list of posts, there are some improvements in the performance, and use less memory (-17%).

        Time to load: 15 ms
        Used memory: 311296 (311 KB)


        Source : https://proandroiddev.com/retrofitting-and-rxjaving-heavy-jsons-2c1fcfa6383c
         */

        //  return postResource.getPosts().io()
    }

    /**
     * Get the list of posts from the server, but does not map the response to the list of object directly
     *
     *  @return [Single]  [List]  [PostDao] list of posts found
     */
    private fun getPostsWithoutParsing(): Single<List<PostDao>> {
        return postResource.getPostsWithoutParsing()
            .io()
            .flatMap { body -> body.toObjectsList<PostDao>() }
    }


    /**
     * Get the list of comments given a post Id
     *  @param postId id of the post to load
     *  @return [Single]  [List]  [Comment] ist of comment found
     */
    override fun getCommentsByPostId(postId: Int): Single<List<Comment>> {
        return postResource.getComments(postId)
            .io()
    }

}
