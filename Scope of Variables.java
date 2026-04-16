/* 

Scope of Variables 

Definition:

Scope of a variable refers to the region in a program where the variable can be accessed or used.

Types of Scope with Syntax:

          1.Block Scope
          2.Method Scope
          3.Class Scope

1. Block Scope

Definition:

Variables declared inside a block { } are accessible only within that block.

Syntax:

{
    dataType variableName = value;
}

Example:

{
    int x = 10;
}
// x cannot be accessed here

2. Method Scope

Definition:

Variables declared inside a method are accessible only within that method.

Syntax:

returnType methodName() {
    dataType variableName = value;
}

Example:

void test() {
    int y = 20;
}

3. Class Scope

Definition:

Variables declared inside a class but outside methods are accessible throughout the class.

Syntax:

class ClassName {
    dataType variableName;        // instance variable
    static dataType variableName; // static variable
}

Example:

class Test {
    int a = 10;         // instance variable
    static int b = 20;  // static variable
}

Overall Program:

class Demo {
    int instanceVar = 10;      // class scope (instance)
    static int staticVar = 20; // class scope (static)

    void show() {
        int localVar = 5;  // method scope (local variable)

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
    }
}

Output:
Local Variable: 5
Instance Variable: 10
Static Variable: 20

*/