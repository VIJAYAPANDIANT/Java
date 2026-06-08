# Java Learning & Reference Hub

Welcome to the **Java Learning & Reference Hub**! This repository is a comprehensive, self-contained educational resource designed to take you from core Java fundamentals all the way to advanced enterprise architecture, frameworks, and modern Java features. 

Each file in this repository is structured as an interactive lesson, combining **detailed theoretical notes (in comments)** and **fully functional demonstration code** in a single file.

---

## 🚀 How to Run the Programs

All examples in this repository are standard Java files containing their own `main` methods. You can compile and run them directly using the command line.

### Prerequisites
Make sure you have the Java Development Kit (JDK) installed (Java 17+ recommended, Java 21 required for virtual thread examples).

### Steps
1. Open your terminal/command prompt.
2. Navigate to the repository directory:
   ```bash
   cd c:/Java
   ```
3. Compile the target file:
   ```bash
   javac Basic.java
   ```
4. Run the compiled class:
   ```bash
   java Basic
   ```

---

## 🗺️ Learning Path & Repository Index

The lessons are organized into five logical phases to guide your learning journey:

### 1. Java Core Basics 🧱
Fundamental building blocks of Java syntax, execution lifecycle, and logic control.

*   [Basic.java](./Basic.java) — Java history, compilation/JVM process, compilation tools, Pros & Cons, and Hello World.
*   [Comment.java](./Comment.java) — Single-line, multi-line, and Javadoc commenting standards.
*   [Variable.java](./Variable.java) — Declaring, initializing, and using local, instance, and static variables.
*   [Scope of Variables.java](./Scope%20of%20Variables.java) — Understanding scope boundaries and access lifetimes of variables.
*   [Datatype.java](./Datatype.java) — Primitive versus Non-primitive datatypes, sizes, default values, and memory layout.
*   [Casting.java](./Casting.java) — Widening (automatic) and Narrowing (manual) type conversions.
*   [Math Operation.java](./Math%20Operation.java) — Arithmetic operators and useful mathematical methods from `java.lang.Math`.
*   [Conditional.java](./Conditional.java) — Flow control using `if`, `else if`, `else`, ternary operators, and modern switch blocks.
*   [Loop.java](./Loop.java) — Iterative control with `for`, `while`, `do-while`, `for-each`, and loop controls (`break`, `continue`).
*   [Arrays.java](./Arrays.java) — Array declaration, memory visualization, indexing, and multi-dimensional arrays.

### 2. Object-Oriented Programming (OOP) 📐
Mastering the core design paradigm of Java application architecture.

*   [ClassesAndObjects.java](./ClassesAndObjects.java) — The blueprint concept, class definitions, constructors (`this` keyword), and object instantiations.
*   [Method.java](./Method.java) — Creating reusable logic blocks, static vs. instance methods, signatures, and recursion.
*   [StaticAndEnum.java](./StaticAndEnum.java) — Static fields/methods, final constraints, and defining type-safe enumerations (enums).
*   [EncapsulationExample.java](./EncapsulationExample.java) — Data hiding using `private` modifiers and access control via getters and setters.
*   [InheritanceExample.java](./InheritanceExample.java) — Code reuse using `extends`, method overriding, and using the `super` keyword.
*   [PolymorphismExample.java](./PolymorphismExample.java) — Method overloading (compile-time) and method overriding (runtime / dynamic binding).
*   [AbstractAndInterface.java](./AbstractAndInterface.java) — Abstract classes versus interfaces, and implementing multiple inheritance patterns.

### 3. Intermediate APIs & Utilities 🛠️
Common classes and libraries used daily in production Java development.

