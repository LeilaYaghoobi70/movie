package com.example.remote.mapper

import com.example.model.MovieRepo
import com.example.remote.model.MovieDto


fun MovieDto.toRepo() :MovieRepo = MovieRepo(
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