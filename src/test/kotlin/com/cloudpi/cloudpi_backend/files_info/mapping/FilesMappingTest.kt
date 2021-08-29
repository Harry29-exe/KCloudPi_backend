package com.cloudpi.cloudpi_backend.files_info.mapping

import com.cloudpi.cloudpi_backend.configuration.model_mapper.ModelMapperBean
import com.cloudpi.cloudpi_backend.files_info.dto.DirectoryDto
import com.cloudpi.cloudpi_backend.files_info.dto.FileDto
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.modelmapper.ModelMapper
import java.util.*

class FilesMappingTest {
    private var modelMapperBean: ModelMapperBean = ModelMapperBean()
    private var modelMapper: ModelMapper = ModelMapper()

    @BeforeEach
    fun setUp() {
        modelMapper = ModelMapper()
        modelMapperBean.applyMappingsFromPackage(modelMapper, "com.cloudpi.cloudpi_backend.files_info")
    }

    @Test
    fun `should map DirectoryEntity to DirectoryDto`() {
//        val directoryEntity = FileDto(1L, 0L, "dir", "/", Date(), Date(), Date(), 0L)
        modelMapper.createTypeMap(FileDto::class.java, DirectoryDto::class.java)
        modelMapper.validate()
    }
}