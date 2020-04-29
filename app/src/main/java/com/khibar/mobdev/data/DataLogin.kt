package com.khibar.mobdev.data

import com.google.gson.annotations.SerializedName

data class DataLogin (

    @SerializedName("id") val id : Int,
    @SerializedName("name") val name : String,
    @SerializedName("email") val email : String,
    @SerializedName("api_token") val api_token : String
)