package com.cloudpi.cloudpi_backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudPiBackendApplication

fun main(args: Array<String>) {
	runApplication<CloudPiBackendApplication>(*args)
}
