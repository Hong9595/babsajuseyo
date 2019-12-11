package com.example.babsajuseyo.restaurantList

import com.example.babsajuseyo.base.BasePresenter
import com.example.babsajuseyo.data.repository.FireStoreRepo
import com.example.babsajuseyo.data.repository.RestaurantRepo
import com.example.babsajuseyo.entity.RestaurantData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableMaybeObserver

import io.reactivex.rxkotlin.plusAssign
import io.reactivex.rxkotlin.subscribeBy
import timber.log.Timber

class RestaurantPresenter : BasePresenter<RestaurantContractor.View>(), RestaurantContractor.Presenter{

    private val fireStoreRepo by lazy{ // 여기에 .getRestaurant()를 쓴다. getRestaurant()는 firebase에서 data를 가져옴.
        FireStoreRepo()
    }

    // Maybe<QuerySnapShot> -> Maybe<List<RestaurantData>>
    override fun loadRestaurantList() {
        compositeDisposble += fireStoreRepo.getRestaurantData()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onSuccess = { view?.showRestaurantData(it)},
                onComplete = { Timber.tag("FireStoreRestaurant").d("get null")},
                onError = {Timber.e(it)}
            )
    }
}