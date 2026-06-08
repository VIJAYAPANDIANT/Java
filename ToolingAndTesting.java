/* 

Java Tooling, Testing & Logging Reference

1. Build Tools (Maven & Gradle)

- Build tools automate the process of compilation, dependency resolution, testing, packaging, and deployment.

Maven (uses pom.xml):
- Declares configuration using XML. Follows convention over configuration.
- Core sections: groupId, artifactId, version, dependencies, and plugins.
Example dependency:
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>

Gradle (uses build.gradle):
- Declares configuration using Groovy or Kotlin DSL. Offers flexible build logic.
Example dependency:
testImplementation 'org.junit.jupiter:junit-jupiter-api:5.10.0'

----------------------------------------------------------------------

2. Testing (JUnit 5 & Mockito)

- JUnit 5: Standard framework to write unit tests.
  - @Test: Identifies a test method.
  - @BeforeEach / @AfterEach: Setup and teardown methods before/after each test.
  - Assertions: Assertions.assertEquals(expected, actual).

- Mockito: Mocking framework to isolate unit tests by stubbing mock dependencies.
  - Mockito.mock(Class): Creates a mock instance.
  - Mockito.when(mock.method()).thenReturn(value): Defines behavior/stub.

- TDD (Test-Driven Development): Red-Green-Refactor cycle (Write test first, build code to pass, optimize).

----------------------------------------------------------------------

3. Logging & Debugging (SLF4J, Logback, JDB)

- SLF4J (Simple Logging Facade for Java): A facade/abstraction layer for logging systems, preventing coupling.
- Logback: Fast and robust implementation of the SLF4J interface.
- Logging levels: TRACE, DEBUG, INFO, WARN, ERROR.
- JDB (Java Debugger): CLI debugger tool that ships with the JDK to inspect running bytecodes, set breakpoints, step through code, etc.

Syntax:
// Maven dependency
<dependency>...</dependency>
// JUnit Test
@Test void testMethod() { assertEquals(exp, act); }

*/

class ToolingAndTesting {
    public static void main(String[] args) {
        System.out.println("Java Developer Ecosystem Overview:");
        System.out.println("----------------------------------");
        System.out.println("1. Maven/Gradle: Handles library management and build packaging.");
        System.out.println("2. JUnit 5/Mockito: Validates business logic correctness.");
        System.out.println("3. SLF4J/Logback: Generates runtime diagnostics instead of using System.out.println.");
        System.out.println("4. JDB: Debugger tool command used to step through executed code blocks.");
    }
}
