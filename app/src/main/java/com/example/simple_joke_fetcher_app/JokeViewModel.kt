package com.example.simple_joke_fetcher_app


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class JokeViewModel : ViewModel() {
    private val repository = JokeRepository()
    val joke: LiveData<Joke> = repository.joke
    val error: LiveData<String> = repository.error

    fun getNewJoke() {
        repository.fetchJoke()
    }
}