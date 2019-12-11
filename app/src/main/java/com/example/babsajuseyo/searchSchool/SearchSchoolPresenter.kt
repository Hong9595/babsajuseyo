package com.example.babsajuseyo.searchSchool

import com.example.babsajuseyo.base.BasePresenter
import com.example.babsajuseyo.data.repository.FireStoreRepo
import com.example.babsajuseyo.entity.RestaurantData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.util.HalfSerializer.onNext
import io.reactivex.observers.DisposableObserver
import io.reactivex.rxkotlin.plusAssign
import io.reactivex.rxkotlin.subscribeBy
import timber.log.Timber

class SearchSchoolPresenter : BasePresenter<SearchSchoolContract.View>(),SearchSchoolContract.Presenter {
    private val firestoreRepo by lazy {
        FireStoreRepo()
    }
    override fun loadNearbyRestaurant(searchText: String) {
        compositeDisposble += firestoreRepo.getNearbySchoolRestaurant(searchText)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy (
                onSuccess = { view?.showNearbyRestaurant(it)},
                onComplete = {},
                onError = { Timber.e(it) }
            )
    }
}