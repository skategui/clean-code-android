package guillaume.agis.techtest.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lguillaume/agis/techtest/ui/list/PostsListModule;", "", "()V", "providesListPostsAdapterImpl", "Lguillaume/agis/techtest/ui/list/ListPostsAdapter;", "diffCallback", "Lguillaume/agis/techtest/ui/utils/DiffCallback;", "providesListPostsViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "postUseCase", "Lguillaume/agis/techtest/usecase/PostsUseCase;", "httpErrorUtils", "Lguillaume/agis/techtest/api/HttpErrorUtils;", "app_debug"})
@dagger.Module(includes = {guillaume.agis.techtest.di.DiffCallbackModule.class})
public final class PostsListModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.lifecycle.ViewModelProvider.Factory providesListPostsViewModelFactory(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.usecase.PostsUseCase postUseCase, @org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.api.HttpErrorUtils httpErrorUtils) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final guillaume.agis.techtest.ui.list.ListPostsAdapter providesListPostsAdapterImpl(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.ui.utils.DiffCallback diffCallback) {
        return null;
    }
    
    public PostsListModule() {
        super();
    }
}