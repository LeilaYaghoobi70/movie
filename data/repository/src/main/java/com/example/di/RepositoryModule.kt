package com.example.di


import com.example.domain.repository.MovieRepository
import com.example.repository.MovieRepositoryImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun provideMovieRepository(movieRepositoryImp: MovieRepositoryImp): MovieRepository
}