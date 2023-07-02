package com.core

import com.core.config.database.InvestandProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication


@EnableConfigurationProperties(InvestandProperties::class)
@SpringBootApplication
class InvestandApplication

fun main(args: Array<String>) {
    runApplication<InvestandApplication>(*args)


}

