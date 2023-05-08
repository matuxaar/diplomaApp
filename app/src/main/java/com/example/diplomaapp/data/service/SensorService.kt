package com.example.diplomaapp.data.service

import com.example.diplomaapp.data.model.SensorResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface SensorService {
    @GET("Security/get-data")
    suspend fun getData(): SensorResponse
}