package com.example.babsajuseyo.data

import com.example.babsajuseyo.entity.RestaurantData
import io.reactivex.Observable
import io.reactivex.SingleEmitter

interface FirestoreSource{
    fun getRestaurantData(emitter: SingleEmitter<List<RestaurantData>>) : Observable<List<RestaurantData>>
    fun getNearbySchoolRestaurant(searchText: String, emitter: SingleEmitter<List<RestaurantData>>) : Observable<List<RestaurantData>>
}