package com.example.remote.model

import com.google.gson.annotations.SerializedName

data class MovieItemsDto(
    @SerializedName("items")
    val items: List<MovieDto>
)