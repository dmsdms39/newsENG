package com.example.myapplication.Common

import com.example.myapplication.Interface.NewsService
import com.example.myapplication.Remote.RetrofitClient
import java.lang.StringBuilder

object Common{
    val BASE_URL = "https://newsapi.org/"
    val API_KEY="badf604cf4ed4dd1988a2aca17763ce7"

//implement interfece new service

    val newsService:NewsService
    get()=RetrofitClient.getClient(BASE_URL).create(NewsService::class.java)

    //get news
    fun getNewsAPI(source:String):String{
        val apiUrl = StringBuilder("http://newsapi.org/v2/top-headlines?sources=")
            .append(source)
            .append("&apiKey=")
            .append(API_KEY)
            .toString()
        return apiUrl
    }
}