package com.example.diplomaapp.ui.sensor

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.diplomaapp.domain.Repository
import com.example.diplomaapp.domain.models.SensorItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

class SensorViewModel @Inject constructor(
    private val repository: Repository
)  : ViewModel() {

    private val _sensorLiveData = MutableLiveData<SensorItem>()
    val sensorLiveData: LiveData<SensorItem> = _sensorLiveData

    fun getSensor() {

        repository.getRequest()
            .onEach { _sensorLiveData.value = it }
            .launchIn(viewModelScope)

//        repository.getPoke()
//            .onEach {
//                Log.d("BLABLA", it.results.joinToString())
//            }
//            .launchIn(viewModelScope)
    }
}