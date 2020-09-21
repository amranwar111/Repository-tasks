package com.example.news.main

import com.google.gson.annotations.SerializedName

class RepoOwner(
    @SerializedName("login") val userName: String,
    @SerializedName("html_url") val userURL: String
)