package com.huda.github.data.online.response

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("login")
    val username : String,
    @SerializedName("avatar_url")
    val avatarUrl : String,
    @SerializedName("html_url")
    val htmlUrl : String,
    @SerializedName("id")
    val id: Int
)
