package com.example.diplomaapp.di.modules

import android.content.Context
import androidx.room.Room
import com.example.diplomaapp.data.database.AppDataBase
import com.example.diplomaapp.data.database.SensorDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Provides
    @Singleton
    fun provideDataBase(context: Context): AppDataBase {
        return Room.databaseBuilder(context, AppDataBase::class.java, DATABASE_NAME)
            .build()
    }

    @Provides
    @Singleton
    fun provideProductDao(db: AppDataBase): SensorDao = db.getCartDao()

    companion object{
        private const val DATABASE_NAME =  "database-name"
    }
}