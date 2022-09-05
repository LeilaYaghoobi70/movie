package com.example.movie.ui

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.movielist.ui.MoviesScreen
import com.example.movielist.ui.movies.MoviesViewModel


@Composable
fun NavController (navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = "moviesScreen") {
        composable("moviesScreen") {
            val viewModel: MoviesViewModel = hiltViewModel()
            MoviesScreen(
                viewModel = viewModel,
                navigateBack = {},
                navigateToMovieDetail = {}
            )
        }
        composable("moviesScreen") {
            val viewModel: MoviesViewModel = hiltViewModel()
            MoviesScreen(
                viewModel = viewModel,
                navigateBack = {},
                navigateToMovieDetail = {}
            )
        }
    }
}