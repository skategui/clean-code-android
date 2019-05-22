package guillaume.agis.techtest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\nH\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0017\u001a\u00020\u000eH\u0007J\b\u0010\u0018\u001a\u00020\fH\u0007\u00a8\u0006\u001a"}, d2 = {"Lguillaume/agis/techtest/di/NetworkModule;", "", "()V", "createCache", "Lokhttp3/Cache;", "context", "Landroid/content/Context;", "createHttpErrorUtils", "Lguillaume/agis/techtest/api/HttpErrorUtils;", "createOkHttpClient", "Lokhttp3/OkHttpClient;", "networkInterceptor", "Lokhttp3/Interceptor;", "httpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "createPostResource", "Lguillaume/agis/techtest/api/PostResource;", "retrofit", "Lretrofit2/Retrofit;", "createRetrofit", "client", "createUserResource", "Lguillaume/agis/techtest/api/UserResource;", "provideHttpLoggingInterceptor", "provideNetworkCacheInterceptor", "Companion", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    private static final long TIMEOUT_SEC = 20L;
    private static final int cacheMaxAgeMinute = 10;
    private static final long cacheSize = 10485760L;
    private static final java.lang.String cacheName = "cache_name";
    public static final guillaume.agis.techtest.di.NetworkModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.Cache createCache(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.Interceptor provideNetworkCacheInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient createOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor networkInterceptor, @org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit createRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final guillaume.agis.techtest.api.HttpErrorUtils createHttpErrorUtils() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final guillaume.agis.techtest.api.PostResource createPostResource(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final guillaume.agis.techtest.api.UserResource createUserResource(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lguillaume/agis/techtest/di/NetworkModule$Companion;", "", "()V", "TIMEOUT_SEC", "", "cacheMaxAgeMinute", "", "cacheName", "", "cacheSize", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}