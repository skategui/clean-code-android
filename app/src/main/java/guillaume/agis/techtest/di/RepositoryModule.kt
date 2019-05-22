package guillaume.agis.techtest.di


import dagger.Binds
import dagger.Module
import guillaume.agis.techtest.repo.PostsRepository
import guillaume.agis.techtest.repo.PostsRepositoryImpl
import guillaume.agis.techtest.repo.UsersRepository
import guillaume.agis.techtest.repo.UsersRepositoryImpl


@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindsUserRepository(repositoryImpl: UsersRepositoryImpl): UsersRepository

    @Binds
    abstract fun binddPostRepository(repositoryImpl: PostsRepositoryImpl): PostsRepository

}