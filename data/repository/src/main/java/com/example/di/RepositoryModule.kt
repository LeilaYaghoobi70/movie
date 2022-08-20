package com.example.di


import com.example.domain.repository.MovieRepository
import com.example.repository.MovieRepositoryImp
import dagger.Binds
import dagger.hilt.InstallIn

import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun provideMovieRepository(movieRepositoryImp: MovieRepositoryImp): MovieRepository
}