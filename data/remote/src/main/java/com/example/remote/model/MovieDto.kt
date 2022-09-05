package com.example.remote.model

import com.google.gson.annotations.SerializedName

data class MovieDto(
    @SerializedName("id")
    var mId: String?,
    @SerializedName("rank")
    var mRank: String?,
    @SerializedName("title")
    var mTitle: String?,
    @SerializedName("fullTitle")
    var mFullTitle: String?,
    @SerializedName("year")
    var mYear: String?,
    @SerializedName("image")
    var mImage: String?,
    @SerializedName("crew")
    var mCrew: String?,
    @SerializedName("iMDbRating")
    var mIMDbRating: String?,
    @SerializedName("iMDbRatingCount")
    var mIMDbRatingCount: String?,
)