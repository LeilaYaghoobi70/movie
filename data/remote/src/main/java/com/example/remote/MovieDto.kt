package com.example.remote

import com.google.gson.annotations.SerializedName

data class MovieDto(
    @SerializedName("Id")
    var Id: String,
    @SerializedName("Rank")
    var Rank: String,
    @SerializedName("Title")
    var Title: String,
    @SerializedName("FullTitle")
    var FullTitle: String,
    @SerializedName("Year")
    var Year: String,
    @SerializedName("Image")
    var Image: String,
    @SerializedName("Crew")
    var Crew: String,
    @SerializedName("IMDbRating")
    var IMDbRating: String,
    @SerializedName("IMDbRatingCount")
    var IMDbRatingCount: String,
)