package com.example.detail.ui.movieDetail

import androidx.lifecycle.ViewModel

import com.example.domain.usecase.GetMoviesUseCase
import com.example.movieDetail.base.Model
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


import javax.inject.Inject

@HiltViewModel
class MovieDetailViewModel @Inject constructor(
    private val getMoviesUseCase: GetMoviesUseCase,
    ) : ViewModel(), Model<MovieDetailState, MovieDetailEvent> {

    private val viewModelState: MutableStateFlow<MovieDetailState> = MutableStateFlow(
        MovieDetailState.None
    )
    override val uiState: StateFlow<MovieDetailState>   = viewModelState

    override fun event(event: MovieDetailEvent) {
        TODO("Not yet implemented")
    }
}