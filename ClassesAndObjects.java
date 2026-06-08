/* 

Classes & Objects in Java

Definition:
1. Class:
   - A class is a user-defined blueprint or prototype from which objects are created.
   - It represents the set of properties (fields/attributes) and methods that are common to all objects of one type.

2. Object:
   - An object is a basic unit of Object-Oriented Programming and represents real-life entities.
   - An object has:
     - State: Represented by fields (variables).
     - Behavior: Represented by methods.
     - Identity: A unique name or identifier (address in memory).

Syntax:
class ClassName {
    // fields
    dataType fieldName;

    // constructor
    ClassName(dataType fieldName) {
        this.fieldName = fieldName;
    }
}
// Instantiation
ClassName obj = new ClassName(value);

*/

/*

Fields & Constructors:

- Fields: Variables declared inside a class to define the state of an object.
- Constructor: A block of code similar to a method that is called when an instance of an object is created.
  - Constructors must have the same name as the class.
  - They do not have a return type (not even void).
  - Types:
    1. Default Constructor (automatically provided if no constructor is written)
    2. Parameterized Constructor (used to initialize fields with custom values)

Example Program:
*/

class Product {
    // Fields / Attributes
    String name;
    double price;
    int stock;

    // 1. Default (No-Argument) Constructor
    Product() {
        this.name = "Unknown Product";
        this.price = 0.0;
        this.stock = 0;
    }

    // 2. Parameterized Constructor
    Product(String name, double price, int stock) {
        this.name = name; // 'this' resolves ambiguity between fields and parameters
        this.price = price;
        this.stock = stock;
    }

    // Method (Behavior)
    void displayDetails() {
        System.out.println("Product: " + name + " | Price: $" + price + " | In Stock: " + stock);
    }
}

class ClassesAndObjects {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Product p1 = new Product();
        p1.displayDetails();

        // Creating an object using the parameterized constructor
        Product p2 = new Product("Laptop", 999.99, 15);
        p2.displayDetails();
    }
}

/*
Output:
Product: Unknown Product | Price: $0.0 | In Stock: 0
Product: Laptop | Price: $999.99 | In Stock: 15
*/
