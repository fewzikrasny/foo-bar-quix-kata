package com.kata.foobarquix

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties
open class FooBarQuixApplication

fun main(args: Array<String>) {
	runApplication<FooBarQuixApplication>(*args)
}
