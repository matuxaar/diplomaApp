package com.example.diplomaapp.data.service

import com.example.diplomaapp.data.SensorResponse
import retrofit2.http.GET

interface SensorService {
    @GET("get-data")
    suspend fun getData(): SensorResponse
}