// Generated by Dagger (https://google.github.io/dagger).
package guillaume.agis.techtest.repo;

import dagger.internal.Factory;
import guillaume.agis.techtest.api.UserResource;
import javax.inject.Provider;

public final class UsersRepositoryImpl_Factory implements Factory<UsersRepositoryImpl> {
  private final Provider<UserResource> userResourceProvider;

  public UsersRepositoryImpl_Factory(Provider<UserResource> userResourceProvider) {
    this.userResourceProvider = userResourceProvider;
  }

  @Override
  public UsersRepositoryImpl get() {
    return provideInstance(userResourceProvider);
  }

  public static UsersRepositoryImpl provideInstance(Provider<UserResource> userResourceProvider) {
    return new UsersRepositoryImpl(userResourceProvider.get());
  }

  public static UsersRepositoryImpl_Factory create(Provider<UserResource> userResourceProvider) {
    return new UsersRepositoryImpl_Factory(userResourceProvider);
  }

  public static UsersRepositoryImpl newUsersRepositoryImpl(UserResource userResource) {
    return new UsersRepositoryImpl(userResource);
  }
}
