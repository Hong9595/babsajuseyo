package com.example.babsajuseyo.base

import io.reactivex.disposables.CompositeDisposable

open class BasePresenter<T>{
    var view: T? = null
        protected set

    protected val compositeDisposble = CompositeDisposable()

    fun attachView(view: T){
        this.view = view
    }

    fun detachView(){
        this.view = null
        if(!compositeDisposble.isDisposed){
            compositeDisposble.clear()
        }
    }

}