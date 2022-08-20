package com.example.movielist.ui

import com.example.movielist.item.MovieItem
import exmple.movies.base.State


sealed class MoviesState: State {
    object Loading : MoviesState()
    data class Succesful(val movies: List<MovieItem>?): MoviesState()
    object None: MoviesState()
}