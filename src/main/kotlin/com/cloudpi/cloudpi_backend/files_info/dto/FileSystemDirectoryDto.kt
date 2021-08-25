package com.cloudpi.cloudpi_backend.files_info.dto

data class FileSystemDirectoryDto (
    val fileId: Long,
    val name: String,
    val childrenFiles: List<FileIdDto>,
    val childrenDirectories: List<FileSystemDirectoryDto>
)