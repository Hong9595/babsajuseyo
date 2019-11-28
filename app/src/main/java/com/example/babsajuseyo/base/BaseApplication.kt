package com.example.babsajuseyo.base

import android.app.Application
import android.util.Log
import com.example.babsajuseyo.BuildConfig


import com.facebook.stetho.Stetho
import com.google.common.eventbus.EventBus
import io.reactivex.plugins.RxJavaPlugins
import timber.log.Timber

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        setErrorHanlder()

        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
//            Timber.plant(NewDebugTree())
        } else {
            Timber.plant(CrashReportingTree())
        }
    }

    private class CrashReportingTree : Timber.Tree(){
        // error handle logic
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
                return
            }


        }
//        override fun d(t: Throwable?) {
//            t?.printStackTrace()
//        }

    }


    private class NewDebugTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            if(priority != Log.DEBUG){
                return
            }
            // error handle logic
        }
    }

    private fun setErrorHanlder() {
        // onError 가 없거나, onError에서 또 Exception이 나면 오는애
        RxJavaPlugins.setErrorHandler {
//            ErrorHandler.globalHandle(it)
            Timber.tag("RXJAVAERROR").e(it)
        }

    }


}