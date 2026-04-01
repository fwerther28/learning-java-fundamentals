# Learning Java Fundamentals ☕

This repository documents my comprehensive journey through the **"Complete Java Course - Object-Oriented Programming"** by Dr. Nelio Alves. It serves as the foundation of my backend expertise, focusing on Java logic, advanced OOP principles, and the evolution of data persistence.

> [!IMPORTANT]
> **Project Status:** Fundamentals Module Completed ✅
> To maintain architectural cleanness and Maven dependency integrity, all **Spring Boot** and **Enterprise Web Services** are now hosted in dedicated repositories.

## 🧠 Key Concepts & Evolution

### 1. JDBC & DAO Pattern
* Decoupled business logic from data access using the **Data Access Object (DAO)** pattern.
* **Implemented** manual connection management, statement handling,  and transactions integrity using raw **JDBC**.

### 2. Functional Programming & OOP
* **Advanced OOP:** Implementation of inheritance, polymorphism, and complex business rules (e.g., *The Lisarb Income Tax Problem*).
* **Modern Java:** Extensive use of Lambda expressions, Streams API, and Functional Interfaces to write concise, declarative code.

### 3. Data Persistence (JPA & Hibernate Standalone)
* **Jakarta Persistence (JPA 3.0):** Explored the entity lifecycle and managed persistence units via `persistence.xml`.
* **Hibernate 6.4:** Applied modern ORM features, handling automatic table generation (`hbm2ddl`) and SQL logging.
* **Under the Hood:** Hands-on experience with `EntityManagerFactory` and `EntityManager` before moving into Spring abstraction.

## 🛠 Tech Stack & Tools
* **Java:** 21+ (LTS)
* **Frameworks:** Hibernate 6.4.4.Final / Jakarta Persistence 3.0
* **IDE:** Spring Tool Suite 4 (STS4)
* **Database:** MySQL 8.0 / H2 (In-memory testing)
* **Build Tool:** Maven

## 📊 Why this Separation?
As a developer with a background in **Cost Accounting (#DevContador)**, I apply the principle of **Separation of Concerns** not just in code, but in project organization. Keeping fundamentals separate from enterprise frameworks ensures a clean audit trail of my learning progress and prevents dependency "pollution" across repositories.

## 📈 Learning Path (Completed)
* [x] Basic Syntax and Logic
* [x] Object-Oriented Programming (Principles & Design)
* [x] Functional Programming & Lambda Expressions
* [x] JDBC Fundamentals & Transactions
* [x] Data Persistence (DAO Pattern)
* [x] Standalone ORM with JPA & Hibernate

---

## 🚀 Next Step: Enterprise Ecosystem
Having solidified the core Java language, I am now building scalable RESTful APIs using the Spring ecosystem.

👉 **Check out my current project:** [Workshop Spring Boot + JPA](https://github.com/fwerther28/workshop-springboot-jpa)
