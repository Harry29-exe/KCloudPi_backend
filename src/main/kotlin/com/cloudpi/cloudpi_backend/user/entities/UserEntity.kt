package com.cloudpi.cloudpi_backend.user.entities

import com.cloudpi.cloudpi_backend.security.AccountType
import org.hibernate.Hibernate
import javax.persistence.*

@Entity
@Table(name = "app_user")
class UserEntity(
    @Id
    @Column(name = "user_id")
    val id: Long,
    var username: String,
    var nickname: String,
    var password: String,
    var locked: Boolean,
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    val permissions: MutableList<UserPermissionEntity>,
    val accountType: AccountType
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