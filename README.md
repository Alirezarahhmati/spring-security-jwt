# Spring Security JWT Authentication & Authorization 

## Overview

This project demonstrates how to implement JWT authentication and authorization in a Spring Boot application using Spring Security.

### Main Components

- `JwtAuthenticationFilter` - authenticates requests via JWT
- `JwtService` - generates and validates JWTs 
- `AuthenticationService` - handles user registration and authentication
- `SecurityConfiguration` - configures authentication and authorization
- `UserRepository` - loads user data
- `ApplicationConfig` - configures beans  

### Usage

The `/auth` endpoints can be used for user registration and authentication to get a JWT.

The JWT can then be used to access protected resources.

### Authorization

This project shows how to restrict endpoints based on user roles.

The `/demo` endpoints require different roles specified in `SecurityConfiguration`:

- `/demo` - `MANAGER` or `ADMIN` role 

The user's roles are encoded in the JWT and loaded into the Spring Security context to authorize requests.

### Running the Application

```
./mvnw spring-boot:run
```

It will start on port 8080.
