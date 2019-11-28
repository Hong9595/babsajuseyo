package com.example.babsajuseyo.data.source

import com.example.babsajuseyo.util.Constants
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

//    @GET(Constants.RESTAURANT_API_KEY+"/json/SpFoodHygieneBizRestaurant/1/5/")
//    fun getRestaurantList() : Single<JsonElement>

}