*   [String and Method.java](./String%20and%20Method.java) — String immutability, String Constant Pool (SCP), and common manipulation methods.
*   [StringBuilderExample.java](./StringBuilderExample.java) — Mutable string operations, performance comparisons with `String`, and thread safety differences.
*   [ExceptionHandlingExample.java](./ExceptionHandlingExample.java) — Catching exceptions, custom hierarchy, `try-with-resources`, and the throw vs. throws keywords.
*   [CollectionsExample.java](./CollectionsExample.java) — Complete guide to Java Collections Framework (`List`, `Set`, `Map`) and their implementations.
*   [GenericsExample.java](./GenericsExample.java) — Designing type-safe classes, interfaces, generic methods, and wildcards (`? extends T`, `? super T`).
*   [DateTimeExample.java](./DateTimeExample.java) — The modern `java.time` API (LocalDateTime, ZonedDateTime, Period, and Duration).
*   [RegexExample.java](./RegexExample.java) — Pattern matching, validation, and parsing using regular expressions (`Pattern`, `Matcher`).
*   [IOExample.java](./IOExample.java) — Reading/writing files via byte streams and character streams, plus Java object serialization.

### 4. Modern & Concurrent Java ⚡
Leveraging multi-core processors and modern language enhancements.

*   [LambdaAndStreams.java](./LambdaAndStreams.java) — Functional interfaces, lambda expressions, and declarative stream data pipeline processing.
*   [OptionalExample.java](./OptionalExample.java) — Eliminating `NullPointerException` bugs using the functional container `java.util.Optional`.
*   [ModernJavaFeatures.java](./ModernJavaFeatures.java) — Contemporary features from Java 9 to 21, including `var` (LTI), Records, Sealed Classes, and Pattern Matching.
*   [ModulesInfo.java](./ModulesInfo.java) — Understanding Project Jigsaw, module configuration (`module-info.java`), exports, and requires.
*   [ConcurrencyExample.java](./ConcurrencyExample.java) — Creating threads, `Runnable`, sync blocks, lock interfaces, ExecutorServices, and volatile keyword.
*   [VirtualThreadsLoom.java](./VirtualThreadsLoom.java) — High-throughput concurrency with Project Loom's lightweight Virtual Threads (Java 21).

### 5. Enterprise Frameworks & System Design 🏢
Concepts, tools, and architectures used in production-grade software.

*   [JVM.java](./JVM.java) — Internal JVM architecture (ClassLoader, JVM memory stack/heap/metaspace, and Garbage Collectors like G1/ZGC).
*   [SpringBootAndJPA.java](./SpringBootAndJPA.java) — Spring Boot auto-configuration, dependency injection, annotations, REST controller building, and JPA/Hibernate database mapping.
*   [SpringSecurityReference.java](./SpringSecurityReference.java) — Security filter chain, Authentication providers, JWT-based stateless tokens, and OAuth2 flow diagrams.
*   [ReactiveJava.java](./ReactiveJava.java) — Reactive programming paradigms with Project Reactor, `Mono`, `Flux`, and Spring WebFlux.
*   [MicroservicesAndDocker.java](./MicroservicesAndDocker.java) — Service discovery, API Gateway, circuit breakers, containerization with Docker, and Kubernetes orchestration notes.
*   [ToolingAndTesting.java](./ToolingAndTesting.java) — Project automation using Maven/Gradle, writing robust unit tests with JUnit 5 & Mockito, and CI/CD principles.

---

## 📚 General JVM Overview

```
 ┌────────────────────────────────────────────────────────┐
 │                   Java Source Code                     │
 │                     (Loop.java)                        │
 └──────────────────────────┬─────────────────────────────┘
                            │  Compiled by: javac
                            ▼
 ┌────────────────────────────────────────────────────────┐
 │                      Bytecode                          │
 │                    (Loop.class)                        │
 └──────────────────────────┬─────────────────────────────┘
                            │  Executed by: java
                            ▼
 ┌────────────────────────────────────────────────────────┐
 │                 Java Virtual Machine                   │
 │ ┌──────────────────┐┌──────────────────┐┌────────────┐ │
 │ │  Class Loader    ││   JVM Memory     ││ Execution  │ │
 │ │  Subsystem       ││ (Heap/Stack/etc) ││  Engine   │ │
 │ └──────────────────┘└──────────────────┘└────────────┘ │
 └──────────────────────────┬─────────────────────────────┘
                            ▼
 ┌────────────────────────────────────────────────────────┐
 │                Platform Native Code                    │
 └────────────────────────────────────────────────────────┘
```
For a deeper dive, check out the lesson in [JVM.java](./JVM.java). Happy Coding!
