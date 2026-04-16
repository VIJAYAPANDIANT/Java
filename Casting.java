/*

Casting

Define:

Casting is the process of converting one data type into another data type in Java.

Type Casting in Java:

Type Casting = Converting one data type into another.

            1.Widening Casting (Implicit Casting)
            2.Narrowing Casting (Explicit Casting)
            3.Upcasting(object casting)
            4.Downcasting(object casting)

1. Widening Casting (Implicit Casting)

Definition:

Converting a smaller data type → larger data type automatically

Order:

byte → short → int → long → float → double

Syntax:

largerType variable = smallerTypeValue;

Program:

class WideningExample {
    public static void main(String[] args) {
        int num = 10;
        double result = num;  // automatic casting

        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + result);
    }
}

Output:
Integer value: 10
Double value: 10.0

2. Narrowing Casting (Explicit Casting)

Definition:

Converting a larger data type → smaller data type manually

Order:

double → float → long → int → short → byte

Note: This is the reverse of widening casting.

Syntax:

smallerType variable = (smallerType) largerTypeValue;

Program:

class NarrowingExample {
    public static void main(String[] args) {
        double num = 10.75;
        int result = (int) num;  // manual casting

        System.out.println("Double value: " + num);
        System.out.println("Integer value: " + result);
    }
}

Output:
Double value: 10.75
Integer value: 10

Widening and Narrowing Casting Together

Program:

class CastingDemo {
    public static void main(String[] args) {
        int a = 25;

        // Widening
        double b = a;

        // Narrowing
        int c = (int) b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

Output:
a = 25
b = 25.0
c = 25

Different between widening and narrowing casting

| Feature       | Widening Casting | Narrowing Casting |
| ------------- | ---------------- | ----------------- |
| Conversion    | Small → Large    | Large → Small     |
| Casting Type  | Automatic        | Manual            |
| Data Loss     | No               | Yes (possible)    |
| Syntax Needed | No               | Yes               |

Object Type Casting

1. Upcasting (Implicit Casting)

Definition:

Converting a child class object → parent class reference

Done automatically (no casting needed)

Syntax:

ParentClass ref = new ChildClass();

Program:

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class UpcastingExample {
    public static void main(String[] args) {
        Animal obj = new Dog();  // Upcasting

        obj.sound();  // Parent method
        // obj.bark(); //Not allowed
    }
}

Output:
Animal makes sound

Key Point:

You can access only parent class methods

2. Downcasting (Explicit Casting)

Definition:

Converting a parent class reference → child class reference

Must be done manually using casting

Syntax:

ChildClass ref = (ChildClass) parentReference;

Program:

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class DowncastingExample {
    public static void main(String[] args) {
        Animal obj = new Dog();   // Upcasting first

        Dog d = (Dog) obj;        // Downcasting

        d.sound();
        d.bark();
    }
}

Output:
Animal makes sound
Dog barks

Note:

Wrong Downcasting:

Animal obj = new Animal();
Dog d = (Dog) obj;  // Runtime Error

This gives:

ClassCastException

*/

/* 

Difference Between Upcasting & Downcasting

| Feature       | Upcasting           | Downcasting           |
| ------------- | ------------------- | --------------------- |
| Direction     | Child → Parent      | Parent → Child        |
| Casting Type  | Automatic           | Manual                |
| Safety        | Safe                | Risky (Runtime error) |
| Method Access | Parent methods only | Both Parent + Child   |

*/