package com.kpfu.itis.encyclopediaoftanks.di.component

import com.kpfu.itis.encyclopediaoftanks.di.module.NetworkModule
import com.kpfu.itis.encyclopediaoftanks.di.scope.NetworkScope
import dagger.Subcomponent
import retrofit2.Retrofit

@NetworkScope
@Subcomponent(modules = [NetworkModule::class])
interface NetworkComponent {

    fun provideRetrofit(): Retrofit

    @Subcomponent.Builder
    interface Builder {
        fun networkModule(networkModule: NetworkModule): Builder

        fun build(): NetworkComponent
    }
}