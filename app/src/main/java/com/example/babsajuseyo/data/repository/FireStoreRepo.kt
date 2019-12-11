package com.example.babsajuseyo.data.repository

import com.example.babsajuseyo.data.FirestoreSource
import com.example.babsajuseyo.data.source.FirestoreDataSource
import com.example.babsajuseyo.entity.RestaurantData
import io.reactivex.Maybe
import io.reactivex.Single
import io.reactivex.SingleEmitter

import io.reactivex.schedulers.Schedulers

// Repo의 역할은 local/remote source에서 data를 갖고 오는 것.
// 여기선 FireStore에 대한 local/remote source를 가지고 있고, 거기에 정의한 여러 기능의 function들을 갖고있는 repo가 맞을듯.
// 즉 Firestore의 다양한 데이터들을 가져오는 function들을 갖고있는 repo.
class FireStoreRepo: FirestoreSource {


    private val firestoreDataSource = FirestoreDataSource()
    // create는 SingleOnSubscribe interface를 parameter로 받고, 해당 interface는 subscribe(SingleEmitter<T> emitter) method를 갖는다.
    // 따라서 해당 emitter의 onNext(data)를 통해 data 발행을 해주는건데, 여기서는 Single이므로 onSuccess해주는듯?
    override fun getRestaurantData(): Maybe<List<RestaurantData>> = firestoreDataSource.getRestaurantData()

    override fun getNearbySchoolRestaurant(searchText: String): Maybe<List<RestaurantData>> = firestoreDataSource.getNearbySchoolRestaurant(searchText)

}