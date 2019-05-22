package guillaume.agis.techtest.datastore

import guillaume.agis.techtest.model.User

interface UsersDatastore {

    /**
     * Verify if the user has already been fetched for the server or not
     *  @param userId id of the user to check if already loaded
     *  @return [User] user found, if any, null otherwise
     */
    fun get(userId: Int) : User?

    /**
     * Add a user in the list of users already loaded, if not already in the list
     *  @param user  user to add
     */
    fun addUser(user: User)
}

