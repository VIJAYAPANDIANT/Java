/* 

Polymorphism in Java

Definition:
- Polymorphism means "many forms". It occurs when we have many classes that are related to each other by inheritance.
- It allows us to perform a single action in different ways.

Types of Polymorphism:

1. Compile-Time Polymorphism (Static Binding):
   - Achieved through Method Overloading (same method name, different parameter signature).
   - Resolved by the compiler during code compilation.

2. Runtime Polymorphism (Dynamic Binding):
   - Achieved through Method Overriding (same method name and signature in parent and child class).
   - The JVM resolves the call to the appropriate overridden method at execution time based on the actual object type, not the reference type.

Syntax:
Parent obj = new Child(); // Upcasting (Implicit)
if (obj instanceof Child) {
    Child c = (Child) obj; // Downcasting (Explicit)
}

*/

/*

Casting & Instanceof:

- Upcasting: Casting a subclass reference to a superclass type (implicit and safe).
- Downcasting: Casting a superclass reference to a subclass type (must be explicit, can fail).
- instanceof: An operator used to test whether the object is an instance of a specified class or subclass before downcasting to avoid ClassCastException.

Example Program:
*/

class Payment {
    void processPayment(double amount) {
        System.out.println("Processing generic payment of: $" + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of: $" + amount);
    }

    void swipeCard() {
        System.out.println("Card swiped successfully.");
    }
}

class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of: $" + amount);
    }
}

class PolymorphismExample {
    public static void main(String[] args) {
        // Runtime Polymorphism: Reference is Payment, but objects are subclasses
        Payment p1 = new CreditCardPayment(); // Upcasting (implicit)
        Payment p2 = new PayPalPayment();     // Upcasting (implicit)

        p1.processPayment(100.0); // Calls CreditCardPayment's processPayment()
        p2.processPayment(200.0); // Calls PayPalPayment's processPayment()

        System.out.println("------------------------------------");

        // Checking instance and Downcasting safely using instanceof
        checkAndExecute(p1);
        checkAndExecute(p2);
    }

    static void checkAndExecute(Payment payment) {
        if (payment instanceof CreditCardPayment) {
            // Safe downcasting
            CreditCardPayment cc = (CreditCardPayment) payment;
            cc.swipeCard();
        } else if (payment instanceof PayPalPayment) {
            System.out.println("This is a PayPal payment. No card swipe needed.");
        }
    }
}

/*
Output:
Processing credit card payment of: $100.0
Processing PayPal payment of: $200.0
------------------------------------
Card swiped successfully.
This is a PayPal payment. No card swipe needed.
*/
