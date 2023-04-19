package com.example.diplomaapp.data

import com.example.diplomaapp.domain.models.SensorItem

class SensorItemMapper {
    operator fun invoke(response: SensorResponse): SensorItem {
        return SensorItem(
            nameSensor = response.nameSensor
        )
    }
}