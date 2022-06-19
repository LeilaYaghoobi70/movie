package com.example.remote.di

import com.example.remote.retrofit.MovieAokHttp
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient

@Module
@InstallIn(SingletonComponent::class)
class OkhttpModule {
    fun provideOkHttpClint():OkHttpClient = MovieAokHttp().create()
}