package com.adndevelopersoftware.viajerocliente.providers

import com.adndevelopersoftware.viajerocliente.api.IFCMApi
import com.adndevelopersoftware.viajerocliente.api.RetrofitClient
import com.adndevelopersoftware.viajerocliente.models.FCMBody
import com.adndevelopersoftware.viajerocliente.models.FCMResponse
import retrofit2.Call

class NotificationProvider {

    private val URL = "https://fcm.googleapis.com"

    fun sendNotification(body: FCMBody): Call<FCMResponse> {
        return RetrofitClient.getClient(URL).create(IFCMApi::class.java).send(body)
    }

}