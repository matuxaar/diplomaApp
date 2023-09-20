package com.example.diplomaapp.data.service

import android.util.Log
import com.example.diplomaapp.data.database.DataBaseSource
import com.example.diplomaapp.data.mappers.SensorEntityMapper
import com.example.diplomaapp.data.mappers.SensorItemMapper
import com.example.diplomaapp.data.model.PoleResponse
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
    private val pokeService: PokeService,
    private val sensorDataBase: DataBaseSource,
    private val sensorEntityMapper: SensorEntityMapper
) : Repository {
    override fun getRequest(): Flow<SensorItem> = flow {
        val data = sensorItemMapper(sensorService.getData())
        sensorDataBase.insert(sensorEntityMapper.invoke(data))
        emit(data)
    }.catch {
        Log.d("Network error", it.message.toString())
    }
        .flowOn(Dispatchers.IO)


    override fun getPoke(): Flow<PoleResponse> {
        return flow {
            emit(pokeService.getPoke())
        }
    }
}