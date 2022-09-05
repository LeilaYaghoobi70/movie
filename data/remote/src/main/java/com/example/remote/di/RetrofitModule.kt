package com.example.remote.di

import com.example.remote.retrofit.AppRetrofit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RetrofitModule {

    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
    ) = AppRetrofit(
        okHttpClient = okHttpClient,
        httpUrl = "https://imdb-api.com/en/API/".toHttpUrl()
    ).create()
}