/* 

Exception Handling in Java

Definition:
- Exception handling is a mechanism to handle runtime errors, ensuring the normal flow of the application is maintained.

Types of Exceptions:

1. Checked Exceptions:
   - Exceptions checked at compile-time. Code will not compile if not handled or declared.
   - e.g., IOException, SQLException, FileNotFoundException.

2. Unchecked Exceptions (Runtime Exceptions):
   - Exceptions that occur at runtime. They are not checked at compile-time.
   - e.g., NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException.

Keywords:
- try: Defines a block of code to be tested for errors.
- catch: Defines a block of code to handle the exception.
- finally: Executed regardless of whether an exception occurred or was handled.
- throw: Used to explicitly throw an exception.
- throws: Declares exceptions that a method might throw.

Syntax:
try {
    // code that might throw exception
} catch (ExceptionType e) {
    // exception handling
} finally {
    // block execution guaranteed
}

*/

// Custom Exception Definition
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Pass message to Exception superclass
    }
}

class ExceptionHandlingExample {
    // Method declaring a checked / custom exception using throws
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older to register.");
        }
        System.out.println("Registration successful! Age is valid.");
    }

    public static void main(String[] args) {
        // 1. Handling unchecked exception (ArithmeticException)
        System.out.println("--- Handling ArithmeticException ---");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed for arithmetic test.");
        }

        // 2. Handling custom and checked exception
        System.out.println("\n--- Handling Custom Exception ---");
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed for registration test.");
        }
    }
}
