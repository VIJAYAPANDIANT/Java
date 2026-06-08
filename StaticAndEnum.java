/* 

Static & Enums in Java

Definitions:

1. The 'static' Keyword:
   - Used to define class-level elements (fields, methods, blocks, nested classes) rather than instance-level elements.
   - static variable: Shared across all objects of the class. Only one copy exists in memory.
   - static method: Can be called without creating an instance of the class. It can access only other static members directly.
   - static block: Used to initialize static variables. Runs exactly once when the class is first loaded into memory.

2. Enums (Enumerations):
   - A special "class" that represents a group of constants (unchangeable variables).
   - Declared using the 'enum' keyword.
   - Can have fields, constructors, and methods just like classes.

Syntax:
// Static
class Demo {
    static dataType staticVar = value;
    static void staticMethod() {}
}
// Enum
enum EnumName {
    CONSTANT1, CONSTANT2
}

*/

/*

Example Program:
*/

// Enum Definition
enum OrderStatus {
    PENDING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

class StaticCounter {
    // Static variable (class-level data shared by all instances)
    static int count = 0;
    
    // Instance variable (each object has its own copy)
    int id;

    // Static block for class-level initialization
    static {
        System.out.println("Static block executed: StaticCounter class loaded.");
    }

    // Constructor
    StaticCounter() {
        count++; // Increments the shared static counter
        this.id = count;
    }

    // Static method (class-level behavior)
    static void displayTotalCount() {
        System.out.println("Total instances created: " + count);
        // System.out.println(id); // Compile error: Cannot access instance variable from static context
    }
}

class StaticAndEnum {
    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Creating instances of StaticCounter
        StaticCounter c1 = new StaticCounter();
        StaticCounter c2 = new StaticCounter();

        // Calling static method via class name
        StaticCounter.displayTotalCount();

        System.out.println("c1 ID: " + c1.id);
        System.out.println("c2 ID: " + c2.id);

        System.out.println("------------------------------------");

        // Using Enums
        OrderStatus currentStatus = OrderStatus.SHIPPED;

        System.out.println("Order status: " + currentStatus);

        // Switch statement with Enum
        switch (currentStatus) {
            case PENDING -> System.out.println("Order is waiting to be processed.");
            case SHIPPED -> System.out.println("Order is on the way!");
            case DELIVERED -> System.out.println("Order arrived at destination.");
            case CANCELLED -> System.out.println("Order was cancelled.");
        }
    }
}

/*
Output:
Static block executed: Counter class loaded.
Main method started.
Total instances created: 2
c1 ID: 1
c2 ID: 2
------------------------------------
Order status: SHIPPED
Order is on the way!
*/
