package com.example.movielist.ui.movies

import com.example.movielist.base.Event


sealed class MoviesEvent : Event {
    data class GetDetailMovie(val movieId: Int) : MoviesEvent()
    object NavigateUp: MoviesEvent()
}



