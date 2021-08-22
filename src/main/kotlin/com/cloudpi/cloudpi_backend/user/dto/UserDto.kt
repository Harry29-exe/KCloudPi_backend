package com.cloudpi.cloudpi_backend.user.dto

import com.cloudpi.cloudpi_backend.security.AccountType
import com.cloudpi.cloudpi_backend.user.entities.UserEntity
import javax.validation.constraints.NotEmpty

data class UserDto(
    val id: Long,
    val username: @NotEmpty String,
    val nickname: @NotEmpty String,
    val password: @NotEmpty String,
    val locked: Boolean,
    val userRole: AccountType,
    val permissions: MutableList<String>? = null
) {

    constructor(userEntity: UserEntity) :
            this(userEntity.id, userEntity.username,
                userEntity.nickname, userEntity.password,
                userEntity.locked, userEntity.accountType,
                userEntity.permissions.map { p -> p.permission } as MutableList<String>)

//    constructor(id: Long,
//                username: String,
//                nickname: String,
//                password:  String,
//                locked: Boolean,
//                userRole: AccountType,
//                permissions: MutableList<String>, we: String) : this(id, username, nickname, password, locked, userRole, permissions)
//
}