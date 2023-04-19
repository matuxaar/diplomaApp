package com.example.diplomaapp.di

import android.content.Context
import com.example.diplomaapp.MainActivity
import com.example.diplomaapp.di.modules.NetworkModule
import com.example.diplomaapp.di.modules.ViewModelModule
import com.example.diplomaapp.ui.sensor.SensorFragment

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelModule::class, NetworkModule::class])
interface ApplicationComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: SensorFragment)
}