/*
Variable in Java

Definition:
- A variable is a container that holds values while the Java program is executed.

Types of Variables:
1. Local Variable: declared inside method or block.
2. Instance Variable: declared inside class but outside any method (non-static).
3. Static Variable: declared with the static keyword inside class but outside any method.
*/

class Variable {
    // Instance Variable
    int instanceVar = 100;

    // Static Variable
    static int staticVar = 200;

    public static void main(String[] args) {
        // Local Variable
        int localVar = 50;

        System.out.println("Local Variable: " + localVar);

        // Accessing Static Variable directly
        System.out.println("Static Variable: " + staticVar);

        // Accessing Instance Variable through object
        Variable obj = new Variable();
        System.out.println("Instance Variable: " + obj.instanceVar);
    }
}
