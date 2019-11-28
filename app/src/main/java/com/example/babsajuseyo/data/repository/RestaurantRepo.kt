package com.example.babsajuseyo.data.repository

import com.example.babsajuseyo.data.source.ApiManager
import com.example.babsajuseyo.entity.PlayingListData
import com.example.babsajuseyo.util.Constants
import com.google.gson.JsonElement
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

// 얘 지워줘도 됨. api부르던거임.
// Repository
// 여기서 Local/Remote data source를 가지고, 해당 source로부터 데이터를 가져와 콜백 수행.
class RestaurantRepo {
    private val api = ApiManager.restaurantApi

    fun getPlayingList() : Single<List<PlayingListData>> =
        // page 어떻게 할지...
        api.getPlayingList(Constants.MOVIE_API_KEY, Constants.LANGUAGE_EN, 1)
            .subscribeOn(Schedulers.io())
            .map{
                it.asJsonObject.getAsJsonArray("results")
                    .map{ data ->
                        ApiManager.gson.fromJson(data, PlayingListData::class.java)
                    }
            }

}