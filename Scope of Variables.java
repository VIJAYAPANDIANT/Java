/* 
Scope of Variables 

Definition:
- Scope of a variable refers to the region in a program where the variable can be accessed or used.

Types of Scope:
1. Block Scope (inside curly braces {})
2. Method Scope (inside method body)
3. Class Scope (fields declared inside class but outside methods)
*/

class ScopeDemo {
    // Class Scope Variables
    int instanceVar = 10;      // instance variable
    static int staticVar = 20; // static variable

    void show() {
        // Method Scope Variable
        int localVar = 5;  

        System.out.println("Local Variable (Method Scope): " + localVar);
        System.out.println("Instance Variable (Class Scope): " + instanceVar);
        System.out.println("Static Variable (Class Scope): " + staticVar);

        // Block Scope Variable
        {
            int blockVar = 99;
            System.out.println("Block Variable (Block Scope): " + blockVar);
        }
        // blockVar cannot be accessed here
    }

    public static void main(String[] args) {
        ScopeDemo obj = new ScopeDemo();
        obj.show();
    }
}