package com.khibar.mobdev.network

import android.util.Base64
import com.khibar.mobdev.data.ResponseLogin
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiEndpoint {

    @FormUrlEncoded
    @POST("login")
    fun Login(
        @Field("email") email:String,
        @Field("password") password:String
    ):Call<ResponseLogin>

}