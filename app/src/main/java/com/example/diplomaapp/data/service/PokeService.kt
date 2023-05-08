package com.example.diplomaapp.data.service

import com.example.diplomaapp.data.model.PoleResponse
import retrofit2.http.GET

interface PokeService {

    @GET ("ability/?limit=20&offset=20")
    suspend fun getPoke(): PoleResponse

}