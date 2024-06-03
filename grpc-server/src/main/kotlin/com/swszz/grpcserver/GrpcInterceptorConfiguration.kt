package com.swszz.grpcserver

import io.grpc.ServerCall
import io.grpc.ServerCallHandler
import io.grpc.ServerInterceptor
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration


@Configuration
class GrpcInterceptorConfiguration {
    @GrpcGlobalServerInterceptor
    fun logServerInterceptor() = LogInterceptor()

    class LogInterceptor : ServerInterceptor {

        private val logger = LoggerFactory.getLogger(this::class.java)
        override fun <ReqT : Any, RespT : Any> interceptCall(
            call: ServerCall<ReqT, RespT>,
            headers: io.grpc.Metadata,
            next: ServerCallHandler<ReqT, RespT>,
        ): ServerCall.Listener<ReqT> {
            logger.info(call.methodDescriptor.fullMethodName)
            return next.startCall(call, headers)
        }
    }
}