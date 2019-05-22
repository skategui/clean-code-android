package guillaume.agis.techtest.datastore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lguillaume/agis/techtest/datastore/UsersDatastore;", "", "addUser", "", "user", "Lguillaume/agis/techtest/model/User;", "get", "userId", "", "app_debug"})
public abstract interface UsersDatastore {
    
    /**
     * Verify if the user has already been fetched for the server or not
     * @param userId id of the user to check if already loaded
     * @return [User] user found, if any, null otherwise
     */
    @org.jetbrains.annotations.Nullable()
    public abstract guillaume.agis.techtest.model.User get(int userId);
    
    /**
     * Add a user in the list of users already loaded, if not already in the list
     * @param user  user to add
     */
    public abstract void addUser(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.model.User user);
}