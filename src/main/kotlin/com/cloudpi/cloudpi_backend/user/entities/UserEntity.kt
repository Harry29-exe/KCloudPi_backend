package com.cloudpi.cloudpi_backend.user.entities

import com.cloudpi.cloudpi_backend.files_info.entities.FileEntity
import com.cloudpi.cloudpi_backend.files_info.entities.FilePermissionEntity
import com.cloudpi.cloudpi_backend.security.AccountType
import org.hibernate.Hibernate
import javax.persistence.*

@Entity
@Table(name = "app_user")
class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    val id: Long,
    var username: String,
    var email: String,
    var nickname: String,
    var password: String,
    var locked: Boolean,
    val accountType: AccountType,
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = [CascadeType.ALL], orphanRemoval = true)
    var permissions: MutableList<UserPermissionEntity>,

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    var files_info: MutableList<FileEntity>?,
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = [CascadeType.ALL], orphanRemoval = true)
    var filesPermissions: FilePermissionEntity

) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as UserEntity

        return username == other.username
    }

    override fun toString(): String {
        return this::class.simpleName + "(username = $username )"
    }

    override fun hashCode(): Int {
        return id.toInt()
    }
}