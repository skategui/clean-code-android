package guillaume.agis.techtest.di

import dagger.Binds
import dagger.Module
import guillaume.agis.techtest.datastore.UsersDatastore
import guillaume.agis.techtest.datastore.UsersDatastoreImpl

@Module
abstract class UserDatastoreModule {

    @Binds
    abstract fun bindUserDatastore(usersDatastore: UsersDatastoreImpl): UsersDatastore

}