package com.example.dataSoure

import com.example.model.MovieRepo
import kotlinx.coroutines.flow.Flow

interface MovieDataSource {
    suspend fun getMovies(): Flow<List<MovieRepo>>
    suspend fun getMovie(id: Int): Flow<MovieRepo>
}