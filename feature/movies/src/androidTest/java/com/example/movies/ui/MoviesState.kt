package com.example.movies.ui

import com.example.movies.base.State
import com.example.movies.item.MovieItem

sealed class MoviesState: State  {
    object Loading : MoviesState()
    data class Succesful(val movies: List<MovieItem>?):MoviesState()
    object None: MoviesState()
}