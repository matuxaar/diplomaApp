package com.example.diplomaapp.domain

import com.example.diplomaapp.data.model.PoleResponse
import com.example.diplomaapp.domain.models.SensorItem
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getRequest(): Flow<SensorItem>
    fun getPoke(): Flow<PoleResponse>
}