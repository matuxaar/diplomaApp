package com.example.diplomaapp.ui.sensor

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.diplomaapp.DaggerApp
import com.example.diplomaapp.R
import com.example.diplomaapp.di.viewModel.ViewModelFactory
import javax.inject.Inject

class SensorListFragment : Fragment(R.layout.fragment_sensor_list) {

    @Inject
    lateinit var factory: ViewModelFactory
    private val viewModel: SensorViewModel by viewModels { factory }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().applicationContext as DaggerApp).appComponent.inject(this)
    }
}