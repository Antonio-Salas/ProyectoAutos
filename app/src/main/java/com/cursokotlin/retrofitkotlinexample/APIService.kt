package com.cursokotlin.retrofitkotlinexample

import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by aristidesguimeraorozco on 29/4/18.
 */
interface APIService {
    @GET
    fun getUser(@Url url: String): Call<getUserRes>

    @GET
    fun buscarSerie(@Url url: String): Call<buscarSerie>
}
