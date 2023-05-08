package com.example.diplomaapp.data.model

import com.squareup.moshi.Json

//import com.squareup.moshi.Json

data class SensorResponse(
    @Json(name = "lastTiggered") val lastTriggered: String? = null,
    @Json(name = "status") val status: Boolean? = null,
    @Json(name = "myProperty") val myProperty: String? = null,
    @Json(name = "triggerCount") val triggerCount: Int? = null,
    @Json(name = "violationType") val violationType: String? = null,
    @Json(name = "location") val location: String? = null,
    @Json(name = "statusInfo") val statusInfo: String? = null
)