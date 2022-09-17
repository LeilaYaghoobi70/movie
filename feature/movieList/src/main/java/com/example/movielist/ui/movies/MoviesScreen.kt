package com.example.movielist.ui.movies

import android.annotation.SuppressLint
import android.service.autofill.OnClickAction

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.movielist.item.MovieItem
import com.example.movielist.ui.utils.TopBar
import com.example.movielist.R
import kotlinx.coroutines.delay


@Composable
fun MoviesScreen(
    viewModel: MoviesViewModel,
    navigateBack : () -> (Unit),
    navigateToMovieDetail: (String) ->(Unit)
) {
    val state by viewModel.uiState.collectAsState()

    when (state) {
        is MoviesState.NavigateUp -> navigateBack.invoke()
        is MoviesState.GetMovieDetail -> {
            LaunchedEffect(true) {
               // delay(200)
                navigateToMovieDetail.invoke((state as MoviesState.GetMovieDetail).movieID)
            }
            //viewModel.event(MoviesEvent.RestState)
        }
        else -> ScaffoldScreen(
            state = state,
            navigateBack = {
                viewModel.event(MoviesEvent.NavigateUp)
            },
            onClickAction = { id ->
                viewModel.event(MoviesEvent.GetDetailMovie(movieId = id))
            }
        )
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScaffoldScreen(
    state: MoviesState,
    navigateBack : () -> (Unit),
    onClickAction: (String) -> (Unit)
){
    Scaffold(
        modifier = Modifier.background(
            color = colorResource(id = R.color.base_background)
        ),
        topBar = {TopBar(onBackClicked = navigateBack) },
        content = {
            when (state) {
                is MoviesState.Loading -> { Shimmers() }
                is MoviesState.None -> {}
                else -> { MovieList((state as MoviesState.Successful).movies, onClickAction = onClickAction) }
            }
        }
    )
}

@Composable
fun Shimmers() {

}

@Composable
fun MovieList(
    movies: List<MovieItem>?,
    onClickAction: (String) -> (Unit)
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(), content = {
        items(movies?.size ?: 0) {
            MovieItem(movieItem = movies?.get(it), onClickAction = onClickAction)
        }
    })
}

@Composable
fun MovieItem(movieItem: MovieItem?,  onClickAction: (String) -> (Unit)){
    Row(
        modifier = Modifier.fillMaxWidth().height(80.dp).clickable {
            movieItem?.mId?.let {
                onClickAction.invoke(it)
            }
        }
    ) {
        Text(text = movieItem?.mId ?: "----")
    }

}