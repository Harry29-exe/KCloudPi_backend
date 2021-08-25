package com.cloudpi.cloudpi_backend.files_info.dto

data class FileSystemDto(
    val root: FileSystemDirectoryDto,
    val rootPath: String
)

