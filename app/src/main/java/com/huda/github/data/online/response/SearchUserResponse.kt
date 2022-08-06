package com.huda.github.data.online.response

import com.google.gson.annotations.SerializedName

data class SearchUserResponse(
    @SerializedName("total_count")
    val totalUserFound: Int,
    @SerializedName("items")
    val listSearchResult: ArrayList<UserResponse>
)
