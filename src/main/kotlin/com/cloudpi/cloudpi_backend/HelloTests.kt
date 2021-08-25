package com.cloudpi.cloudpi_backend

import com.cloudpi.cloudpi_backend.security.AccountType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloTests {

    @GetMapping("/test1")
    fun getRoleNames(): List<String> {
        return AccountType.values().map { r -> r.toString() }.toList()
    }

    @GetMapping("/test2")
    fun getRole(): String {
        return AccountType.USER.toString() + " " + AccountType.USER.value
    }
}