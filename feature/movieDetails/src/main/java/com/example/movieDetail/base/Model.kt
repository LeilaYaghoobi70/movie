package com.example.movieDetail.base

import kotlinx.coroutines.flow.StateFlow


interface Model<s : State, I : Event> {
    fun event(event: I)
    val uiState: StateFlow<s>
}
