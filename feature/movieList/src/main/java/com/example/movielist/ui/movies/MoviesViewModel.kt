package com.example.movielist.ui.movies


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.Movie
import com.example.domain.result.Result
import com.example.domain.result.Status
import com.example.domain.usecase.GetMoviesUseCase
import com.example.movielist.mapper.toApp
import com.example.movielist.base.Model
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(
    private val getMoviesUseCase: GetMoviesUseCase
) : ViewModel(), Model<MoviesState, MoviesEvent> {


    private val viewModelState: MutableStateFlow<MoviesState> = MutableStateFlow(MoviesState.None)
    override val uiState: StateFlow<MoviesState> = viewModelState


    init {
        getMovies()
    }

    override fun event(event: MoviesEvent) {
        when (event) {
            is MoviesEvent.NavigateUp -> {
                navigateUp()
            }
            is MoviesEvent.GetDetailMovie -> {
                getMovieDetail()
            }
        }
    }

    private fun getMovies() {
        viewModelScope.launch {
            getMoviesUseCase.execute().collect { result: Result<List<Movie>> ->
                when (result.status) {
                    Status.SUCCESS -> {
                        viewModelState.update {
                            MoviesState.Successful(result.value?.map { it.toApp() })
                        }
                    }
                    Status.LOADING -> {
                        viewModelState.update { MoviesState.Loading }
                    }
                    Status.FAILURE -> {
                        viewModelState.update { MoviesState.Error }
                    }
                }
            }
        }
    }

    private fun navigateUp() {
        viewModelState.update { MoviesState.NavigateUp }
    }

    private fun getMovieDetail() {
        viewModelState.update { MoviesState.GetMovieDetail }
    }

}