package com.swszz.grpcserver

import com.swszz.AnnouncementGrpc.AnnouncementImplBase
import com.swszz.AnnouncementRequest
import com.swszz.AnnouncementResponse
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class AnnounceService : AnnouncementImplBase() {
    override fun announce(request: AnnouncementRequest, responseObserver: StreamObserver<AnnouncementResponse>) {
        responseObserver.also {
            it.onNext(
                AnnouncementResponse.newBuilder()
                    .setMessage("Announce ==> : ${request.message}").build()
            )
            it.onCompleted()
        }
    }
}