package guillaume.agis.techtest.ui.list

import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import guillaume.agis.techtest.api.HttpErrorUtils
import guillaume.agis.techtest.di.DiffCallbackModule
import guillaume.agis.techtest.usecase.PostsUseCase
import guillaume.agis.techtest.ui.utils.DiffCallback

@Module(includes = [DiffCallbackModule::class])
class PostsListModule {

    @Provides
    fun providesListPostsViewModelFactory(
        postUseCase: PostsUseCase, httpErrorUtils: HttpErrorUtils
    ): ViewModelProvider.Factory {
        return ListPostsViewModel.Factory(postUseCase, httpErrorUtils)
    }


    @Provides
    fun providesListPostsAdapterImpl(diffCallback: DiffCallback): ListPostsAdapter {
        return ListPostsAdapterImpl(diffCallback)
    }


}