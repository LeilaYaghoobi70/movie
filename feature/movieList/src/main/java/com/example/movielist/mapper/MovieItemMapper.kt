package com.example.movielist.mapper

import com.example.domain.model.Movie
import com.example.movielist.item.MovieItem


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