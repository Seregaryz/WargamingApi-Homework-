package com.kpfu.itis.encyclopediaoftanks.di.module

import com.kpfu.itis.encyclopediaoftanks.App
import com.kpfu.itis.encyclopediaoftanks.data.network.TankApi
import com.kpfu.itis.encyclopediaoftanks.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ApiModule {

    @Provides
    @ActivityScope
    fun bindTankApi(): TankApi = App.networkComponent.provideRetrofit().create(
        TankApi::class.java
    )
}