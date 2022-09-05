package com.example.mapper

import com.example.domain.model.Movie
import com.example.model.MovieRepo

fun MovieRepo.toDomain() = Movie(
    mId,
    mRank,
    mTitle,
    mFullTitle,
    mYear,
    mImage,
    mCrew,
    mIMDbRating,
    mIMDbRatingCount,
)