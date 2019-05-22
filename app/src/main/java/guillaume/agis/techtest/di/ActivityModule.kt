package guillaume.agis.techtest.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import guillaume.agis.techtest.ui.detail.PostDetailActivity
import guillaume.agis.techtest.ui.detail.PostDetailModule
import guillaume.agis.techtest.ui.list.ListPostsActivity
import guillaume.agis.techtest.ui.list.PostsListModule

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [PostsListModule::class])
    abstract fun contributeListsPostsActivityInjector(): ListPostsActivity

    @ContributesAndroidInjector(modules = [PostDetailModule::class])
    abstract fun contributePostDetailActivityInjector(): PostDetailActivity
}