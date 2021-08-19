package com.cloudpi.cloudpi_backend.user.controllers

import com.cloudpi.cloudpi_backend.security.AccountType
import com.cloudpi.cloudpi_backend.user.dto.UserDto
import com.cloudpi.cloudpi_backend.user.entities.UserEntity
import com.cloudpi.cloudpi_backend.user.repositories.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user-management")
class UserManagementController(val userRepository: UserRepository) {

    @GetMapping("")
    fun getUsers(): List<UserDto> {
        val userEntities = userRepository.findAll()
        val users = ArrayList<UserDto>(userEntities.size)
        userEntities.forEach { u ->
            users.add(UserDto(u.username))
        }

        return users
    }

    @PostMapping("")
    fun saveUser() {
        userRepository.save(UserEntity(0, "we", "we", false, ArrayList(), AccountType.USER, ""))

    }

    @GetMapping("/1")
    fun test(): String {
        return "we2"
    }

}