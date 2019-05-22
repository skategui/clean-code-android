// Generated by Dagger (https://google.github.io/dagger).
package guillaume.agis.techtest.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.Interceptor;

public final class NetworkModule_ProvideNetworkCacheInterceptorFactory
    implements Factory<Interceptor> {
  private final NetworkModule module;

  public NetworkModule_ProvideNetworkCacheInterceptorFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public Interceptor get() {
    return provideInstance(module);
  }

  public static Interceptor provideInstance(NetworkModule module) {
    return proxyProvideNetworkCacheInterceptor(module);
  }

  public static NetworkModule_ProvideNetworkCacheInterceptorFactory create(NetworkModule module) {
    return new NetworkModule_ProvideNetworkCacheInterceptorFactory(module);
  }

  public static Interceptor proxyProvideNetworkCacheInterceptor(NetworkModule instance) {
    return Preconditions.checkNotNull(
        instance.provideNetworkCacheInterceptor(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
