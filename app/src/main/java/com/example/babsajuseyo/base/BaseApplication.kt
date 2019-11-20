package com.example.babsajuseyo.base

import android.app.Application
import com.facebook.stetho.Stetho

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }
}