package guillaume.agis.techtest.di;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import guillaume.agis.techtest.ui.list.ListPostsActivity;
import guillaume.agis.techtest.ui.list.PostsListModule;

@Module(
  subcomponents =
      ActivityModule_ContributeListsPostsActivityInjector.ListPostsActivitySubcomponent.class
)
public abstract class ActivityModule_ContributeListsPostsActivityInjector {
  private ActivityModule_ContributeListsPostsActivityInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ListPostsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ListPostsActivitySubcomponent.Builder builder);

  @Subcomponent(modules = PostsListModule.class)
  public interface ListPostsActivitySubcomponent extends AndroidInjector<ListPostsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListPostsActivity> {}
  }
}
