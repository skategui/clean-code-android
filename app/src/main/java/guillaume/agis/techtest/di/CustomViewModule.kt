package guillaume.agis.techtest.di

import dagger.Binds
import dagger.Module
import guillaume.agis.techtest.ui.detail.CommentsAdapter
import guillaume.agis.techtest.ui.detail.CommentsAdapterImpl

@Module(includes = [DiffCallbackModule::class])
abstract class CustomViewModule {

    @Binds
    abstract fun bindCommentsAdapter(commentsAdapter: CommentsAdapterImpl): CommentsAdapter

}