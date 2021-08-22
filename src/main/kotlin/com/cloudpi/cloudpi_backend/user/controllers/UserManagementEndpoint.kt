package com.cloudpi.cloudpi_backend.user.controllers

import com.cloudpi.cloudpi_backend.user.requests.GetUserResponse
import com.cloudpi.cloudpi_backend.user.requests.GetUsersResponse

interface UserManagementEndpoint {

    fun getAllUsers(): List<GetUsersResponse>

    fun getUser(name: String): GetUserResponse

    fun createNewUser(username: String)

}
