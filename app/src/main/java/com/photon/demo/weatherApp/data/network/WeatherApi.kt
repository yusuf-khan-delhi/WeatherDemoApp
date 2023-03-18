package com.photon.demo.weatherApp.data.network

import com.photon.demo.weatherApp.model.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface WeatherApi {

    @GET
    suspend fun getWeatherData(@Url url: String?): Response<WeatherResponse>

}