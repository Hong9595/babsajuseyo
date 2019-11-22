package com.example.babsajuseyo.base

import android.app.Application
import android.util.Log
import com.example.babsajuseyo.BuildConfig


import com.facebook.stetho.Stetho
import timber.log.Timber

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
//            Timber.plant(NewDebugTree())
        } else {
            Timber.plant(CrashReportingTree())
        }
    }

    private class CrashReportingTree : Timber.Tree(){
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
                return
            }
            // error handle logic
        }
    }


    private class NewDebugTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            if(priority != Log.DEBUG){
                return
            }
            // error handle logic
        }
    }


}