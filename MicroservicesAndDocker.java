/* 

Microservices & Docker Reference

1. Microservice Communication:
- REST over HTTP/1.1: Standard JSON payloads. Great for external clients and standard public APIs.
- gRPC over HTTP/2: High-performance, low-latency framework using Protocol Buffers (binary serialization). Great for internal service-to-service communication.

2. Service Registry & API Gateway:
- API Gateway (e.g., Spring Cloud Gateway): Routing, rate limiting, and security authentication at the entry point of the cluster.
- Service Registry (e.g., Netflix Eureka): Tracks the IP and ports of active microservice instances.

3. Dockerizing a Java Application (Multi-stage build):
- Separates compilation environment from clean runtime environment to reduce container image size.

Example Dockerfile:
----------------------------------------------------------------------
# Stage 1: Build the application
FROM maven:3.8-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvc clean package -DskipTests

# Stage 2: Runtime image
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
----------------------------------------------------------------------

Syntax:
// Dockerfile
FROM image AS stage
WORKDIR /path
COPY src .
ENTRYPOINT ["executable"]

*/

class MicroservicesAndDocker {
    public static void main(String[] args) {
        System.out.println("Microservices Architecture Concepts:");
        System.out.println("------------------------------------");
        System.out.println("1. gRPC uses binary protocol buffers, making payloads significantly smaller than REST JSON.");
        System.out.println("2. API Gateways route requests and prevent direct exposure of internal microservices.");
        System.out.println("3. Docker multi-stage builds compile code inside temporary containers, ensuring minimal production image sizes.");
    }
}
