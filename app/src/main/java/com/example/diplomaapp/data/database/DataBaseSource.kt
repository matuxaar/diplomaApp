package com.example.diplomaapp.data.database

import javax.inject.Inject

class DataBaseSource @Inject constructor(
    private val cartDao: SensorDao,
) {
    fun getAll(): List<SensorEntity> = cartDao.getAll()

    fun insert(product: SensorEntity) = cartDao.insert(product)

    fun delete(products: List<SensorEntity>) = cartDao.delete(products)
}