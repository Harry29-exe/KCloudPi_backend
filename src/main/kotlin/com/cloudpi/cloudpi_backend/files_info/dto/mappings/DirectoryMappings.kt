package com.cloudpi.cloudpi_backend.files_info.dto.mappings

import com.cloudpi.cloudpi_backend.configuration.model_mapper.ModelMapperConfig
import com.cloudpi.cloudpi_backend.configuration.model_mapper.MapFunction
import org.modelmapper.ModelMapper

@ModelMapperConfig
class DirectoryMappings : MapFunction {

    override fun addMappingToModelMapper(modelMapper: ModelMapper) {
        println("dir")
    }
}