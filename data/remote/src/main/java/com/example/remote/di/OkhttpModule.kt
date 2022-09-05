package com.example.remote.di

import com.example.remote.retrofit.MovieAokHttp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class OkhttpModule {

    @Provides
    @Singleton
    fun provideOkHttpClint():OkHttpClient = MovieAokHttp().create()
}