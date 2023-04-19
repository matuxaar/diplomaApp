package com.example.diplomaapp.data

import com.example.diplomaapp.domain.models.SensorItem

class SensorItemMapper {
    operator fun invoke(response: SensorResponse): SensorItem {
        return SensorItem(
            lastTriggered = response.lastTriggered.orEmpty(),
            status = response.status ?: false,
            myProperty = response.myProperty.orEmpty(),
            triggerCount = response.triggerCount ?: 0,
            violationType = response.violationType.orEmpty(),
            location = response.location.orEmpty(),
            statusInfo = response.location.orEmpty()
        )
    }
}