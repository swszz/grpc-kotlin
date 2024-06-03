package com.swszz.grpcserver

import com.swszz.AnnouncementGrpc.AnnouncementBlockingStub
import com.swszz.AnnouncementRequest
import net.devh.boot.grpc.client.inject.GrpcClient
import org.springframework.stereotype.Service

@Service
class GrpcService(
    @GrpcClient("grpc-server")
    private val announcementBlockingStub: AnnouncementBlockingStub,
) {
    fun announce(message: String): String {
        return announcementBlockingStub.announce(
            AnnouncementRequest.newBuilder().setMessage(message).build()
        ).message
    }
}