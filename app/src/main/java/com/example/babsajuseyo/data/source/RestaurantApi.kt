package com.example.babsajuseyo.data.source

import com.google.gson.JsonElement
import io.reactivex.Single
import retrofit2.http.*

interface RestaurantApi{

    // configuration
    @GET("configuration")
    fun getConfiguration(
        @Query("api_key") key: String
    ): Single<JsonElement>

    // now playing list
    @GET("movie/now_playing")
    fun getPlayingList(
        @Query("api_key") key: String,
        @Query("language") language: String,
        @Query("page") page: Int
    ): Single<JsonElement>

}