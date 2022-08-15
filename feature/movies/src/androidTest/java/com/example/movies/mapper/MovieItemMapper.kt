package com.example.movies.mapper

import com.example.domain.model.Movie
import com.example.movies.item.MovieItem

fun Movie.toApp() = MovieItem(
    Id,
    Rank,
    Title,
    FullTitle,
    Year,
    Image,
    Crew,
    IMDbRating,
    IMDbRatingCount,
)