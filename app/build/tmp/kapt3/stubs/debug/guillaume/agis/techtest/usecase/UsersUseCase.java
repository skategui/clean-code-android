package guillaume.agis.techtest.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lguillaume/agis/techtest/usecase/UsersUseCase;", "", "getUserById", "Lio/reactivex/Single;", "Lguillaume/agis/techtest/model/User;", "userId", "", "app_debug"})
public abstract interface UsersUseCase {
    
    /**
     * Get the user from a user ID, from the server if not already fetched, or locally
     * @param userId id of the user to load
     * @return [Single] [User] user fetched
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<guillaume.agis.techtest.model.User> getUserById(int userId);
}