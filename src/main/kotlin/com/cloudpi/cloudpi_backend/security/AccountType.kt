package com.cloudpi.cloudpi_backend.security

enum class AccountType(val value: String) {
    USER(value = "ROLE_USER"),
    ROOT(value = "ROLE_ROOT"),
    WORKER(value = "ROLE_WORKER");

    override fun toString(): String {
        return value
    }
}