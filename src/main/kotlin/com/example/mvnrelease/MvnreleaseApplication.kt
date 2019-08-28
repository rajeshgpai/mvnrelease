package com.example.mvnrelease

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MvnreleaseApplication

fun main(args: Array<String>) {
	runApplication<MvnreleaseApplication>(*args)
}
