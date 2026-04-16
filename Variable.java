/*

Variable in Java

Definition:

A variable is a named memory location used to store data that can be changed during program execution.

Syntax:

datatype variableName = value;

Types of Variable:

1. Local Variable
2. Instance Variable
3. Static Variable

1. Local Variable

Definition:

A local variable is declared inside a method or block.

Syntax:

methodName(){
    datatype variableName = value;
}

Example:

class LocalVariableExample {
    public static void main(String[] args) {
        int a = 10;//local variable
        System.out.println(a);
    }
}

Output:
10

2. Instance Variable

Definition:

An instance variable is declared inside a class but outside any method.

Syntax:

class ClassName {
    datatype variableName = value;
}

Example:

class InstanceVariableExample {
    int a = 10;//instance variable

    public static void main(String[] args) {
        InstanceVariableExample obj = new InstanceVariableExample();
        System.out.println(obj.a);
    }
}

Output:
10

3. Static Variable

Definition:

A static variable is declared inside a class but outside any method using the static keyword.

Syntax:

class ClassName {
    static datatype variableName = value;
}

Example:

class StaticVariableExample {
    static int a = 10;//static variable

    public static void main(String[] args) {
        System.out.println(a);
    }
}

Output:
10

*/