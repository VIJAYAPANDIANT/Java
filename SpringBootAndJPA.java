/* 

Spring Boot & Spring Data JPA Reference

1. Spring Boot Core Concepts:
- Dependency Injection (DI): Spring manages the lifecycle of beans. Core annotations:
  - @Component, @Service, @Repository, @Controller, @RestController.
  - @Autowired: Injects dependencies (constructor injection is preferred).
- Auto-Configuration: Spring Boot automatically configures beans based on classpath dependencies.
- REST Controllers: Handled via @RestController and @RequestMapping maps.

2. Spring Data JPA & Hibernate:
- ORM (Object-Relational Mapping): Maps Java classes to Database tables.
- JPA (Java Persistence API): The specification for ORM.
- Hibernate: The default provider implementing JPA.
- Spring Data Repositories: Interface abstractions (e.g., JpaRepository) providing CRUD operations without boilerplate implementation.

Syntax:
@RestController
@RequestMapping("/path")
class Controller {
    @Autowired Dependency dep;
}
@Entity
class Table {}
interface Repo extends JpaRepository<Table, IdType> {}

*/

/*

Code Mockup of a typical Spring Boot + JPA Entity, Controller, and Repository:

*/

// --- JPA Entity ---
// @Entity
// @Table(name = "users")
class UserEntity {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // Constructors, Getters, and Setters
    public UserEntity() {}
    public UserEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}

// --- Spring Data Repository ---
// @Repository
interface UserRepository {
    // Custom query method derived from method name by Spring Data
    java.util.List<UserEntity> findByEmail(String email);
}

// --- Spring REST Controller ---
// @RestController
// @RequestMapping("/api/users")
class UserController {
    private final UserRepository userRepository;

    // Constructor Injection (Autowired automatically by Spring)
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // @GetMapping
    public java.util.List<UserEntity> getAllUsers() {
        return java.util.Collections.emptyList(); // Mocked representation
    }
}

class SpringBootAndJPA {
    public static void main(String[] args) {
        System.out.println("Spring Boot & Spring Data JPA Fundamentals:");
        System.out.println("------------------------------------------");
        System.out.println("1. Dependency Injection is initialized through class annotations.");
        System.out.println("2. Auto-configuration activates when starter dependencies are detected in Maven/Gradle.");
        System.out.println("3. JPA repository interfaces are instantiated dynamically at startup.");
    }
}
