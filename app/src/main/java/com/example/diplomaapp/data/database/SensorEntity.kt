package com.example.diplomaapp.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "sensor_table", primaryKeys = ["lastTriggered", "statusInfo"])
data class SensorEntity(
    @ColumnInfo val lastTriggered: String,
    @ColumnInfo val status: Boolean,
    @ColumnInfo val myProperty: String,
    @ColumnInfo val triggerCount: Int,
    @ColumnInfo val violationType: String,
    @ColumnInfo val location: String,
    @ColumnInfo val statusInfo: String
)
