package com.kpfu.itis.encyclopediaoftanks.di.module

import android.content.Context
import com.kpfu.itis.encyclopediaoftanks.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(app: App): Context = app.applicationContext
}