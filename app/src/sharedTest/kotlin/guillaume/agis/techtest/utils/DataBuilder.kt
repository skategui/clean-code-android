package guillaume.agis.techtest.utils

import androidx.annotation.VisibleForTesting
import com.google.gson.Gson
import guillaume.agis.techtest.model.Comment
import guillaume.agis.techtest.model.Post
import guillaume.agis.techtest.model.PostDao
import guillaume.agis.techtest.model.User

/**
 * Some data used in the tests
 */
object DataBuilder {

    private val gson = Gson()
    private const val userEmail = "gui@g.com"
    private const val title = "my_post"
    private const val body = "that's the body"
    private const val otherTitle = "my_post"
    private const val otherBody = "that's the body"

    @VisibleForTesting
    const val otherUserId = 42
    @VisibleForTesting
    const val userId = 12
    @VisibleForTesting
    const val postId1 = 42
    @VisibleForTesting
    const val postId2 = 23


    private val post = Post(
        user = buildUser(23, userEmail),
        id = 42,
        title = title,
        body = body
    )

    private val postDao = PostDao(
        userId = userId,
        id = 30,
        title = title,
        body = body
    )

    private val postDao2 = PostDao(
        userId = otherUserId,
        id = 31,
        title = otherTitle,
        body = otherBody
    )


    fun buildComment(postId: Int) = Comment(
        postId = postId,
        name = "comment name $postId",
        body = "body content$postId"
    )


    fun buildUser(userId: Int = 42, email: String = "") = User(
        id = userId,
        website = "http://www.hire-me-maybe.com",
        username = "skategui",
        email = email,
        phone = "21312-12301-2313"
    )

    fun providePostsDaoList(): List<PostDao> {
        return listOf(postDao, postDao2)
    }

    fun providePostsDaoListAsJson(): String {
        return gson.toJson(providePostsDaoList())
    }

    fun providePostsList(): List<Post> {
        return listOf(post)
    }

    fun provideCommentsList(): List<Comment> {
        return listOf(buildComment(postId1), buildComment(postId2))
    }

    fun providePost() = post
}