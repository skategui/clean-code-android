package guillaume.agis.techtest.usecase

import guillaume.agis.techtest.model.User
import io.reactivex.Single

interface UsersUseCase {
    /**
     * Get the user from a user ID, from the server if not already fetched, or locally
     *  @param userId id of the user to load
     *  @return [Single] [User] user fetched
     */
    fun getUserById(userId: Int): Single<User>
}

