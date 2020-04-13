package com.kpfu.itis.encyclopediaoftanks.di.module

import com.kpfu.itis.encyclopediaoftanks.BuildConfig
import com.kpfu.itis.encyclopediaoftanks.di.scope.NetworkScope
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named

@Module
class NetworkModule {

    @Provides
    @NetworkScope
    fun provideRetrofit(
        client: OkHttpClient,
        converterFactory: GsonConverterFactory,
        @Named(TAG_BASE_URL) url: String
    ): Retrofit = Retrofit.Builder()
        .client(client)
        .baseUrl(url)
        .addConverterFactory(converterFactory)
        .build()

    @Provides
    @NetworkScope
    fun provideClient(
        @Named(TAG_AUTH) authInterceptor: Interceptor,
        @Named(TAG_LOGGING) loggingInterceptor: Interceptor
    ) = OkHttpClient().newBuilder()
        .addInterceptor(authInterceptor)
        .addInterceptor(loggingInterceptor)
        .build()

    @Provides
    @NetworkScope
    @Named(TAG_AUTH)
    fun provideAuthInterceptor(): Interceptor = Interceptor { chain ->
        val newUrl = chain.request().url().newBuilder()
            .addQueryParameter("appid", BuildConfig.API_KEY)
            .build()

        val newRequest = chain.request().newBuilder().url(newUrl).build()
        chain.proceed(newRequest)
    }

    @Provides
    @NetworkScope
    @Named(TAG_LOGGING)
    fun provideLoggingInterceptor(): Interceptor =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    @Provides
    @NetworkScope
    fun provideConvertFactory(): GsonConverterFactory = GsonConverterFactory.create()

    @Provides
    @NetworkScope
    @Named(TAG_BASE_URL)
    fun provideBaseURL(): String = BuildConfig.API_ENDPOINT

    companion object {
        private const val TAG_LOGGING = "tag_logging"
        private const val TAG_AUTH = "tag_auth"
        private const val TAG_BASE_URL = "tag_base_url"
    }
}