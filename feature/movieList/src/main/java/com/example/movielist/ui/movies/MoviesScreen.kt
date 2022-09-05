package com.example.movielist.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import com.example.movielist.item.MovieItem
import com.example.movielist.ui.movies.MoviesEvent
import com.example.movielist.ui.movies.MoviesState
import com.example.movielist.ui.movies.MoviesViewModel
import com.example.movielist.ui.utils.TopBar


@Composable
fun MoviesScreen(
    viewModel: MoviesViewModel,
    navigateBack : () -> (Unit),
    navigateToMovieDetail: () ->(Unit)
) {
    val state by viewModel.uiState.collectAsState()

    when (state) {
        is MoviesState.NavigateUp -> navigateBack.invoke()
        is MoviesState.GetMovieDetail -> navigateToMovieDetail.invoke()
        else -> ScaffoldScreen(
            state = state,
            navigateBack = {
                viewModel.event(MoviesEvent.NavigateUp)
            }
        )
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScaffoldScreen(
    state: MoviesState,
    navigateBack : () -> (Unit),
){
    Scaffold(
        topBar = {TopBar(onBackClicked = navigateBack) },
        content = {
            when (state) {
                is MoviesState.Loading -> { Shimmers() }
                is MoviesState.None -> {}
                else -> { MovieList((state as MoviesState.Successful).movies) }
            }
        }
    )
}

@Composable
fun Shimmers() {

}

@Composable
fun MovieList(
    movies: List<MovieItem>?
) {
    LazyColumn(content = {
        items(movies?.size ?: 0) {
            MovieItem(movieItem = movies?.get(it))
        }
    })
}

@Composable
fun MovieItem(movieItem: MovieItem?){
    Text(text = movieItem?.mId ?: "----")
}