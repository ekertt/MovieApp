package com.example.movieapp.api

import com.example.movieapp.model.MovieList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

public interface MoviesApiService {
    @GET("/3/discover/movie")
    fun getMoviesByYear(@Query(value = "primary_release_year", encoded = true) releaseYear: Int): Call<MovieList>
}