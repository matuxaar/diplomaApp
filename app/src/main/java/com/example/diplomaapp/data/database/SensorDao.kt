package com.example.diplomaapp.data.database

import androidx.room.*

@Dao
interface SensorDao {
    @Query("SELECT * FROM sensor_table")
    fun getAll(): List<SensorEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(sensors: SensorEntity)

    @Delete
    fun delete(sensors: List<SensorEntity>)
}