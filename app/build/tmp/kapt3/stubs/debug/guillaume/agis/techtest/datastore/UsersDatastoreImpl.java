package guillaume.agis.techtest.datastore;

import java.lang.System;

/**
 * Responsible to store the user data locally, could use room in the future if we wish to have some consistency
 * For this test, just store in memory.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lguillaume/agis/techtest/datastore/UsersDatastoreImpl;", "Lguillaume/agis/techtest/datastore/UsersDatastore;", "()V", "users", "Ljava/util/ArrayList;", "Lguillaume/agis/techtest/model/User;", "Lkotlin/collections/ArrayList;", "addUser", "", "user", "get", "userId", "", "app_debug"})
public final class UsersDatastoreImpl implements guillaume.agis.techtest.datastore.UsersDatastore {
    private final java.util.ArrayList<guillaume.agis.techtest.model.User> users = null;
    
    /**
     * get user associated to a userId
     * @param userId id of the user to check if already loaded
     * @return  [User] user found, if any, null otherwise
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public guillaume.agis.techtest.model.User get(int userId) {
        return null;
    }
    
    /**
     * Add a user in the list of users already loaded, if not already in the list
     * @param user  user to add
     */
    @java.lang.Override()
    public void addUser(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.model.User user) {
    }
    
    @javax.inject.Inject()
    public UsersDatastoreImpl() {
        super();
    }
}