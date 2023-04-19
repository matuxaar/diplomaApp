package com.example.diplomaapp

import android.app.Application
import com.example.diplomaapp.di.ApplicationComponent
import com.example.diplomaapp.di.DaggerApplicationComponent

class DaggerApp : Application() {
   val appComponent: ApplicationComponent by lazy {
       DaggerApplicationComponent.factory().create(applicationContext)
   }
}