package guillaume.agis.techtest.usecase

import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import guillaume.agis.techtest.model.Comment
import guillaume.agis.techtest.model.Post
import guillaume.agis.techtest.repo.PostsRepository
import guillaume.agis.techtest.rule.BaseRule
import guillaume.agis.techtest.utils.DataBuilder
import io.reactivex.Single
import org.junit.Before
import org.junit.Test

class PostsUseCaseImplTest : BaseRule() {

    private val usersManager = mock<UsersUseCase>()
    private val postsRepository = mock<PostsRepository>()

    private lateinit var manager: PostsUseCaseImpl

    private val user = DataBuilder.buildUser()
    private val postsDao = DataBuilder.providePostsDaoList()

    @Before
    fun setUp() {
        manager = PostsUseCaseImpl(usersManager, postsRepository)

        whenever(usersManager.getUserById(any())).thenReturn(Single.just(user))
        whenever(postsRepository.getPosts()).thenReturn(Single.just(postsDao))
    }

    @Test
    fun `Given a list of PostDao when getting the posts then convert to a list of Post`() {

        val postDao = postsDao[0]
        val postDao2 = postsDao[1]

        manager.getPosts()
            .test()
            .assertComplete()
            .assertNoErrors()
            .assertValue(
                listOf(
                    Post(user = user, id = postDao.id, title = postDao.title, body = postDao.body),
                    Post(user = user, id = postDao2.id, title = postDao2.title, body = postDao2.body)
                )
            )
    }

    @Test
    fun `Given a potId when getting the comments then get the list of comments`() {

        val comment = DataBuilder.buildComment(DataBuilder.postId2)

        whenever(postsRepository.getCommentsByPostId(eq(DataBuilder.postId1))).thenReturn(Single.just(emptyList()))
        whenever(postsRepository.getCommentsByPostId(eq(comment.postId))).thenReturn(Single.just(listOf(comment)))

        getCommentsByPostId(DataBuilder.postId1, emptyList())
        getCommentsByPostId(comment.postId, listOf(comment))
    }


    private fun getCommentsByPostId(postId: Int, expected: List<Comment>) {
        manager.getCommentsByPostId(postId)
            .test()
            .assertComplete()
            .assertNoErrors()
            .assertValue(expected)
    }
}