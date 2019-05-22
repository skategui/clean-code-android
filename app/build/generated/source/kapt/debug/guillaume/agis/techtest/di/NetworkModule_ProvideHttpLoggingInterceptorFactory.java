// Generated by Dagger (https://google.github.io/dagger).
package guillaume.agis.techtest.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.logging.HttpLoggingInterceptor;

public final class NetworkModule_ProvideHttpLoggingInterceptorFactory
    implements Factory<HttpLoggingInterceptor> {
  private final NetworkModule module;

  public NetworkModule_ProvideHttpLoggingInterceptorFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return provideInstance(module);
  }

  public static HttpLoggingInterceptor provideInstance(NetworkModule module) {
    return proxyProvideHttpLoggingInterceptor(module);
  }

  public static NetworkModule_ProvideHttpLoggingInterceptorFactory create(NetworkModule module) {
    return new NetworkModule_ProvideHttpLoggingInterceptorFactory(module);
  }

  public static HttpLoggingInterceptor proxyProvideHttpLoggingInterceptor(NetworkModule instance) {
    return Preconditions.checkNotNull(
        instance.provideHttpLoggingInterceptor(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}