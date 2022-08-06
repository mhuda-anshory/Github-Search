package com.huda.github.utils

import com.huda.github.data.UserEntity
import com.huda.github.data.online.response.UserResponse

object DataMapper {

    fun mapResponseToEntity(response: UserResponse): UserEntity{
        return UserEntity(
            response.id,
            response.username,
            response.avatarUrl,
            response.htmlUrl
        )
    }

    fun mapResponsesToEntities(responses: List<UserResponse>): List<UserEntity>{
        return responses.map {
            mapResponseToEntity(it)
        }
    }

}