package com.cloudpi.cloudpi_backend.configuration.model_mapper

import org.modelmapper.ModelMapper

interface MapFunction {
    fun addMappingToModelMapper(modelMapper: ModelMapper)
}