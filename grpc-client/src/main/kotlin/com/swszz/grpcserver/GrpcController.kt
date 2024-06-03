package com.swszz.grpcserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GrpcController(
    private val grpcService: GrpcService,
) {
    @GetMapping("/{message}")
    fun announce(@PathVariable message: String): String {
        return grpcService.announce(message = message)
    }
}