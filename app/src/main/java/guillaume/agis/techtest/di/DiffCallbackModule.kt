package guillaume.agis.techtest.di

import dagger.Module
import dagger.Provides
import guillaume.agis.techtest.ui.utils.DiffCallback

@Module
class DiffCallbackModule {

    @Provides
    fun providesDiffCallbackModule() = DiffCallback()

}