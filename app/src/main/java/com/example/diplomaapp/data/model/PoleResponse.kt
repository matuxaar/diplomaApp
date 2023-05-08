package com.example.diplomaapp.data.model

import com.squareup.moshi.Json

//import com.squareup.moshi.Json

data class PoleResponse(
    @Json(name = "count") val count: Int,
    @Json(name = "next") val next: String,
    @Json(name = "previous") val previous: String,
    @Json(name = "results") val results: List<PokeResult> ,
)

data class PokeResult(
    @Json(name = "name") val name: String,
    @Json(name = "url") val url: String,
)