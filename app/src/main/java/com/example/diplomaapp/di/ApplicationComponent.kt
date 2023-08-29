package com.example.diplomaapp.di

import android.content.Context
import com.example.diplomaapp.MainActivity
import com.example.diplomaapp.di.modules.NetworkModule
import com.example.diplomaapp.di.modules.RepositoryModule
import com.example.diplomaapp.di.modules.ViewModelModule
import com.example.diplomaapp.ui.sensor.SensorListFragment

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelModule::class, NetworkModule::class, RepositoryModule::class])
interface ApplicationComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: SensorListFragment)
}