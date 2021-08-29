package com.cloudpi.cloudpi_backend.files_info.entities

import com.cloudpi.cloudpi_backend.user.entities.UserEntity
import javax.persistence.*
//
//@Entity
//@DiscriminatorValue("DIRECTORY")
//class DirectoryEntity(
//    id: Long,
//    fileName: String,
//    filePath: String,
//    owner: UserEntity,
//    parent: FilesystemObjectEntity?,
//    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
//    var children: MutableList<FilesystemObjectEntity>
//) : FilesystemObjectEntity(id, fileName, filePath, owner, parent) {
//
//}