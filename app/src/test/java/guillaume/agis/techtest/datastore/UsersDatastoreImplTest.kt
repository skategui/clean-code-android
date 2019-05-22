package guillaume.agis.techtest.datastore

import com.google.common.truth.Truth.assertThat
import guillaume.agis.techtest.rule.BaseRule
import guillaume.agis.techtest.utils.DataBuilder
import org.junit.Test

class UsersDatastoreImplTest : BaseRule() {
    private val usersDatastore = UsersDatastoreImpl()

    @Test
    fun `Given a userID when getting a user not stored then return null`() {
        assertThat(usersDatastore.get(userId)).isNull()
    }

    @Test
    fun `Given a userID when getting a user stored then return the user associated`() {


        val user = DataBuilder.buildUser(userId)

        usersDatastore.addUser(user)
        assertThat(usersDatastore.get(user.id)).isEqualTo(user)
    }

    companion object {
        private const val userId = 42
    }
}