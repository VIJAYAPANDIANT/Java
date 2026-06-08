/* 

Methods in Java

Definition:
- A method is a block of code (function) that only runs when it is called.
- Methods are used to perform certain actions, promote code reuse, and divide a program into smaller, manageable pieces.
- Methods must be declared within a class.

Syntax:
modifier returnType methodName(parameters) {
    // method body
    // return statement (if returnType is not void)
}

*/

/*

1. Method Parameters & Return Values

Definition:
- Parameters act as variables inside the method. You can pass data (arguments) into methods.
- The return keyword is used to send a value back from the method to the caller.
- If a method does not return any value, its return type is set to 'void'.

Example Program:
*/

class MethodDemo {
    
    // Method with no parameters and void return type
    static void greet() {
        System.out.println("Hello, welcome to Java Methods!");
    }

    // Method with parameters and a return value
    static int add(int a, int b) {
        return a + b;
    }

    // Method with parameter and void return type
    static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Access granted - You are an adult.");
        } else {
            System.out.println("Access denied - You are under 18.");
        }
    }

    public static void main(String[] args) {
        greet();
        
        int result = add(10, 20);
        System.out.println("Sum of 10 and 20 is: " + result);

        checkAge(20);
    }
}

/*
Output:
Hello, welcome to Java Methods!
Sum of 10 and 20 is: 30
Access granted - You are an adult.
*/

/*

2. Method Overloading

Definition:
- Method overloading is a feature that allows a class to have more than one method having the same name, 
  if their argument lists are different.
- Argument lists can differ by:
  1. Number of parameters.
  2. Data types of parameters.
  3. Sequence of data types of parameters.
- Note: Changing the return type alone is NOT method overloading and will result in a compile-time error.

Example Program:
*/

class OverloadExample {

    // Overloaded method: 2 integer parameters
    static int multiply(int a, int b) {
        return a * b;
    }

    // Overloaded method: 3 integer parameters
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Overloaded method: 2 double parameters
    static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Product of 2 ints: " + multiply(5, 4));
        System.out.println("Product of 3 ints: " + multiply(5, 4, 3));
        System.out.println("Product of 2 doubles: " + multiply(5.5, 4.0));
    }
}

/*
Output:
Product of 2 ints: 20
Product of 3 ints: 60
Product of 2 doubles: 22.0
*/
