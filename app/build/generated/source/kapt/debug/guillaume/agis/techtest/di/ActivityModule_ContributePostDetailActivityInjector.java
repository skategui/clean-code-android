package guillaume.agis.techtest.di;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import guillaume.agis.techtest.ui.detail.PostDetailActivity;
import guillaume.agis.techtest.ui.detail.PostDetailModule;

@Module(
  subcomponents =
      ActivityModule_ContributePostDetailActivityInjector.PostDetailActivitySubcomponent.class
)
public abstract class ActivityModule_ContributePostDetailActivityInjector {
  private ActivityModule_ContributePostDetailActivityInjector() {}

  @Binds
  @IntoMap
  @ClassKey(PostDetailActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PostDetailActivitySubcomponent.Builder builder);

  @Subcomponent(modules = PostDetailModule.class)
  public interface PostDetailActivitySubcomponent extends AndroidInjector<PostDetailActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PostDetailActivity> {}
  }
}
