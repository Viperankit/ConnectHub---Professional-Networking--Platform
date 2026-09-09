# 💼 LinkedIn-Inspired Professional Networking Platform

## 📌 Project Overview

This project is a scalable **microservices-based professional networking platform**
inspired by LinkedIn. The application is built using Java, Spring Boot, Spring
Cloud, Kafka, PostgreSQL, Neo4j, Docker, and Kubernetes.

The platform is designed with separate microservices for users, posts,
connections, notifications, and file uploads, with secure communication,
asynchronous event processing, service discovery, API Gateway, and
fault-tolerant service communication.

---

## 🚀 Tech Stack

- Java
- Spring Boot
- Spring Cloud
- Spring Cloud API Gateway
- Eureka Service Discovery
- Spring Security
- JWT Authentication
- OpenFeign
- Apache Kafka
- PostgreSQL
- Neo4j
- Google Cloud Storage
- Docker
- Docker Compose
- Kubernetes
- Google Kubernetes Engine (GKE)
- Resilience4j
- Spring Data JPA
- Hibernate
- REST APIs

---

## 🔥 Features

### 👤 User Management

- User registration and management
- Secure user authentication
- JWT-based authentication
- User data persistence using PostgreSQL

### 📝 Posts Service

- Create and manage posts
- Post-related events
- Asynchronous post event processing using Apache Kafka
- Post data persistence using PostgreSQL

### 🤝 Connections Service

- User connection management
- Relationship-based data modeling
- Connection-related operations
- Neo4j for modeling user connections and relationships
- Relationship-based queries using Neo4j

### 🔔 Notification Service

- Notification service implemented using Apache Kafka
- Asynchronous event processing
- Connection-related notifications
- Post-related notifications
- Event-driven communication between microservices

### 📁 File Upload Service

- File upload support
- Google Cloud Storage integration
- Centralized file management

### 🔐 Authentication & Authorization

- JWT-based authentication
- Role-based authorization
- Secure API endpoints
- Authentication through Spring Cloud API Gateway
- Secure communication between services

### 🌐 API Gateway

- Centralized API Gateway
- Request routing to microservices
- Authentication support
- Centralized entry point for client requests

### 🔎 Service Discovery

- Eureka Service Discovery
- Dynamic service registration
- Service-to-service discovery
- Microservices can communicate without hard-coded service locations

### 🔄 Inter-Service Communication

- OpenFeign for synchronous communication
- Apache Kafka for asynchronous communication
- Event-driven communication between services

### 🛡️ Fault Tolerance

- Resilience4j Circuit Breaker
- Fault-tolerant service communication
- Protection against cascading service failures

---

## 🔐 Security

The application uses Spring Security and JWT for securing the microservices.

- JWT-based authentication
- Role-based authorization
- Secure API endpoints
- Authentication through API Gateway
- Token-based service access
- Protected microservice communication

---

## 📡 Inter-Service Communication

The application uses both synchronous and asynchronous communication.

### OpenFeign

OpenFeign is used for **synchronous inter-service communication**.

```text
Service A
   ↓
OpenFeign
   ↓
Service B
