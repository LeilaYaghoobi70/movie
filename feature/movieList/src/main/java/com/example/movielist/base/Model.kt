package com.example.movies.base

import exmple.movies.base.Intent
import exmple.movies.base.State
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.StateFlow


interface Model<s : State, I : Intent> {
    val intentChannel: MutableSharedFlow<I>
    val uiState: StateFlow<s>
}
