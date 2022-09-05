package com.example.repository

import com.example.dataSoure.MovieDataSource
import com.example.domain.model.Movie
import com.example.domain.repository.MovieRepository
import com.example.domain.result.Result
import com.example.domain.result.Status
import com.example.mapper.toDomain
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MovieRepositoryImp
@Inject constructor(
    private val movieDataSource: MovieDataSource,
) : MovieRepository {
    override fun getMovies(): Flow<Result<List<Movie>>> = flow {
        emit(Result(status = Status.LOADING, value = null, errorMessage = null))
        val movie = movieDataSource.getMovies().map { moviesRepo ->
            moviesRepo.toDomain()
        }
        emit(Result(status = Status.SUCCESS, value = movie, errorMessage = null))
    }

    override fun getMovie(id: Int): Flow<Result<Movie>> = flow {
        emit(Result(status = Status.LOADING, value = null, errorMessage = null))
        val movies = movieDataSource.getMovie(id = id).toDomain()
        emit(Result(status = Status.SUCCESS, value = movies, errorMessage = null))
    }
}