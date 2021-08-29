package com.cloudpi.cloudpi_backend.files_info.entities

import com.cloudpi.cloudpi_backend.user.entities.UserEntity
import javax.persistence.*

//TODO add root entity and root field to file and directory entities
@Entity
@DiscriminatorValue(value = "FS_OBJECT")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "object_type", discriminatorType = DiscriminatorType.STRING)
abstract class FilesystemObjectEntity (

    @Column(nullable = false)
    open var name: String,
    @Column(unique = true, nullable = false)
    open var relativePath: String,
    @ManyToOne
    @JoinColumn(name = "parent_id", nullable = false)
    open var parent: FilesystemIdEntity,
    @ManyToOne
    @JoinColumn(name = "root_id", nullable = false)
    open var root: RootDirectoryEntity,

    id: Long,
    owner: UserEntity,
    permissions: List<FilePermissionEntity>,

) : FilesystemIdEntity (
    id,
    owner,
    permissions
)