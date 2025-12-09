# API Gateway Service

A Spring Cloud Gateway based API Gateway service that acts as a single entry point for all client requests, routing them to the appropriate microservices.

## Features

- **Service Routing**: Routes requests to appropriate microservices based on path patterns
- **Load Balancing**: Integrates with Eureka service discovery for client-side load balancing
- **Actuator**: Provides production-ready features for monitoring and managing the application
- **Spring Cloud Gateway**: Built on top of Spring's reactive web framework for high performance

## Prerequisites

- Java 17
- Maven 3.6+
- Spring Boot 4.0.0
- Spring Cloud 2025.1.0
- Eureka Server (for service discovery)

## Configuration

### Application Properties

```properties
# Application Configuration
spring.application.name=Api-Gateway
server.port=8083

# Service Routing
spring.cloud.gateway.routes[0].id=QUIZ-SERVICE
spring.cloud.gateway.routes[0].uri=lb://QUIZ-SERVICE
spring.cloud.gateway.routes[0].predicates[0]=Path=/quiz/**
```

### Dependencies

- Spring Boot Starter Actuator
- Spring Cloud Gateway
- Spring Cloud Netflix Eureka Client

## Getting Started

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd ApiGateway
   ```

2. **Build the project**
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the application**
   - API Gateway will be available at `http://localhost:8083`
   - Actuator endpoints available at `http://localhost:8083/actuator`

## API Endpoints

| Service | Path | Description |
|---------|------|-------------|
| QUIZ-SERVICE | /quiz/** | Routes to the Quiz Service |

## Development

### Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/gateway/ApiGateway/
│   │       └── ApiGatewayApplication.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── com/gateway/ApiGateway/
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Eureka Service Discovery](https://spring.io/projects/spring-cloud-netflix)
