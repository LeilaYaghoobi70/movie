package com.example.remote.di

import com.example.remote.api.MovieApi
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class MovieApiModule {
    fun getMovieApi(retrofit: Retrofit): MovieApi = retrofit.create(MovieApi::class.java)
}