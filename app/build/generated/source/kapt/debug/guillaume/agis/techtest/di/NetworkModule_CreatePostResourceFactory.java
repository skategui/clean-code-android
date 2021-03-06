// Generated by Dagger (https://google.github.io/dagger).
package guillaume.agis.techtest.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import guillaume.agis.techtest.api.PostResource;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class NetworkModule_CreatePostResourceFactory implements Factory<PostResource> {
  private final NetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_CreatePostResourceFactory(
      NetworkModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PostResource get() {
    return provideInstance(module, retrofitProvider);
  }

  public static PostResource provideInstance(
      NetworkModule module, Provider<Retrofit> retrofitProvider) {
    return proxyCreatePostResource(module, retrofitProvider.get());
  }

  public static NetworkModule_CreatePostResourceFactory create(
      NetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_CreatePostResourceFactory(module, retrofitProvider);
  }

  public static PostResource proxyCreatePostResource(NetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.createPostResource(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
