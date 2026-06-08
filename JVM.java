/* 

JDK, JRE & JVM in Java

Definition & Relationship:

1. JVM (Java Virtual Machine)
- JVM is the engine that drives the Java code.
- It converts Java bytecode into machine language.
- JVM is platform-dependent (different JVM versions exist for Windows, macOS, Linux).

2. JRE (Java Runtime Environment)
- JRE is a set of software tools which are used for developing Java applications.
- It is the implementation of JVM. It physically exists. It contains JVM + Set of libraries + Other files that JVM uses at runtime.

3. JDK (Java Development Kit)
- JDK is a software development environment used to develop Java applications.
- It contains JRE + Development tools (javac, java, jar, javadoc, etc.).

Structure:
JDK = JRE + Development Tools
JRE = JVM + Class Libraries

Syntax:
Compilation: javac FileName.java
Execution:   java ClassName

*/

/*

Compilation vs execution:

1. Compilation (Source Code to Bytecode):
   - You write source code in a file with the '.java' extension (e.g., JVMInfo.java).
   - You compile this code using the Java Compiler (javac):
     Command: javac JVMInfo.java
   - The compiler translates the source code into bytecode, producing a '.class' file (e.g., JVMInfo.class).
   - Bytecode is an intermediate language that is platform-independent.

2. Execution / Runtime (Bytecode to Machine Code):
   - You run the compiled bytecode using the Java Interpreter (java):
     Command: java JVMInfo
   - The JVM loads the bytecode, verifies it, and interprets or compiles it (via JIT - Just In Time compiler) into native machine code.
   - The native machine code is executed by the host operating system.

Visual Process:
Source Code (.java) ---> Compiler (javac) ---> Bytecode (.class) ---> JVM ---> Machine Code (0s & 1s) ---> Output

*/

class JVMInfo {
    public static void main(String[] args) {
        System.out.println("Java Environment Architecture:");
        System.out.println("------------------------------");
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("JVM Name: " + System.getProperty("java.vm.name"));
        System.out.println("JVM Version: " + System.getProperty("java.vm.version"));
        System.out.println("OS Name: " + System.getProperty("os.name"));
    }
}

/*
Output:
Java Environment Architecture:
------------------------------
Java Vendor: Oracle Corporation (or alternative provider)
Java Version: <version>
JVM Name: Java HotSpot(TM) 64-Bit Server VM
JVM Version: <vm_version>
OS Name: Windows (or alternative OS)
*/
