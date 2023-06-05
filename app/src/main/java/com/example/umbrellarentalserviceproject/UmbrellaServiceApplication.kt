package com.example.umbrellarentalserviceproject

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UmbrellaServiceApplication: Application(){
    override fun onCreate() {
        super.onCreate()
    }
}