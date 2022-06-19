package com.example.remote.api

import com.example.remote.model.MovieDto
import retrofit2.http.GET

interface MovieApi {

    @GET("Top250Movies")
    fun getMovies(): List<MovieDto>
}