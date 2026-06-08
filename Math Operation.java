/*
Math Operations in Java

Definition:
- Math operations are arithmetic calculations performed on numbers using operators or built-in methods in Java.
*/

class MathOperationsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Addition (+): " + (a + b));
        System.out.println("Subtraction (-): " + (a - b));
        System.out.println("Multiplication (*): " + (a * b));
        System.out.println("Division (/): " + (a / b));
        System.out.println("Modulo (%): " + (a % b));

        System.out.println("\nBuilt-in Math Class Methods:");
        System.out.println("Absolute value of -10: " + Math.abs(-10));
        System.out.println("Square root of 16: " + Math.sqrt(16));
        System.out.println("Maximum of a and b: " + Math.max(a, b));
        System.out.println("Power 2^3: " + Math.pow(2, 3));
    }
}