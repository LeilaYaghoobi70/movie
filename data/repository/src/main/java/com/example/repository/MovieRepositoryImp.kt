package com.example.repository

import com.example.dataSoure.MovieDataSource
import com.example.domain.model.Movie
import com.example.domain.repository.MovieRepository
import com.example.mapper.toDomain
import  kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MovieRepositoryImp
@Inject constructor(
    private val movieDataSource: MovieDataSource,
) : MovieRepository {
    override suspend fun getMovies(): Flow<List<Movie>> =
        movieDataSource.getMovies().map { moviesRepo ->
            moviesRepo.map { movieRepo ->
                movieRepo.toDomain()
            }
        }

    override suspend fun getMovie(id: Int): Flow<Movie> =
        movieDataSource.getMovie(id = id).map { moviesRepo ->
            moviesRepo.toDomain()
        }
}