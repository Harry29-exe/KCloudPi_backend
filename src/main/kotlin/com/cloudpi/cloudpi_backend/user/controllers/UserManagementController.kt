package com.cloudpi.cloudpi_backend.user.controllers

import com.cloudpi.cloudpi_backend.user.responses.GetUserResponse
import com.cloudpi.cloudpi_backend.user.responses.GetUsersResponse
import com.cloudpi.cloudpi_backend.user.requests.PostUserRequest
import com.cloudpi.cloudpi_backend.user.services.UserRepoService
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user-management")
class UserManagementController(
    private val userService: UserRepoService,
    private val modelMapper: ModelMapper,
    @Value("cloud.pi.config.modifications-only-from-local-network")
    managementFromLocalNetworkOnly: String

) {

    private val managementFromLocalNetworkOnly: Boolean = managementFromLocalNetworkOnly == "true"

    @GetMapping("")
    fun getAllUsers(): List<GetUsersResponse> {
        TODO()
    }

    fun getUser(name: String): GetUserResponse {
        TODO("Not yet implemented")
    }

    fun createNewUser(user: PostUserRequest) {
        TODO("Not yet implemented")
    }

}