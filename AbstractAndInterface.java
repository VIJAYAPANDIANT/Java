/* 

Interfaces & Abstract Classes in Java

Definitions:

1. Abstract Class:
   - A class declared with the 'abstract' keyword.
   - It cannot be instantiated directly (cannot create objects of it using new).
   - It can contain both abstract methods (without body) and concrete methods (with body).
   - Used to define a common template for subclasses.

2. Interface:
   - A blueprint of a class that specifies what a class must do, but not how.
   - Acts as a contract for classes.
   - By default, all interface fields are public static final, and methods are public abstract (Java 8+ also supports default and static methods).
   - Supports multiple inheritance (a class can implement multiple interfaces).

Syntax:
abstract class AbstractClass {
    abstract void method();
}
interface InterfaceName {
    void method();
}
class Subclass extends AbstractClass implements InterfaceName {
    public void method() { // implementation }
}

*/

/*

Example Program:
*/

// Abstract Class
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method (no body - must be implemented by subclasses)
    abstract void accelerate();

    // Concrete method (has body - inherited as-is or can be overridden)
    void horn() {
        System.out.println(brand + " vehicle: Beep Beep!");
    }
}

// Interface (Contract)
interface Chargeable {
    void chargeBattery(); // Contract method
}

// Concrete subclass extending Vehicle and implementing Chargeable
class ElectricCar extends Vehicle implements Chargeable {
    
    ElectricCar(String brand) {
        super(brand);
    }

    // Implementing abstract method from Vehicle
    @Override
    void accelerate() {
        System.out.println(brand + " electric car accelerates silently.");
    }

    // Implementing method from Chargeable interface
    @Override
    public void chargeBattery() {
        System.out.println(brand + " is charging...");
    }
}

class AbstractAndInterface {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla");
        tesla.horn();
        tesla.accelerate();
        tesla.chargeBattery();
    }
}

/*
Output:
Tesla vehicle: Beep Beep!
Tesla electric car accelerates silently.
Tesla is charging...
*/

/*

Differences between Abstract Class and Interface:

| Feature             | Abstract Class                               | Interface                                         |
| ------------------- | -------------------------------------------- | ------------------------------------------------- |
| **Inheritance**     | Extended using `extends` (Single inheritance) | Implemented using `implements` (Multiple allowed) |
| **Methods**         | Can have abstract & concrete methods         | Mostly abstract (default/static allowed)          |
| **Variables**       | Can have instance/non-final variables        | Only constants (`public static final`)            |
| **Constructor**     | Can have constructors                        | Cannot have constructors                          |
| **Access Modifiers**| Methods can be public, protected, private    | Methods are public by default                     |

*/
