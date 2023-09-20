package com.example.diplomaapp.data.mappers

import com.example.diplomaapp.data.database.SensorEntity
import com.example.diplomaapp.data.model.SensorResponse
import com.example.diplomaapp.domain.models.SensorItem
import javax.inject.Inject

class SensorEntityMapper @Inject constructor() {

    operator fun invoke(
        response: SensorResponse,
    ): SensorEntity = with(response) {
        return SensorEntity(
            lastTriggered = lastTriggered.orEmpty(),
            status = status ?: false,
            myProperty = myProperty.orEmpty(),
            triggerCount = triggerCount ?: -1,
            violationType = violationType.orEmpty(),
            location = location.orEmpty(),
            statusInfo = statusInfo.orEmpty()
        )
    }

    operator fun invoke(
        response: SensorItem,
    ): SensorEntity = with(response) {
        return SensorEntity(
            lastTriggered = lastTriggered,
            status = status,
            myProperty = myProperty,
            triggerCount = triggerCount,
            violationType = violationType,
            location = location,
            statusInfo = statusInfo
        )
    }
}