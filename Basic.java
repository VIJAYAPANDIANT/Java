//Java

//History of Java:

//James Gosling(Father of Java)
//Sun Microsystems(Company)
//1995(Year)
//Oak(Original Name)
//Green Project(Project Name)

//Define/What is Java?

//Java is a most popular programming language.
//Java is a high-level, class-based, 
//Java is an object-oriented programming language that is designed to have as few implementation dependencies as possible.
//Java is a general-purpose programming language that is class-based, object-oriented, concurrent, and designed to have as few implementation dependencies as possible.
//Java has multithreading, garbage collection, and exception handling.
//Java is a platform-independent language.
//Java is most used language in the world.
//Java is a WORA(Write Once Run Anywhere) language.(Because of JVM and JRE)
//Java is more secure language.(Because of JVM)

//Features of Java:

//Java is a simple language.
//Java is a robust language.
//Java is a secure language.
//Java is a portable language.
//Java is a dynamic language.
//Java is a distributed language.
//Java is a high-performance language.
//Java is a multithreaded language.
//Java is a garbage-collected language.
//Java is an exception-handling language.
//Java is a platform-independent language.

//Java Environment:

//JDK(Java Development Kit)
//JRE(Java Runtime Environment)
//JVM(Java Virtual Machine)

//JDK = JRE + Development Tools
//JRE = JVM + Class Libraries
//JVM = Java Virtual Machine

//How to run java program?
//1. Write the code
//2. Compile the code
//3. Run the code

//Runing process:

//Source Code -> Compiler ->Byte Code -> JVM -> Machine code

//Run in terminal:

//1. Open terminal
//2. Navigate to the directory where the file is saved
//3. Compile the code
//4. Run the code:

//javac filename.java
//java filename

//Syntax of Java:

/*
class classname{
    public static void main(String[] args){
        System.out.println("Hello Java");
    }
}
*/

//Output:

//Hello Java

//Explanation of Syntax:

/*
class(Blueprint)
public(Access Modifier)
static(Method)
void(Return Type)
main(Method)
String[] args(Array)
System.out.println(Print Statement)
*/

//Example:

class Basic{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}

//Run in terminal:

/*javac Basic.java
java Basic
*/

//Runing process:

/*Write code → Save (.java)
        ↓
Compile → javac Basic.java
        ↓
Bytecode → Basic.class
        ↓
Run → java Basic
        ↓
Output → Hello World

*/

//Output:

//Hello World

/*

Advantages of Java:

1.Platform Independent (Write Once, Run Anywhere):
Java code runs on any system with JVM
2.Object-Oriented:
Supports OOP concepts (encapsulation, inheritance, polymorphism)
3.Secure:
No pointers, has bytecode verifier and security manager
4.Robust:
Strong memory management, exception handling
5.Multithreading:
Supports concurrent execution of programs
6.Portable:
Same bytecode runs on different platforms
7.Automatic Garbage Collection:
No need to manually free memory

*/

/*

Disadvantages of Java

1.Slower than C/C++:
Because of JVM and interpretation
2.More Memory Usage:
JVM consumes extra memory
3.No Low-Level Programming:
No direct memory access (no pointers)
4.Verbose Syntax:
Requires more lines of code
5.Less Suitable for High-Performance Systems:
Not ideal for system-level programming

*/

/*

Applications of Java:

1.Web Applications:
Backend development using Spring, JSP, Servlets
2.Mobile Applications:
Android apps (using Java/Kotlin)
3.Desktop Applications:
GUI apps using Swing, JavaFX
4.Enterprise Applications:
Banking, ERP systems
5.Game Development:
Used in some games (e.g., Minecraft)
6.Cloud-Based Applications:
Microservices, distributed systems
7.Big Data Technologies:
Used in Apache Hadoop

*/