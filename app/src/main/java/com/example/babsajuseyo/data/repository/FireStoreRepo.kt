package com.example.babsajuseyo.data.repository

import com.example.babsajuseyo.data.source.FireStoreSource
import com.example.babsajuseyo.entity.RestaurantData
import io.reactivex.Single

import io.reactivex.schedulers.Schedulers

// Repo의 역할은 local/remote source에서 data를 갖고 오는 것.
// 여기선 FireStore에 대한 source를 여러개 갖고있는 repo가 맞을듯. 즉 Firestore의 다양한 데이터들을 가져오는 function들을 갖고있는 repo.
class FireStoreRepo {
    private val fireStoreSource = FireStoreSource()
    // create는 SingleOnSubscribe interface를 parameter로 받고, 해당 interface는 subscribe(SingleEmitter<T> emitter) method를 갖는다.
    // 따라서 해당 emitter의 onNext(data)를 통해 data 발행을 해주는건데, 여기서는 Single이므로 onSuccess해주는듯?
    fun getRestaurant() =
        Single.create<List<RestaurantData>> { emitter ->
            fireStoreSource.getRestaurantData(emitter)
        }
            .subscribeOn(Schedulers.io())
            .toObservable()


}