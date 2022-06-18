package com.example.domain.usecase

import com.example.domain.model.Movie
import com.example.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMoviesUseCase @Inject constructor(
    private val  movieRepository: MovieRepository
)  {

    suspend fun execute(
         id: Int
    ): Flow<Movie> = movieRepository.getMovie(id = id)
}