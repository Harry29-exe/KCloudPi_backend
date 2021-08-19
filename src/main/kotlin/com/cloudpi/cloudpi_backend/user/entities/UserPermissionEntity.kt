package com.cloudpi.cloudpi_backend.user.entities

import com.cloudpi.cloudpi_backend.security.AccountType
import org.hibernate.Hibernate
import javax.persistence.*

@Entity
class UserPermissionEntity(
    permission: String,
    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: UserEntity
) {
    @Id
    @GeneratedValue
    var id: Long = 0


    var permission: String = permission
        set(value) {
            for (accountType in AccountType.values()) {
                if (accountType.toString() == value) {
                    throw Exception()
                }
            }

            field = value
        }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as UserPermissionEntity

        return id == other.id
    }


    override fun toString(): String {
        return "UserPermissionEntity(id=$id, user=$user)"
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + user.hashCode()
        return result
    }

}