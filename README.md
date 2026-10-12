# Learning Java Fundamentals ☕

This repository documents my structured learning path and practical exercises through the comprehensive Java course led by Dr. Nelio Alves (*Java COMPLETO: Programação Orientada a Objetos + Projetos*).

It serves as my technical reference log for backend fundamentals, covering object-oriented programming (OOP), modern language features, and low-level data persistence mechanisms in Java.

---

## 📌 Architectural Scope & Organization

> **Repository Status: Core Fundamentals & Persistence Exercises Concluded ✅**

To keep dependency trees clean and avoid mixing standard Java libraries with framework autoconfigurations, the enterprise modules practiced during the studies were organized into separate repositories:

- 🗄️ **Relational Web Services (Spring Boot & JPA):** [workshop-springboot-jpa](https://github.com/fwerther28/workshop-springboot-jpa)
- 🍃 **NoSQL Persistence (Spring Boot & MongoDB):** [workshop-springboot-mongodb](https://github.com/fwerther28/workshop-springboot-mongodb)
- 🏛️ **Distributed Architecture (Spring Cloud & Containers):** [microservices-with-spring-cloud-and-java](https://github.com/fwerther28/microservices-with-spring-cloud-and-java)

*Note: UI desktop modules (JavaFX) and console games were intentionally bypassed to prioritize server-side backend development, REST APIs, and containerized architectures.*

---

## 🧠 Concepts Studied & Practiced

### 1. Object-Oriented Principles & Modern Syntax
- **Core OOP:** Encapsulation, inheritance, polymorphism, composition, abstract classes, and interfaces.
- **Modern Features (Java 21):** Practice with Java Records, pattern matching, Stream API, and lambda expressions for declarative data handling.
- **Exception Handling:** Implementing custom exception hierarchies and structured error handling patterns.

### 2. Low-Level Data Persistence (JDBC & DAO Pattern)
- **Raw JDBC:** Establishing connections, executing queries, handling transactions (`commit`/`rollback`), and preventing SQL injection with `PreparedStatement`.
- **DAO Pattern:** Decoupling business logic from database operations using the Data Access Object pattern and manual mapping.

### 3. JPA & Hibernate (Under the Hood)
- **Native Configuration:** Working with `persistence.xml` to understand the core entity lifecycle (`transient`, `managed`, `detached`, `removed`) before relying on framework abstractions.
- **Entity Management:** Hands-on exercises with `EntityManagerFactory` and `EntityManager`, schema generation, and transaction handling.

---

## 🛠️ Environment & Tools

- **Language:** Java 21 LTS
- **Libraries:** Jakarta Persistence (JPA 3.0), Hibernate ORM 6.x, Project Lombok
- **Databases:** MySQL 8.0, H2 Database (In-Memory testing)
- **Build Tool:** Apache Maven
- **IDE:** Spring Tool Suite 4 (STS4) / IntelliJ IDEA
- **Infrastructure Practice:** Docker & Docker Compose to spin up local MySQL test instances.

---

## 📊 The "Cost Accounting" Perspective (#DevContador)

Coming from a background in Cost Accounting and business forensics, I approach software learning through traceability and discipline. Keeping fundamental concepts separate from framework abstractions provides a clear audit trail of how data, memory, and database transactions operate under the hood.

---

## 📬 Connect with Me

- **LinkedIn:** [linkedin.com/in/francisco-wherther](https://www.linkedin.com/in/francisco-wherther/)
