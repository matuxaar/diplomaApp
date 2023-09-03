package com.example.diplomaapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [SensorEntity::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun getCartDao(): SensorDao
}
