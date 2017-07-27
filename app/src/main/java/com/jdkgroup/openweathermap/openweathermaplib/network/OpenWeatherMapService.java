package com.jdkgroup.openweathermap.openweathermaplib.network;

import com.jdkgroup.openweathermap.openweathermaplib.models.CurrentWeather;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Kwabena Berko on 7/25/2017.
 */

public interface OpenWeatherMapService {
    @GET("/data/2.5/weather")
    Call<CurrentWeather> getCurrentWeatherByCityName(@QueryMap Map<String, String> options);

    @GET("/data/2.5/weather")
    Call<CurrentWeather> getCurrentWeatherByCityID(@QueryMap Map<String, String> options);

    @GET("/data/2.5/weather")
    Call<CurrentWeather> getCurrentWeatherByGeoCoordinates(@QueryMap Map<String, String> optionse);

    @GET("/data/2.5/weather")
    Call<CurrentWeather> getCurrentWeatherByZipCode(@QueryMap Map<String, String> options);
}
