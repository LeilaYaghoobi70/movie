package com.example.remote.api

import com.example.remote.model.MovieItemsDto
import retrofit2.http.GET

interface MovieApi {

    @GET("Top250Movies/k_aij9724f")
    suspend fun getMovies(): MovieItemsDto
}