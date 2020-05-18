package com.example.movieapp.api

import com.example.movieapp.model.MovieList
import retrofit2.Call

class MoviesRepository() {
    private val moviesApi: MoviesApiService = MoviesApi.createApi()

    fun getMoviesByYear(releaseYear: Int): Call<MovieList> = moviesApi.getMoviesByYear(releaseYear)
}