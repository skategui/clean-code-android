package guillaume.agis.techtest.api

import guillaume.agis.techtest.model.Comment
import guillaume.agis.techtest.model.PostDao
import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Streaming

/**
 * Resources associated to the Post HTTP requests.
 */
interface PostResource {

    @GET("posts")
    fun getPosts(): Single<List<PostDao>>

    // see comment in the PostsRepositoryImpl, it proposes before performance/  use less memory :)
    @Streaming
    @GET("posts")
    fun getPostsWithoutParsing(): Single<ResponseBody>

    @GET("comments")
    fun getComments(@Query("postId") postId: Int): Single<List<Comment>>

}