package com.cloudpi.cloudpi_backend.user.controllers

import com.cloudpi.cloudpi_backend.user.requests.GetUsersResponse
import com.cloudpi.cloudpi_backend.user.services.UserRepoService
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
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

    val managementFromLocalNetworkOnly: Boolean

    init {
        println(managementFromLocalNetworkOnly)
        this.managementFromLocalNetworkOnly = managementFromLocalNetworkOnly == "true"
    }

    @GetMapping("")
    fun getAllUsers(): List<GetUsersResponse> {
        TODO()
    }

    @PostMapping("")
    fun createNewUser() {
        TODO()
    }

}