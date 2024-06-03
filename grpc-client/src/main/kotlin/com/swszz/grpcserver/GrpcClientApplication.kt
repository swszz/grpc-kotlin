package com.swszz.grpcserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class GrpcClientApplication

fun main(args: Array<String>) {
    runApplication<GrpcClientApplication>(*args)
}
