package com.kpfu.itis.encyclopediaoftanks.di.component

import android.content.Context
import com.kpfu.itis.encyclopediaoftanks.App
import com.kpfu.itis.encyclopediaoftanks.di.module.AppModule
import com.kpfu.itis.encyclopediaoftanks.presentation.view.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun getContext(): Context

    fun inject(activity: MainActivity)

    fun plusApiComponentBuilder(): ApiComponent.Builder

    fun plusNetworkComponentBuilder(): NetworkComponent.Builder

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }
}