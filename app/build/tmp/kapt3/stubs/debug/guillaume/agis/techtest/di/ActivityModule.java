package guillaume.agis.techtest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lguillaume/agis/techtest/di/ActivityModule;", "", "()V", "contributeListsPostsActivityInjector", "Lguillaume/agis/techtest/ui/list/ListPostsActivity;", "contributePostDetailActivityInjector", "Lguillaume/agis/techtest/ui/detail/PostDetailActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {guillaume.agis.techtest.ui.list.PostsListModule.class})
    public abstract guillaume.agis.techtest.ui.list.ListPostsActivity contributeListsPostsActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {guillaume.agis.techtest.ui.detail.PostDetailModule.class})
    public abstract guillaume.agis.techtest.ui.detail.PostDetailActivity contributePostDetailActivityInjector();
    
    public ActivityModule() {
        super();
    }
}