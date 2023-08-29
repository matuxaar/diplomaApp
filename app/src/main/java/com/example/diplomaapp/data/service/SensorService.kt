package com.example.diplomaapp.data.service

import com.example.diplomaapp.data.model.SensorResponse
import retrofit2.http.GET

interface SensorService {
    @GET("Security/get-data")
    suspend fun getData(): SensorResponse
}