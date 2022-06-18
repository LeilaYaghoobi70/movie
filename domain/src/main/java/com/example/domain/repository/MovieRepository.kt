package com.example.domain.repository

import com.example.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    suspend fun getMovies(): Flow<List<Movie>>
    suspend fun getMovie(id: Int): Flow<Movie>
}