package com.example.homework13
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitClient {

    @GET("/v3/3588163c-a9c8-488c-af9a-534b392e7128")
    suspend fun getItmes(): Response<Items>

}