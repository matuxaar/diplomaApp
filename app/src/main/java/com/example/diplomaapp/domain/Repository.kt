package com.example.diplomaapp.domain

import com.example.diplomaapp.domain.models.SensorItem
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getRequest(): Flow<SensorItem>
}