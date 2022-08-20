package com.example.movie.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movielist.ui.MoviesScreen
import com.example.movielist.ui.MoviesViewModel


@Composable
fun NavController (navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = "moviesScreen") {

        composable("moviesScreen") {
            val viewModel: MoviesViewModel = hiltViewModel()
            MoviesScreen(viewModel = viewModel)
        }

    }
}