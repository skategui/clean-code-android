package guillaume.agis.techtest.di;

import java.lang.System;

/**
 * dependencies needed in the app
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lguillaume/agis/techtest/di/MainAppComponent;", "Ldagger/android/AndroidInjector;", "Lguillaume/agis/techtest/MainApplication;", "inject", "", "commentsListView", "Lguillaume/agis/techtest/ui/customview/CommentsListView;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, guillaume.agis.techtest.di.UseCaseModule.class, guillaume.agis.techtest.di.UserDatastoreModule.class, guillaume.agis.techtest.di.NetworkModule.class, guillaume.agis.techtest.di.RepositoryModule.class, guillaume.agis.techtest.di.ActivityModule.class, guillaume.agis.techtest.di.CustomViewModule.class})
@javax.inject.Singleton()
public abstract interface MainAppComponent extends dagger.android.AndroidInjector<guillaume.agis.techtest.MainApplication> {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.ui.customview.CommentsListView commentsListView);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lguillaume/agis/techtest/di/MainAppComponent$Builder;", "", "build", "Lguillaume/agis/techtest/di/MainAppComponent;", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract guillaume.agis.techtest.di.MainAppComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        public abstract guillaume.agis.techtest.di.MainAppComponent build();
    }
}