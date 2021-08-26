package com.cloudpi.cloudpi_backend.configuration.model_mapper

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider
import org.springframework.context.annotation.Configuration
import org.springframework.core.type.filter.AnnotationTypeFilter

@Configuration
class ModelMapperBean {


    @Bean
    fun getModelMapper(): ModelMapper {
        val scanner =
        ClassPathScanningCandidateComponentProvider(true);

        scanner.addIncludeFilter(AnnotationTypeFilter(ModelMapperConfig::class.java));

        for (bd in scanner.findCandidateComponents("com.cloudpi.cloudpi_backend")) {
            println(bd.beanClassName);
        }

        val modelMapper = ModelMapper()
//        initMethods.forEach {
//            method -> method.addMappingToModelMapper(modelMapper)
//        }

        return modelMapper
    }
}

