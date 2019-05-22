package guillaume.agis.techtest.usecase

import com.nhaarman.mockitokotlin2.*
import guillaume.agis.techtest.datastore.UsersDatastoreImpl
import guillaume.agis.techtest.model.User
import guillaume.agis.techtest.repo.UsersRepository
import guillaume.agis.techtest.rule.BaseRule
import guillaume.agis.techtest.utils.DataBuilder
import io.reactivex.Single
import org.junit.Before
import org.junit.Test

class UsersUseCaseImplTest : BaseRule() {

    private val usersRepository = mock<UsersRepository>()

    private lateinit var manager: UsersUseCaseImpl

    private val user = DataBuilder.buildUser(DataBuilder.userId)
    private val user2 = DataBuilder.buildUser(DataBuilder.otherUserId)

    @Before
    fun setUp() {
        manager = UsersUseCaseImpl(usersRepository, UsersDatastoreImpl())
        whenever(usersRepository.getUserById(eq(user.id))).thenReturn(Single.just(user))
        whenever(usersRepository.getUserById(eq(user2.id))).thenReturn(Single.just(user2))

    }

    @Test
    fun `Given a user never loaded before when getting a user  then fetch the user associated`() {
        assertGetUserById(user.id, user)
        assertGetUserById(user2.id, user2)

        verify(usersRepository, times(1)).getUserById(eq(user2.id))
        verify(usersRepository, times(1)).getUserById(eq(user.id))
    }


    @Test
    fun `Given a user already loaded when getting a user then use th previouly loaded user`() {
        // try to get this user 4x
        assertGetUserById(user.id, user)
        assertGetUserById(user.id, user)
        assertGetUserById(user.id, user)
        assertGetUserById(user.id, user)

        verify(usersRepository, times(1)).getUserById(eq(user.id))
    }

    private fun assertGetUserById(userId: Int, user: User) {
        manager.getUserById(userId)
            .test()
            .assertComplete()
            .assertNoErrors()
            .assertValue(user)
    }
}