package com.cloudpi.cloudpi_backend.user.dto

import com.cloudpi.cloudpi_backend.user.entities.UserEntity
import javax.validation.constraints.NotEmpty

data class UserDto(
    val id: Long,
    val username: @NotEmpty String,
    val nickname: @NotEmpty String,
    val password: @NotEmpty String,
    val locked: Boolean,

) {
    constructor(userEntity: UserEntity) :
            this()
}