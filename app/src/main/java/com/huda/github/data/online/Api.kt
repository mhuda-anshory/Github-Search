package com.huda.github.data.online

import com.huda.github.data.online.response.DetailUserResponse
import com.huda.github.data.online.response.SearchUserResponse
import com.huda.github.data.online.response.UserResponse
import com.huda.github.utils.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("users")
    @Headers("Authorization: token ${Constants.GITHUB_TOKEN}")
    fun getUsers(): Call<ArrayList<UserResponse>>

    @GET("search/users")
    @Headers("Authorization: token ${Constants.GITHUB_TOKEN}")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<SearchUserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token ${Constants.GITHUB_TOKEN}")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token ${Constants.GITHUB_TOKEN}")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<UserResponse>>

    @GET("users/{username}/following")
    @Headers("Authorization: token ${Constants.GITHUB_TOKEN}")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<UserResponse>>
}