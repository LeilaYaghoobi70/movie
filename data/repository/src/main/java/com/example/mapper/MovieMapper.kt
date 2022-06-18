package com.example.mapper

import com.example.domain.model.Movie
import com.example.model.MovieRepo

fun MovieRepo.toDomain() = Movie(
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