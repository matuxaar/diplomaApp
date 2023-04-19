package com.example.diplomaapp.data

import com.squareup.moshi.Json

//import com.squareup.moshi.Json

data class SensorResponse(
    //var nameSensor : String  = ""
    //@Json(name = "result") val user: UserItemRequest? = null,
    //@Json(name = "isSuccess") val isSuccess: Boolean? = null,

    @Json(name = "lastTriggered") val lastTriggered: String? = null,
    @Json(name = "status") val status: Boolean? = null,
    @Json(name = "myProperty") val myProperty: String? = null,
    @Json(name = "triggerCount") val triggerCount: Int? = null,
    @Json(name = "violationType") val violationType: String? = null,
    @Json(name = "location") val location: String? = null,
    @Json(name = "statusInfo") val statusInfo: String? = null
)