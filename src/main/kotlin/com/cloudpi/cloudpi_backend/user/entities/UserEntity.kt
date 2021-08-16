package com.cloudpi.cloudpi_backend.user.entities

import org.hibernate.Hibernate
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class UserEntity(
    @Id
    var username: String,
    var email: String,
    var password: String
    ) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as UserEntity

        return username == other.username
    }

    override fun hashCode(): Int = 1838525018

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(username = $username )"
    }

}