package com.example.babsajuseyo.restaurantList

import android.util.Log
import com.example.babsajuseyo.base.BasePresenter
import com.example.babsajuseyo.data.repository.RestaurantRepo
import com.example.babsajuseyo.entity.PlayingListData
import com.example.babsajuseyo.entity.RestaurantData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.rxkotlin.plusAssign
import io.reactivex.rxkotlin.subscribeBy

class RestaurantPresenter : BasePresenter<RestaurantContractor.View>(), RestaurantContractor.Presenter{

    private val restaurantRepo by lazy {
        RestaurantRepo()
    }

    override fun loadItem() {
//        var list = mutableListOf<RestaurantData>()
//        view?.showRestaurantData(list)

        compositeDisposble += restaurantRepo.getPlayingList()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy (
                onSuccess = { view?.showRestaurantData(it) },
                onError = { it.printStackTrace() }
            )
//            .subscribeWith(object: DisposableSingleObserver<List<PlayingListData>>(){
//                override fun onSuccess(t: List<PlayingListData>) {
//                    view?.showRestaurantData(t)
//                }
//
//                override fun onError(e: Throwable) {
//                    e.printStackTrace()
//                }
//            })

    }
}