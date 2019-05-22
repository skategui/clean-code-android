package guillaume.agis.techtest.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import guillaume.agis.techtest.MainApplication
import guillaume.agis.techtest.ui.customview.CommentsListView
import javax.inject.Singleton

/**
 * dependencies needed in the app
 */
@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        UseCaseModule::class,
        UserDatastoreModule::class,
        NetworkModule::class,
        RepositoryModule::class,
        ActivityModule::class,
        CustomViewModule::class
    ]
)
interface MainAppComponent : AndroidInjector<MainApplication> {
    fun inject(commentsListView: CommentsListView)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): MainAppComponent
    }
}