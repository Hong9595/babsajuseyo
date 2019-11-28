package com.example.babsajuseyo.restaurantList

import com.example.babsajuseyo.base.BasePresenter
import com.example.babsajuseyo.data.repository.FireStoreRepo
import com.example.babsajuseyo.data.repository.RestaurantRepo
import io.reactivex.android.schedulers.AndroidSchedulers

import io.reactivex.rxkotlin.plusAssign
import io.reactivex.rxkotlin.subscribeBy
import timber.log.Timber

class RestaurantPresenter : BasePresenter<RestaurantContractor.View>(), RestaurantContractor.Presenter{

    private val restaurantRepo by lazy {
        RestaurantRepo()
    }

    private val fireStoreRepo by lazy{ // 여기에 .getRestaurant()를 쓴다. getRestaurant()는 firebase에서 data를 가져옴.
        FireStoreRepo()
    }

//    override fun loadItem() {
//        compositeDisposble += restaurantRepo.getPlayingList()
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribeBy (
//                onSuccess = { view?.showRestaurantData(it) },
//                onError = { it.printStackTrace() }
//            )
//    }

    //onComplete, onNext, onError
    override fun loadRestaurantList() {
        compositeDisposble += fireStoreRepo.getRestaurant()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy (
                onNext = { view?.showRestaurantData(it)},
                onError = { Timber.e(it) },
                onComplete = {}
            )
    }
}