package com.example.diplomaapp.domain.models

import com.squareup.moshi.Json

data class SensorItem(
    //var nameSensor : String  = ""
    //@Json(name = "result") val user: UserItemRequest? = null,
    //@Json(name = "isSuccess") val isSuccess: Boolean? = null,
    val lastTriggered: String,
    val status: Boolean,
    val myProperty: String,
    val triggerCount: Int,
    val violationType: String,
    val location: String,
    val statusInfo: String

)