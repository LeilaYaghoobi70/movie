package com.example.dataSoure

import com.example.model.MovieRepo
import kotlinx.coroutines.flow.Flow

interface MovieDataSource {
    suspend fun getMovies(): List<MovieRepo>
    suspend fun getMovie(id: Int): MovieRepo
}