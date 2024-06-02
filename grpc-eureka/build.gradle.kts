dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

//dependencies {
//	implementation("io.grpc:grpc-netty-shaded")
//	implementation("io.grpc:grpc-protobuf")
//	implementation("io.grpc:grpc-stub")
//}

//protobuf {
//	val protobufVersion = rootProject.extra["protobufVersion"] as Int
//
//	protoc {
//		artifact = "com.google.protobuf:protoc:${protobufVersion}"
//	}
//	generatedFilesBaseDir = "$projectDir/src/generated"
//	clean {
//		delete generatedFilesBaseDir
//	}
//	plugins {
//		grpc {
//			artifact = "io.grpc:protoc-gen-grpc-java:${grpcVersion}"
//		}
//	}
//	generateProtoTasks {
//		all() * . plugins {
//			grpc {}
//		}
//	}
//}
//
//idea {
//	module {
//		sourceDirs += file('src/generated/main/java')
//		sourceDirs += file('src/generated/main/grpc')
//		generatedSourceDirs += file('src/generated/main/java')
//		generatedSourceDirs += file('src/generated/main/grpc')
//	}
//}