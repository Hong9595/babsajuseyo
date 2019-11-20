package com.example.babsajuseyo.data.repository

import com.example.babsajuseyo.data.source.ApiManager
import com.example.babsajuseyo.entity.PlayingListData
import com.example.babsajuseyo.util.Constants
import com.google.gson.JsonElement
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

class RestaurantRepo {
    private val api = ApiManager.restaurantApi

    fun getPlayingList() : Single<List<PlayingListData>> =
        // page 어떻게 할지...
        api.getPlayingList(Constants.API_KEY, Constants.LANGUAGE_EN, 1)
            .subscribeOn(Schedulers.io())
            .map{
                it.asJsonObject.getAsJsonArray("results")
                    .map{ data ->
                        ApiManager.gson.fromJson(data, PlayingListData::class.java)
                    }
            }

}