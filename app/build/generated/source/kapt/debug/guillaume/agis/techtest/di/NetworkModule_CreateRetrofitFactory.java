// Generated by Dagger (https://google.github.io/dagger).
package guillaume.agis.techtest.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class NetworkModule_CreateRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> clientProvider;

  public NetworkModule_CreateRetrofitFactory(
      NetworkModule module, Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
  }

  @Override
  public Retrofit get() {
    return provideInstance(module, clientProvider);
  }

  public static Retrofit provideInstance(
      NetworkModule module, Provider<OkHttpClient> clientProvider) {
    return proxyCreateRetrofit(module, clientProvider.get());
  }

  public static NetworkModule_CreateRetrofitFactory create(
      NetworkModule module, Provider<OkHttpClient> clientProvider) {
    return new NetworkModule_CreateRetrofitFactory(module, clientProvider);
  }

  public static Retrofit proxyCreateRetrofit(NetworkModule instance, OkHttpClient client) {
    return Preconditions.checkNotNull(
        instance.createRetrofit(client),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
