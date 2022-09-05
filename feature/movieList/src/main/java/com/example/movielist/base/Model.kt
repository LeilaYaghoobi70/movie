package com.example.movielist.base

import exmple.movies.base.State
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.StateFlow


interface Model<s : State, I : Event> {
    fun event(event: I)
    val uiState: StateFlow<s>
}
