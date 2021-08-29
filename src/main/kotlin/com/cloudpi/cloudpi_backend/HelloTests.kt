package com.cloudpi.cloudpi_backend

import com.cloudpi.cloudpi_backend.files_info.entities.FileEntity
import com.cloudpi.cloudpi_backend.files_info.entities.RootDirectoryEntity
import com.cloudpi.cloudpi_backend.files_info.repositories.FileRepository
import com.cloudpi.cloudpi_backend.files_info.repositories.RootRepository
import com.cloudpi.cloudpi_backend.security.AccountType
import com.cloudpi.cloudpi_backend.user.entities.UserEntity
import com.cloudpi.cloudpi_backend.user.repositories.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloTests(
    val fileRepository: FileRepository,
    val rootRepository: RootRepository,
    val userRepository: UserRepository
) {

    @GetMapping("/test1")
    fun getRoleNames(): List<String> {
        return AccountType.values().map { r -> r.toString() }.toList()
    }

    @GetMapping("/test2")
    fun getRole(): String {
        return AccountType.USER.toString() + " " + AccountType.USER.value
    }

    @GetMapping("/c")
    fun we() {
        val user = UserEntity(0, "u", "e", "n", "p", false,
                                AccountType.USER, ArrayList(), ArrayList(), ArrayList())
        userRepository.save(user)
        val root = RootDirectoryEntity(0, user, ArrayList(), "/")
        rootRepository.save(root)
        val file = FileEntity(0, "file name", "/", root, root, 0L, user, ArrayList())
        fileRepository.save(file)
    }

}