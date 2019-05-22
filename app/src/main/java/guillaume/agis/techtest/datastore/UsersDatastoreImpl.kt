package guillaume.agis.techtest.datastore

import guillaume.agis.techtest.model.User
import javax.inject.Inject

/**
 * Responsible to store the user data locally, could use room in the future if we wish to have some consistency
 * For this test, just store in memory.
 */
class UsersDatastoreImpl @Inject constructor() : UsersDatastore {

    private val users: ArrayList<User> = arrayListOf()

    /**
     * get user associated to a userId
     *  @param userId id of the user to check if already loaded
     *  @return  [User] user found, if any, null otherwise
     */
    override fun get(userId: Int) = users.find { it.id == userId }


    /**
     * Add a user in the list of users already loaded, if not already in the list
     *  @param user  user to add
     */
    override fun addUser(user: User) {
        if (!users.contains(user))
            users.add(user)
    }

}

