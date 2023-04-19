package com.example.diplomaapp.di.modules

import androidx.lifecycle.ViewModel
import com.example.diplomaapp.di.viewModel.ViewModelKey
import com.example.diplomaapp.ui.sensor.SensorViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(SensorViewModel::class)
    fun bindLoginViewModel(viewModel: SensorViewModel): ViewModel
}
