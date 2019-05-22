package guillaume.agis.techtest.usecase;

import java.lang.System;

/**
 * User UseCae is responsible to manage all the business logic related to the User
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lguillaume/agis/techtest/usecase/UsersUseCaseImpl;", "Lguillaume/agis/techtest/usecase/UsersUseCase;", "usersRepository", "Lguillaume/agis/techtest/repo/UsersRepository;", "usersDatastore", "Lguillaume/agis/techtest/datastore/UsersDatastore;", "(Lguillaume/agis/techtest/repo/UsersRepository;Lguillaume/agis/techtest/datastore/UsersDatastore;)V", "getUserById", "Lio/reactivex/Single;", "Lguillaume/agis/techtest/model/User;", "userId", "", "app_debug"})
public final class UsersUseCaseImpl implements guillaume.agis.techtest.usecase.UsersUseCase {
    private final guillaume.agis.techtest.repo.UsersRepository usersRepository = null;
    private final guillaume.agis.techtest.datastore.UsersDatastore usersDatastore = null;
    
    /**
     * Get the user from a user ID, from the server if not already fetched, or locally from the datastore
     * @param userId id of the user to load
     * @return [Single] [User] user found, or an error if user not found
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<guillaume.agis.techtest.model.User> getUserById(int userId) {
        return null;
    }
    
    @javax.inject.Inject()
    public UsersUseCaseImpl(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.repo.UsersRepository usersRepository, @org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.datastore.UsersDatastore usersDatastore) {
        super();
    }
}