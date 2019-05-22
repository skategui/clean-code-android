// Generated by Dagger (https://google.github.io/dagger).
package guillaume.agis.techtest.ui.detail;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class PostDetailActivity_MembersInjector
    implements MembersInjector<PostDetailActivity> {
  private final Provider<PostDetailViewModel.Factory> viewModelFactoryProvider;

  public PostDetailActivity_MembersInjector(
      Provider<PostDetailViewModel.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PostDetailActivity> create(
      Provider<PostDetailViewModel.Factory> viewModelFactoryProvider) {
    return new PostDetailActivity_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PostDetailActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      PostDetailActivity instance, PostDetailViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}