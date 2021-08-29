package com.cloudpi.cloudpi_backend.configuration.model_mapper

import org.modelmapper.ModelMapper
import org.reflections.Reflections
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.lang.reflect.Constructor


@Configuration
class ModelMapperBean {


    @Bean
    fun getModelMapper(): ModelMapper {
        val modelMapper = ModelMapper()

        applyMappingsFromPackage(modelMapper, "com.cloudpi.cloudpi_backend")


        return modelMapper
    }

    fun applyMappingsFromPackage(modelMapper: ModelMapper, packageName: String) {
        val reflections = Reflections(packageName)
        val results = reflections.getSubTypesOf(MapFunction::class.java)

        for (result in results) {
            var instance: MapFunction? = null

            for(constructor in result.constructors) {
                if(constructor.parameterCount == 0) {
                    val temp = constructor.newInstance()
                    if(temp is MapFunction) {
                        instance = temp
                        break
                    }
                }
            }

            if(instance == null) {
                throw Exception("MapFunction has to have no args constructor")
            }

            instance.addMappingToModelMapper(modelMapper)
            println(result)
        }
    }
}

