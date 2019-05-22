package guillaume.agis.techtest.ui.di

import android.app.Instrumentation
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner
import guillaume.agis.techtest.MainApplication

class EspressoTestRunner: AndroidJUnitRunner() {

    @Throws(InstantiationException::class, IllegalAccessException::class, ClassNotFoundException::class)
    override fun newApplication(cl: ClassLoader?, className: String?, context: Context?)
            = Instrumentation.newApplication(MainApplication::class.java, context)

}