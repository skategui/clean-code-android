package guillaume.agis.techtest.repo

import com.nhaarman.mockitokotlin2.*
import guillaume.agis.techtest.api.UserResource
import guillaume.agis.techtest.model.User
import guillaume.agis.techtest.rule.BaseRule
import guillaume.agis.techtest.utils.DataBuilder
import io.reactivex.Single
import org.junit.Before
import org.junit.Test

class UsersRepositoryImplTest : BaseRule() {

    private val userResource = mock<UserResource>()

    private lateinit var repository: UsersRepositoryImpl

    @Before
    fun setUp() {

        val user = DataBuilder.buildUser(DataBuilder.userId)
        val user2 = DataBuilder.buildUser(DataBuilder.otherUserId)

        repository = UsersRepositoryImpl(userResource)
        whenever(userResource.getUserById(eq(DataBuilder.userId))).thenReturn(Single.just(user))
        whenever(userResource.getUserById(eq(DataBuilder.otherUserId))).thenReturn(Single.just(user2))

    }

    @Test
    fun `Given a userID when getting a user then get the user associated`() {

        val user = DataBuilder.buildUser(DataBuilder.userId)
        val user2 = DataBuilder.buildUser(DataBuilder.otherUserId)

        assertGetUserById(user.id, user)
        assertGetUserById(user2.id, user2)

        verify(userResource, times(1)).getUserById(eq(user.id))
        verify(userResource, times(1)).getUserById(eq(user2.id))
    }


    private fun assertGetUserById(userId: Int, user: User) {
        repository.getUserById(userId)
            .test()
            .assertComplete()
            .assertNoErrors()
            .assertValue(user)
    }
}