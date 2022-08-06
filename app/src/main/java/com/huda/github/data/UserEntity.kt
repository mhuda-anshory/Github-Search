package com.huda.github.data


import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "user_entity")
data class UserEntity(
    @PrimaryKey
    val id: Int,
    val username: String,
    val avatarUrl: String,
    val htmlUrl: String

):Serializable
