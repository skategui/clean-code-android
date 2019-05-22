package guillaume.agis.techtest.di

import dagger.Binds
import dagger.Module
import guillaume.agis.techtest.usecase.PostsUseCase
import guillaume.agis.techtest.usecase.PostsUseCaseImpl
import guillaume.agis.techtest.usecase.UsersUseCase
import guillaume.agis.techtest.usecase.UsersUseCaseImpl

@Module
abstract class UseCaseModule {

    @Binds
    abstract fun bindPostsUseCase(postsUserCase: PostsUseCaseImpl): PostsUseCase

    @Binds
    abstract fun bindUserUseCase(userUserCase: UsersUseCaseImpl): UsersUseCase

}