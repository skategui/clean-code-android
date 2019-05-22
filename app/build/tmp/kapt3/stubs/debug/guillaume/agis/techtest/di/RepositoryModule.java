package guillaume.agis.techtest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lguillaume/agis/techtest/di/RepositoryModule;", "", "()V", "binddPostRepository", "Lguillaume/agis/techtest/repo/PostsRepository;", "repositoryImpl", "Lguillaume/agis/techtest/repo/PostsRepositoryImpl;", "bindsUserRepository", "Lguillaume/agis/techtest/repo/UsersRepository;", "Lguillaume/agis/techtest/repo/UsersRepositoryImpl;", "app_debug"})
@dagger.Module()
public abstract class RepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract guillaume.agis.techtest.repo.UsersRepository bindsUserRepository(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.repo.UsersRepositoryImpl repositoryImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract guillaume.agis.techtest.repo.PostsRepository binddPostRepository(@org.jetbrains.annotations.NotNull()
    guillaume.agis.techtest.repo.PostsRepositoryImpl repositoryImpl);
    
    public RepositoryModule() {
        super();
    }
}