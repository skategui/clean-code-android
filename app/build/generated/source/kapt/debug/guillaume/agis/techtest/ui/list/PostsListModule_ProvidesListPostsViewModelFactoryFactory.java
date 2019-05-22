// Generated by Dagger (https://google.github.io/dagger).
package guillaume.agis.techtest.ui.list;

import androidx.lifecycle.ViewModelProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import guillaume.agis.techtest.api.HttpErrorUtils;
import guillaume.agis.techtest.usecase.PostsUseCase;
import javax.inject.Provider;

public final class PostsListModule_ProvidesListPostsViewModelFactoryFactory
    implements Factory<ViewModelProvider.Factory> {
  private final PostsListModule module;

  private final Provider<PostsUseCase> postUseCaseProvider;

  private final Provider<HttpErrorUtils> httpErrorUtilsProvider;

  public PostsListModule_ProvidesListPostsViewModelFactoryFactory(
      PostsListModule module,
      Provider<PostsUseCase> postUseCaseProvider,
      Provider<HttpErrorUtils> httpErrorUtilsProvider) {
    this.module = module;
    this.postUseCaseProvider = postUseCaseProvider;
    this.httpErrorUtilsProvider = httpErrorUtilsProvider;
  }

  @Override
  public ViewModelProvider.Factory get() {
    return provideInstance(module, postUseCaseProvider, httpErrorUtilsProvider);
  }

  public static ViewModelProvider.Factory provideInstance(
      PostsListModule module,
      Provider<PostsUseCase> postUseCaseProvider,
      Provider<HttpErrorUtils> httpErrorUtilsProvider) {
    return proxyProvidesListPostsViewModelFactory(
        module, postUseCaseProvider.get(), httpErrorUtilsProvider.get());
  }

  public static PostsListModule_ProvidesListPostsViewModelFactoryFactory create(
      PostsListModule module,
      Provider<PostsUseCase> postUseCaseProvider,
      Provider<HttpErrorUtils> httpErrorUtilsProvider) {
    return new PostsListModule_ProvidesListPostsViewModelFactoryFactory(
        module, postUseCaseProvider, httpErrorUtilsProvider);
  }

  public static ViewModelProvider.Factory proxyProvidesListPostsViewModelFactory(
      PostsListModule instance, PostsUseCase postUseCase, HttpErrorUtils httpErrorUtils) {
    return Preconditions.checkNotNull(
        instance.providesListPostsViewModelFactory(postUseCase, httpErrorUtils),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
