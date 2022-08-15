package com.example.movies.ui

import com.example.movies.base.Intent


sealed class MoviesIntent : Intent {
    data class GetMovie(val movieId: Int) : MoviesIntent()
}
