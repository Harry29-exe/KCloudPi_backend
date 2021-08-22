package com.cloudpi.cloudpi_backend.user.mapping

import com.cloudpi.cloudpi_backend.security.CloudPIUser
import com.cloudpi.cloudpi_backend.user.dto.UserDto
import com.cloudpi.cloudpi_backend.user.entities.UserEntity
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.modelmapper.ModelMapper

class UserMappingTests {

    private lateinit var mapper: ModelMapper

    @BeforeEach
    fun setUpMapper() {
        mapper = ModelMapper()

    }

    @Test
    fun should_map_user_entity_to_user_dto() {
        mapper.createTypeMap(UserEntity::class.java, UserDto::class.java)
        mapper.validate()
    }

    @Test
    fun `should validate mapping UserDto to UserEntity`() {
        mapper.createTypeMap(UserDto::class.java, UserEntity::class.java)
        mapper.validate()
    }

    @Test
    fun should_validate_user_entity_to_cloudpi_user() {
        mapper.createTypeMap(UserEntity::class.java, CloudPIUser::class.java)
        mapper.validate()
    }
}