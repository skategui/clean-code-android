// Generated by Dagger (https://google.github.io/dagger).
package guillaume.agis.techtest.usecase;

import dagger.internal.Factory;
import guillaume.agis.techtest.datastore.UsersDatastore;
import guillaume.agis.techtest.repo.UsersRepository;
import javax.inject.Provider;

public final class UsersUseCaseImpl_Factory implements Factory<UsersUseCaseImpl> {
  private final Provider<UsersRepository> usersRepositoryProvider;

  private final Provider<UsersDatastore> usersDatastoreProvider;

  public UsersUseCaseImpl_Factory(
      Provider<UsersRepository> usersRepositoryProvider,
      Provider<UsersDatastore> usersDatastoreProvider) {
    this.usersRepositoryProvider = usersRepositoryProvider;
    this.usersDatastoreProvider = usersDatastoreProvider;
  }

  @Override
  public UsersUseCaseImpl get() {
    return provideInstance(usersRepositoryProvider, usersDatastoreProvider);
  }

  public static UsersUseCaseImpl provideInstance(
      Provider<UsersRepository> usersRepositoryProvider,
      Provider<UsersDatastore> usersDatastoreProvider) {
    return new UsersUseCaseImpl(usersRepositoryProvider.get(), usersDatastoreProvider.get());
  }

  public static UsersUseCaseImpl_Factory create(
      Provider<UsersRepository> usersRepositoryProvider,
      Provider<UsersDatastore> usersDatastoreProvider) {
    return new UsersUseCaseImpl_Factory(usersRepositoryProvider, usersDatastoreProvider);
  }

  public static UsersUseCaseImpl newUsersUseCaseImpl(
      UsersRepository usersRepository, UsersDatastore usersDatastore) {
    return new UsersUseCaseImpl(usersRepository, usersDatastore);
  }
}