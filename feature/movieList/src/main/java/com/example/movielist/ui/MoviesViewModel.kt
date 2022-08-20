package com.example.movielist.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.Movie
import com.example.domain.result.Result
import com.example.domain.result.Status
import com.example.domain.usecase.GetMoviesUseCase
import com.example.movielist.mapper.toApp
import com.example.movies.base.Model
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(

) : ViewModel(), Model<MoviesState, MoviesIntent> {

    override val intentChannel: MutableSharedFlow<MoviesIntent> = MutableSharedFlow()

    private val viewModelState: MutableStateFlow<MoviesState> = MutableStateFlow(MoviesState.None)
    override val uiState: StateFlow<MoviesState> = viewModelState


    init {
        getMovies()
    }

    private fun getMovies() {
       /* viewModelScope.launch {
            getMoviesUseCase.execute().catch {}.collect { result: Result<List<Movie>> ->
                when (result.status) {
                    Status.SUCCESS -> {
                        viewModelState.update {
                            MoviesState.Succesful(result.value?.map {
                                it.toApp()
                            })
                        }
                    }
                    Status.LOADING -> {
                        viewModelState.update { MoviesState.Loading }
                    }
                    Status.FAILURE -> {}
                }
            }
        }*/
    }
}