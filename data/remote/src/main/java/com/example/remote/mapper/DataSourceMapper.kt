package com.example.remote.mapper

import com.example.model.MovieRepo
import com.example.remote.model.MovieDto


fun MovieDto.toRepo() :MovieRepo = MovieRepo(
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