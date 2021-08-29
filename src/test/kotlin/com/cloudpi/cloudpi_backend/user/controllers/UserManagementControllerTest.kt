package com.cloudpi.cloudpi_backend.user.controllers

import com.cloudpi.cloudpi_backend.security.AccountType
import com.cloudpi.cloudpi_backend.user.dto.UserDto
import com.cloudpi.cloudpi_backend.user.services.UserRepoService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito
import org.mockito.Mockito.doReturn
import org.mockito.junit.jupiter.MockitoExtension
import org.modelmapper.ModelMapper
import org.springframework.test.util.ReflectionTestUtils
import java.util.*
import kotlin.collections.ArrayList


@ExtendWith(MockitoExtension::class)
class UserManagementControllerTest {

    private var userService = Mockito.mock(UserRepoService::class.java)
    private var modelMapper = ModelMapper()
    private var userController = UserManagementController(userService, modelMapper, "true")


    @BeforeEach
    fun setUp() {
        userService = Mockito.mock(UserRepoService::class.java)
        modelMapper = ModelMapper()
        userController = UserManagementController(userService, modelMapper, "true")
    }

    private fun setModificationsOnlyFromLocalNetwork(value: Boolean) {
        ReflectionTestUtils.setField(userController, "managementFromLocalNetworkOnly", value)
    }


    @Test
    fun createNewUser() {
        //given
        setModificationsOnlyFromLocalNetwork(false)
        val userDto = UserDto(1L, "root", "root@root", "root", "password", false, AccountType.ROOT, ArrayList())
        doReturn(Optional.of(userDto)).`when`(userService).getUser("")
        //when
//        userController.createNewUser()

    }
}