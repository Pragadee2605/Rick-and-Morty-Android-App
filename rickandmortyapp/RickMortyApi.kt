package com.pragadees.rickandmortyapp

import retrofit2.Call
import retrofit2.http.GET

interface RickMortyApi {
    @GET("character")
    fun getAllCharacters() : Call<RickMorty>
}