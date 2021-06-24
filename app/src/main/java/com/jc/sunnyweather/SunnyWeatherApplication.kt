package com.jc.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication:Application() {

    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "填入你申请到的令牌值"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}