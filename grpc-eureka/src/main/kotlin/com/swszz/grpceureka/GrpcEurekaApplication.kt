package com.swszz.grpceureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
internal class GrpcEurekaApplication

internal fun main(args: Array<String>) {
    runApplication<GrpcEurekaApplication>(*args)
}
