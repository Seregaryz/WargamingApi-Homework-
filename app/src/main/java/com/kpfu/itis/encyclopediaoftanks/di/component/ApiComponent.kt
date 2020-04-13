package com.kpfu.itis.encyclopediaoftanks.di.component

import com.kpfu.itis.encyclopediaoftanks.data.network.TankApi
import com.kpfu.itis.encyclopediaoftanks.di.module.ApiModule
import com.kpfu.itis.encyclopediaoftanks.di.scope.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ApiModule::class])
interface ApiComponent {

    fun TankApi(): TankApi

    @Subcomponent.Builder
    interface Builder {

        fun apiModule(apiModule: ApiModule): Builder
        fun build(): ApiComponent
    }

}