package com.example.domain.usecase

import com.example.domain.model.Movie
import com.example.domain.repository.MovieRepository
import com.example.domain.result.Result
import kotlinx.coroutines.flow.Flow

import javax.inject.Inject

class GetMovieUseCase @Inject constructor(
    private val movieRepository: MovieRepository,
) {

    fun execute(
        id: Int
    ): Flow<Result<Movie>> = movieRepository.getMovie(id = id)
}