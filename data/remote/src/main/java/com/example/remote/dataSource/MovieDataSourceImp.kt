package com.example.remote.dataSource

import com.example.dataSoure.MovieDataSource
import com.example.model.MovieRepo
import com.example.remote.api.MovieApi
import com.example.remote.mapper.toRepo
import javax.inject.Inject

class MovieDataSourceImp
    @Inject constructor(
        private val movieApi: MovieApi
    ): MovieDataSource {
    override suspend fun getMovies(): List<MovieRepo> =
       movieApi.getMovies().map {
           it.toRepo()
       }


    override suspend fun getMovie(id: Int): MovieRepo {
        TODO("Not yet implemented")
    }
}