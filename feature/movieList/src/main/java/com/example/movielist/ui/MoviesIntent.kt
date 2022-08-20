package com.example.movielist.ui

import exmple.movies.base.Intent


sealed class MoviesIntent : Intent {
    data class GetMovie(val movieId: Int) : MoviesIntent()
}
