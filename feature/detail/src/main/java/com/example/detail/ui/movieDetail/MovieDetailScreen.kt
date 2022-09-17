package com.example.detail.ui.movieDetail

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.detail.R
import com.example.detail.ui.utils.TopBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MovieDetailScreen(
    viewModel: MovieDetailViewModel,
    movieId: String,
    navigateBack : () -> (Unit),
) {
    Scaffold(
        modifier = Modifier.background(
            color = colorResource(id = R.color.base_background)
        ),
        topBar = { TopBar(onBackClicked = navigateBack) },
        content = {
            Row(
                modifier = Modifier.fillMaxWidth().height(80.dp)
            ) {
                Text(text = "Text:$movieId")
            }
        }
    )
}
