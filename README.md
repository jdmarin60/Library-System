# 📚 Library Management System (LMS)

A backend system for managing a library, built with Java, Spring Boot, Spring Security (JWT), Spring Data JPA, and H2. It follows Domain-Driven Design (DDD) and uses a layered architecture.

---

## ⚙️ Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Security with JWT
- Spring Data JPA
- H2 Database (in-memory)
- MapStruct
- JUnit 5 + MockMvc (for testing)
- Swagger / OpenAPI
- Gradle (Kotlin or Groovy DSL)

---

## 🧰 Project Setup

### Prerequisites

- Java 17+
- Gradle 8+
- IDE (e.g., IntelliJ IDEA)

### Clone the repository

````bash
git clone https://github.com/your-username/library-system.git
cd library-system
````
```bash
./gradlew bootRun
````

🚀 API Documentation
Once running, the Swagger UI is available at:
```bash
http://localhost:8080/swagger-ui/index.html
````

🔐 Authentication
JWT-based authentication

Roles:

ADMIN: can manage books, authors, and users

USER: can view and borrow books

Default test users

```bash
| Username | Password | Role  |
| -------- | -------- | ----- |
| `admin`  | `admin`  | ADMIN |
| `user`   | `user`   | USER  |
````
🏛️ Architecture Overview
The project follows a Domain-Driven Design (DDD) approach with the following structure:

```bash
src/
└── main/
    └── java/
        └── com.librarysystem
            ├── book
            │   ├── domain          # Domain models & interfaces
            │   ├── application     # Use cases & services
            │   ├── infrastructure  # JPA entities, mappers, repositories
            │   └── presentation    # REST controllers
            ├── user
            ├── loan
            └── security            # JWT auth, filters, config
````
Each module (e.g., book, user, loan) is self-contained and follows the DDD layers:

domain: core model and logic

application: use case orchestration

infrastructure: data access and persistence

presentation: HTTP API layer

📦 Key Features
User registration and login with JWT token

Role-based access control

Book management (CRUD)

Author management

Book borrowing and returning

Automatic date handling

H2 in-memory database with console access at /h2-console

✅ To Do
Email notifications on overdue loans

PostgreSQL/MySQL profile for production

Admin dashboard frontend (optional)
