package com.example.myapplication.Interface


import com.example.myapplication.Model.News
import com.example.myapplication.Model.WebSite
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface NewsService {
    @get:GET("v2/sources?apiKey=badf604cf4ed4dd1988a2aca17763ce7")
    val sources: Call<WebSite>
    //website는 모델 클래스

    @GET
    fun getNewsFromSource(@Url url:String):Call<News>
}