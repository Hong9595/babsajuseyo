package com.example.babsajuseyo.data

import com.example.babsajuseyo.entity.RestaurantData
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.SingleEmitter

interface FirestoreSource{
    fun getRestaurantData() : Maybe<List<RestaurantData>>
    fun getNearbySchoolRestaurant(searchText: String) : Maybe<List<RestaurantData>>
}