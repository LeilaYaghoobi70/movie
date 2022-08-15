package com.example.domain.repository

import com.example.domain.model.Movie
import kotlinx.coroutines.flow.Flow
import com.example.domain.result.Result

interface MovieRepository {
    fun getMovies(): Flow<Result<List<Movie>>>
    fun getMovie(id: Int): Flow<Result<Movie>>
}