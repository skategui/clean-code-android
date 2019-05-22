package guillaume.agis.techtest.common;

import java.lang.System;

/**
 * Base ViewModel to manage the disposables
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR2\u0010\r\u001a&\u0012\f\u0012\n \u000f*\u0004\u0018\u00018\u00008\u0000 \u000f*\u0012\u0012\f\u0012\n \u000f*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lguillaume/agis/techtest/common/BaseViewModel;", "T", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "viewStateObservable", "Lio/reactivex/Observable;", "getViewStateObservable", "()Lio/reactivex/Observable;", "viewStateRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "emitViewState", "", "viewState", "(Ljava/lang/Object;)V", "onCleared", "app_debug"})
public class BaseViewModel<T extends java.lang.Object> extends androidx.lifecycle.ViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final com.jakewharton.rxrelay2.BehaviorRelay<T> viewStateRelay = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<T> viewStateObservable = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<T> getViewStateObservable() {
        return null;
    }
    
    protected final void emitViewState(T viewState) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
}