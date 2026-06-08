/* 

Inheritance in Java

Definition:
- Inheritance is a mechanism in which one class acquires the properties and behaviors of another class.
- It enables code reusability and builds a hierarchical relationship.
- Key terms:
  - Superclass (Parent / Base Class): The class whose features are inherited.
  - Subclass (Child / Derived Class): The class that inherits from the superclass.

Keywords:
- extends: Used to create a subclass.
- super: Used to refer to immediate parent class objects, constructors, or methods.
- @Override: An annotation indicating that a method in a child class overrides a method in its parent class.

Syntax:
class Parent {}
class Child extends Parent {
    Child() {
        super(); // calls parent constructor
    }
}

*/

/*

Example Program:
*/

// Parent class
class Employee {
    String name;
    double baseSalary;

    // Parent Constructor
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    void work() {
        System.out.println(name + " is working.");
    }

    void displaySalary() {
        System.out.println(name + "'s salary: $" + baseSalary);
    }
}

// Child class inheriting from Employee
class Manager extends Employee {
    double bonus;

    // Constructor using 'super' to invoke parent constructor
    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary); // Calls Employee(name, baseSalary)
        this.bonus = bonus;
    }

    // Method overriding: Redefining parent's work() method
    @Override
    void work() {
        System.out.println(name + " is managing the team and reviewing tasks.");
    }

    // Extending parent behavior using super to call parent method
    @Override
    void displaySalary() {
        super.displaySalary(); // Calls Employee's displaySalary()
        System.out.println("Manager Bonus: $" + bonus + " | Total Compensation: $" + (baseSalary + bonus));
    }
}

class InheritanceExample {
    public static void main(String[] args) {
        // Parent class object
        Employee emp = new Employee("Alice", 50000);
        emp.work();
        emp.displaySalary();

        System.out.println("------------------------------------");

        // Child class object
        Manager mgr = new Manager("Bob", 80000, 15000);
        mgr.work(); // Calls overridden method
        mgr.displaySalary(); // Calls overridden method utilizing super
    }
}

/*
Output:
Alice is working.
Alice's salary: $50000.0
------------------------------------
Bob is managing the team and reviewing tasks.
Bob's salary: $80000.0
Manager Bonus: $15000.0 | Total Compensation: $95000.0
*/
