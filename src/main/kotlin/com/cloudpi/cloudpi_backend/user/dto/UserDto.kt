package com.cloudpi.cloudpi_backend.user.dto

import javax.validation.Valid
import javax.validation.constraints.NotEmpty

data class UserDto(
    val username: @NotEmpty String,
    val email: @NotEmpty String,
) {
}