package com.example.detail.ui.movieDetail

import com.example.movieDetail.base.State

sealed class MovieDetailState : State {
    object None: MovieDetailState()
}