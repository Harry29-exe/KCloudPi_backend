package com.cloudpi.cloudpi_backend.files_info.entities

import com.cloudpi.cloudpi_backend.user.entities.UserEntity
import javax.persistence.*

@Entity
@DiscriminatorValue("FILE")
class FileEntity(
    @Column(nullable = false)
    var size: Long,
    name: String,
    relativePath: String,
    parent: FilesystemIdEntity,
    root: RootDirectoryEntity,
    id: Long,
    owner: UserEntity,
    permissions: List<FilePermissionEntity>,

) : FilesystemObjectEntity(name, relativePath, parent, root, id, owner, permissions)