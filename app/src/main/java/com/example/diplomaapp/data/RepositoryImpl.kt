package com.example.diplomaapp.data

import android.util.Log
import com.example.diplomaapp.data.service.SensorService
import com.example.diplomaapp.domain.Repository
import com.example.diplomaapp.domain.models.SensorItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val sensorItemMapper: SensorItemMapper,
    private val sensorService: SensorService,
) : Repository {
    override fun getRequest(): Flow<SensorItem> = flow {
        val data = sensorItemMapper(sensorService.getData())
        emit(data)
    }.catch {
        Log.d("BLABLA", it.message.toString())
    }
        .flowOn(Dispatchers.IO)

}