package com.adndevelopersoftware.viajerocliente.api


import com.adndevelopersoftware.viajerocliente.models.FCMBody
import com.adndevelopersoftware.viajerocliente.models.FCMResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface IFCMApi {

    @Headers(
        "Content-Type:application/json",
        "Authorization:key=SOME_KEY"
    )
    @POST("fcm/send")
    fun send(@Body body: FCMBody): Call<FCMResponse>


}