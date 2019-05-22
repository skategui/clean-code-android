package guillaume.agis.techtest

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import guillaume.agis.techtest.di.MainAppComponent
import guillaume.agis.techtest.di.DaggerMainAppComponent
import javax.inject.Inject

// App , init dagger and the AndroidInjector
class MainApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
        DaggerMainAppComponent.builder()
            .context(this)
            .build()
            .also { appComponent = it }
        appComponent.inject(this)
    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

    companion object {
        @JvmStatic
        lateinit var appComponent: MainAppComponent
    }
}