package com.example.remote.di

import com.example.dataSoure.MovieDataSource
import com.example.remote.dataSource.MovieDataSourceImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Binds
    @Singleton
    fun provideMovieDataSource(movieDataSource: MovieDataSourceImp): MovieDataSource
}