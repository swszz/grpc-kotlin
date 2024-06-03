rootProject.name = "grpc-kotlin"

include(
    "grpc-eureka",
    "grpc-server",
    "grpc-client",
    "grpc-lib",
)

pluginManagement {
    val kotlinVersion = "1.9.24"
    val springBootVersion = "3.2.6"
    val springDependencyVersion = "1.1.5"
    val protobufGradlePluginVersion = "0.9.4"
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.jvm" -> useVersion(kotlinVersion)
                "org.jetbrains.kotlin.plugin.spring" -> useVersion(kotlinVersion)
                "org.springframework.boot" -> useVersion(springBootVersion)
                "io.spring.dependency-management" -> useVersion(springDependencyVersion)
                "com.google.protobuf" -> useVersion(protobufGradlePluginVersion)
            }
        }
    }
}