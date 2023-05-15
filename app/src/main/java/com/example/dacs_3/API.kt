package com.example.dacs_3

import retrofit2.http.Body
import retrofit2.http.POST
import com.example.dacs_3.Model.Account

interface API {
    @POST("register.php")
    suspend fun Register(@Body account:Account)

    @POST("login.php")
    suspend fun Login(@Body account:Account):Account
}