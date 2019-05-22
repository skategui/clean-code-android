package guillaume.agis.techtest.ui.detail

import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import guillaume.agis.techtest.api.HttpErrorUtils
import guillaume.agis.techtest.di.DiffCallbackModule
import guillaume.agis.techtest.usecase.PostsUseCase

@Module(includes = [DiffCallbackModule::class])
class PostDetailModule {

    @Provides
    fun providesPostDetailViewModelFactory(
        postUseCase: PostsUseCase,
        httpErrorUtils: HttpErrorUtils
    ): ViewModelProvider.Factory {
        return PostDetailViewModel.Factory(postUseCase, httpErrorUtils)
    }
}