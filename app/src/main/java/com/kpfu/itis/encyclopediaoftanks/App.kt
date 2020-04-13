package com.kpfu.itis.encyclopediaoftanks

import android.app.Application
import com.kpfu.itis.encyclopediaoftanks.di.component.ApiComponent
import com.kpfu.itis.encyclopediaoftanks.di.component.AppComponent
import com.kpfu.itis.encyclopediaoftanks.di.component.DaggerAppComponent
import com.kpfu.itis.encyclopediaoftanks.di.component.NetworkComponent
import com.kpfu.itis.encyclopediaoftanks.di.module.ApiModule
import com.kpfu.itis.encyclopediaoftanks.di.module.NetworkModule

class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
        lateinit var apiComponent: ApiComponent
        lateinit var networkComponent: NetworkComponent
    }

    override fun onCreate() {
        super.onCreate()
        apiComponent = appComponent.plusApiComponentBuilder()
            .apiModule(ApiModule())
            .build()
        networkComponent = appComponent.plusNetworkComponentBuilder()
            .networkModule(NetworkModule())
            .build()

    }

    fun init(app: App) {
        appComponent = DaggerAppComponent.builder()
            .application(app)
            .build()
    }

}