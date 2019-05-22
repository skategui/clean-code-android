package guillaume.agis.techtest.repo

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import guillaume.agis.techtest.api.PostResource
import guillaume.agis.techtest.model.Comment
import guillaume.agis.techtest.rule.BaseRule
import guillaume.agis.techtest.utils.DataBuilder
import io.reactivex.Single
import okhttp3.ResponseBody
import org.junit.Before
import org.junit.Test

class PostsRepositoryImplTest : BaseRule() {

    private val postResource = mock<PostResource>()

    private lateinit var manager: PostsRepositoryImpl

    private val postsList = DataBuilder.providePostsDaoList()


    @Before
    fun setUp() {
        manager = PostsRepositoryImpl(postResource)
        whenever(postResource.getPostsWithoutParsing()).thenReturn(
            Single.just(
                ResponseBody.create(
                    null,
                    DataBuilder.providePostsDaoListAsJson()
                )
            )
        )
    }

    @Test
    fun `When getting the posts list then get it`() {
        manager.getPosts()
            .test()
            .assertComplete()
            .assertNoErrors()
            .assertValue(postsList)
    }

    @Test
    fun `Given a postId when getting the comments then get the list of comments`() {

        val comment = DataBuilder.buildComment(DataBuilder.postId1)
        val comment2 = DataBuilder.buildComment(DataBuilder.postId2)

        whenever(postResource.getComments(comment.postId)).thenReturn(Single.just(listOf(comment)))
        whenever(postResource.getComments(comment2.postId)).thenReturn(Single.just(listOf(comment2)))

        val postIdWithoutCommentsAssociated = 213123

        whenever(postResource.getComments(postIdWithoutCommentsAssociated)).thenReturn(Single.just(emptyList()))

        getCommentsByPostId(comment.postId, listOf(comment))
        getCommentsByPostId(comment2.postId, listOf(comment2))
        getCommentsByPostId(postIdWithoutCommentsAssociated, emptyList())
    }


    private fun getCommentsByPostId(postId: Int, expected: List<Comment>) {
        manager.getCommentsByPostId(postId)
            .test()
            .assertComplete()
            .assertNoErrors()
            .assertValue(expected)
    }
}