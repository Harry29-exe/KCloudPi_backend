package com.cloudpi.cloudpi_backend.user.controllers

import com.cloudpi.cloudpi_backend.user.dto.UserDto
import com.cloudpi.cloudpi_backend.user.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/user-management")
class UserManagementController(val userRepository: UserRepository) {

    @GetMapping("")
    fun getUsers(): List<UserDto> {
        val userEntities = userRepository.findAll()
        val users = ArrayList<UserDto>(userEntities.size);
        userEntities.forEach { u ->
            users.add(UserDto(u.username, u.email))
        }

        return users;
    }

}