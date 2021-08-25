package com.cloudpi.cloudpi_backend.user.controllers

import com.cloudpi.cloudpi_backend.user.responses.GetUserResponse
import com.cloudpi.cloudpi_backend.user.responses.GetUsersResponse
import com.cloudpi.cloudpi_backend.user.requests.PostUserRequest
import org.springframework.web.bind.annotation.RequestBody

interface UserManagementEndpoint {

    fun getAllUsers(): List<GetUsersResponse>

    fun getUser(name: String): GetUserResponse

    fun createNewUser(user: PostUserRequest)

    fun scheduleUserDelete(name: String)


}
