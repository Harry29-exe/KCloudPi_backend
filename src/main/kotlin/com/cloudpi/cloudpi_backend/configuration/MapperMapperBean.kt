package com.cloudpi.cloudpi_backend.configuration

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MapperMapperBean {

    @Bean
    fun getModelMapper(): ModelMapper {
        return ModelMapper()
    }
}