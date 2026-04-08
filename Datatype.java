//Datatype in Java:

//Datatype is a type of data that can be stored in a variable.
//Datatype is a type of data that can be processed by a program.
//Datatype is a type of data that can be manipulated by a program.

//Types of Datatype:

//1. Primitive Datatype
//2. Non-Primitive Datatype

//Primitive Datatype:

//int
//double
//float
//char
//boolean
//long
//short
//byte

//Example:

class Datatype{
    public static void main(String[] args){
        //Primitive Datatype
        int a = 10;
        double b = 20.5;
        float c = 30.5f;
        char d = 'A';
        boolean e = true;
        long f = 40;
        short g = 50;
        byte h = 60;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}

//Output:

//10
//20.5
//30.5
//A
//true
//40
//50
//60

/* 

Non-Primitive Datatype:

1.String
2.Array
3.Class 
4.Object
5.Interface
6.Enum
7.Wrapper Class

Define and Example of Non-Primitive Datatype:

1. String:

A String is a sequence of characters used to store and manipulate text. It is a class in Java.

Example: "Hello"

Syntax:

String variableName = "value";

Program:

class StringExample {
    public static void main(String[] args) {
        String name = "Vijay";
        System.out.println(name);
    }
}

Output:
Vijay

2. Array:

An Array is a collection of elements of the same data type stored in contiguous memory locations.

Example: int arr[] = {1, 2, 3}

Syntax:

datatype[] arrayName = {value1, value2, value3};

Program:

class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

Output:
1 2 3 4

3. Class & Object:

A Class is a blueprint or template used to create objects. It defines properties (variables) and behaviors (methods).

Example: class Student { }

An Object is an instance of a class. It represents a real-world entity and can access the properties and methods of the class.

Example: Student s = new Student();

Syntax:

class ClassName {
    // properties (variables)
    // behaviors (methods)
}

Program:

class Student {
    String name = "Vijay";

    void display() {
        System.out.println(name);
    }
}

class ClassExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

Output:
Vijay

4. Interface:

An Interface is a collection of abstract methods that a class must implement. It is used to achieve abstraction.

Example: interface Animal { void sound(); }

Syntax:

interface InterfaceName {
    // abstract methods
}

Program:

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class InterfaceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

Output:
Dog barks

5. Enum:

An Enum is a special type of data type that can only have a fixed set of values. 
It is used to represent a fixed set of constants.

Example: enum Day { MONDAY, TUESDAY, WEDNESDAY }

Syntax:

enum EnumName {
    // constants
}

Program:

class EnumExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today);
    }
}
    
Output:
MONDAY

6. Wrapper Class:

A Wrapper Class converts primitive data types into objects. Each primitive type has a corresponding wrapper class.

Example: int → Integer

Syntax:

WrapperClassName variableName = value;

Program:

class WrapperExample {
    public static void main(String[] args) {
        Integer num = 100;
        System.out.println(num);
    }
}

Output:
100

*/

/*

Note:


| Feature            | Primitive Data Types      | Non-Primitive Data Types                      |
| ------------------ | ------------------------- | --------------------------------------------- |
| **Definition**     | Basic built-in data types | Derived / user-defined data types             |
| **Examples**       | int, float, char, boolean | String, Array, Class, Object, Interface, Enum |
| **Memory Storage** | Stores actual value       | Stores reference (address)                    |
| **Size**           | Fixed size                | No fixed size (depends on object)             |
| **Speed**          | Faster                    | Slower compared to primitive                  |
| **Null Value**     | Cannot be null            | Can be null                                   |
| **Methods**        | No methods                | Can have methods                              |
| **Creation**       | Directly created          | Created using `new` keyword (mostly)          |
| **Type**           | Value type                | Reference type                                |

*/
