package com.cloudpi.cloudpi_backend.files_info.entities

import com.cloudpi.cloudpi_backend.user.entities.UserEntity
import javax.persistence.*

@Entity
class FileEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id")
    val id: Long,
    @Column(nullable = false)
    var fileName: String,
    @Column(unique = true, nullable = false)
    var filePath: String,
    @ManyToOne
    @JoinColumn(name = "user_id")
    var owner: UserEntity,
    @ManyToOne
    @JoinColumn(name = "file_id")
    var parent: FileEntity?,
    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    var children: MutableList<FileEntity>?
)