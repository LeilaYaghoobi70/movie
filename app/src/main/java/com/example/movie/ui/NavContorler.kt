package com.example.movie.ui

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.detail.ui.movieDetail.MovieDetailScreen
import com.example.detail.ui.movieDetail.MovieDetailViewModel
import com.example.movielist.ui.movies.MoviesScreen
import com.example.movielist.ui.movies.MoviesViewModel


@Composable
fun NavController(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = "moviesScreen") {
        composable("moviesScreen") {
            val viewModel: MoviesViewModel = hiltViewModel()
            MoviesScreen(
                viewModel = viewModel,
                navigateBack = {},
                navigateToMovieDetail = { movieID ->
                    navHostController.navigate("movieDetail/$movieID")
                }
            )
        }
        composable(
            route = "movieDetail/{movieId}",
            arguments = listOf(
                navArgument(
                    name = "movieId"
                ) {
                    type = NavType.StringType
                }
            )
        ) {
            val viewModel: MovieDetailViewModel = hiltViewModel()
            MovieDetailScreen(
                viewModel = viewModel,
                navigateBack = {},
                movieId = it.arguments?.getString("movieId") ?: ""
            )
        }
    }
}

