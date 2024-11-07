package com.example.simple_joke_fetcher_app

import retrofit2.Call
import retrofit2.http.GET

interface JokeApiService {
    @GET("random_joke")
    fun getRandomJoke(): Call<Joke>
}