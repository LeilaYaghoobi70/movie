package com.example.remote.di

import com.example.remote.api.MovieApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MovieApiModule {
    @Provides
    @Singleton
    fun getMovieApi(retrofit: Retrofit): MovieApi = retrofit.create(MovieApi::class.java)
}