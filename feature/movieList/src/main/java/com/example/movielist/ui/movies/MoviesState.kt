package com.example.movielist.ui.movies

import com.example.movielist.item.MovieItem
import com.example.movielist.base.State


sealed class MoviesState: State {
    object Loading : MoviesState()
    data class Successful(val movies: List<MovieItem>?): MoviesState()
    object Error:MoviesState()
    object None: MoviesState()
    object NavigateUp: MoviesState()
    data class GetMovieDetail(val movieID: String): MoviesState()
}