package org.firezenk.comicworld

import android.app.Application
import org.firezenk.comicworld.di.AppComponent
import org.firezenk.comicworld.di.DaggerAppComponent
import org.firezenk.comicworld.di.modules.AppModule

class ComicWorldApp : Application() {

    companion object {
        lateinit var component: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.builder().appModule(AppModule(this)).build()
        component inject this
    }
}