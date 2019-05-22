package guillaume.agis.techtest.repo

import guillaume.agis.techtest.api.UserResource
import guillaume.agis.techtest.api.io
import guillaume.agis.techtest.model.User
import io.reactivex.Single
import javax.inject.Inject

/**
 * User repository is responsible to make all the requests to the server associated to the User
 *
 */
class UsersRepositoryImpl
@Inject constructor(private val userResource: UserResource) : UsersRepository {

    /**
     * Get the user from a user ID
     *  @param userId id of the user to load
     *  @return [Single] [User] user found
     */
    override fun getUserById(userId: Int): Single<User> {
        return userResource.getUserById(userId).io()
    }

}