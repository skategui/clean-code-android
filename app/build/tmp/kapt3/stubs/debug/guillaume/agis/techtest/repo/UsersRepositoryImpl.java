package guillaume.agis.techtest.repo;

import java.lang.System;

/**
 * User repository is responsible to make all the requests to the server associated to the User
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lguillaume/agis/techtest/repo/UsersRepositoryImpl;", "Lguillaume/agis/techtest/repo/UsersRepository;", "userResource", "Lguillaume/agis/techtest/api/UserResource;", "(Lguillaume/agis/techtest/api/UserResource;)V", "getUserById", "Lio/reactivex/Single;", "Lguillaume/agis/techtest/model/User;", "userId", "", "app_debug"})
public final class UsersRepositoryImpl implements guillaume.agis.techtest.repo.UsersRepository {
    private final guillaume.agis.techtest.api.UserResource userResource = null;
    
    /**
     * Get the user from a user ID
     * @param userId id of the user to load
     * @return [Single] [User] user found
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<guillaume.agis.techtest.model.User> getUserById(int userId) {
        return null;
    }
    
    @javax.inject.Inject()
    public UsersRepositoryImpl(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.api.UserResource userResource) {
        super();
    }
}