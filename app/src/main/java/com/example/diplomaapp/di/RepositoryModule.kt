package com.example.diplomaapp.di

import com.example.diplomaapp.data.service.RepositoryImpl
import com.example.diplomaapp.domain.Repository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun getRepository(repositoryImpl: RepositoryImpl): Repository
}