//Datatype in Java:

//Datatype is a type of data that can be stored in a variable.
//Datatype is a type of data that can be processed by a program.
//Datatype is a type of data that can be manipulated by a program.

//Types of Datatype:

//1. Primitive Datatype
//2. Non-Primitive Datatype

/* 

Primitive Datatype:

1.int
2.double
3.float
4.char
5.boolean
6.long
7.short
8.byte


1. int

Definition:

int is used to store whole numbers (integers) without decimals.

Syntax:

int variableName = value;

Program:

class IntExample {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
    }
}

Output:
10

2. double

Definition:

double is used to store decimal numbers with double precision.

Syntax:

double variableName = value;

Program:

class DoubleExample {
    public static void main(String[] args) {
        double b = 20.5;
        System.out.println(b);
    }
}

Output:
20.5

3. float

Definition:

float is used to store decimal numbers with single precision (requires f at the end).

Syntax:

float variableName = value;

Program:

class FloatExample {
    public static void main(String[] args) {
        float c = 30.5f;
        System.out.println(c);
    }
}

Output:
30.5

4. char

Definition:

char is used to store a single character.

Example:

class CharExample {
    public static void main(String[] args) {
        char d = 'A';
        System.out.println(d);
    }
}

Output:
A

5. boolean

Definition:

boolean is used to store true or false values.

Syntax:

boolean variableName = value;

Program:

class BooleanExample {
    public static void main(String[] args) {
        boolean e = true;
        System.out.println(e);
    }
}

Output:
true

6. long

Definition:

long is used to store large whole numbers.

Syntax:

long variableName = value;

Program:

class LongExample {
    public static void main(String[] args) {
        long f = 100000L;
        System.out.println(f);
    }
}

Output:
100000

7. short

Definition:

short is used to store small whole numbers.

Syntax:

short variableName = value;

Program:

class ShortExample {
    public static void main(String[] args) {
        short g = 50;
        System.out.println(g);
    }
}

Output:
50

8. byte

Definition:

byte is used to store very small whole numbers.

Syntax:

byte variableName = value;

Program:

class ByteExample {
    public static void main(String[] args) {
        byte h = 60;
        System.out.println(h);
    }
}

Output:

60

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

1. String

Definition:

A String is a sequence of characters used to store and manipulate text. 

It is a class in Java.

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

2. Array

Definition:

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

3. Class & Object

Definition:

A Class is a blueprint or template used to create objects. 

It defines properties (variables) and behaviors (methods).

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

4. Interface

Definition:

An Interface is a collection of abstract methods that a class must implement. 

It is used to achieve abstraction.

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

5. Enum

Definition:

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

6. Wrapper Class

Definition:

A Wrapper Class converts primitive data types into objects.
 
Each primitive type has a corresponding wrapper class.

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

Difference between Primitive and Non-Primitive Data Types:

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

/*

Data Types (Size & Range)

Primitive Data Types (Size & Range):

| Data Type   | Size                  | Range                              |
| ----------- | --------------------- | ---------------------------------- |
| **byte**    | 1 byte (8 bits)       | -128 to 127                        |
| **short**   | 2 bytes (16 bits)     | -32,768 to 32,767                  |
| **int**     | 4 bytes (32 bits)     | -2³¹ to 2³¹-1                      |
| **long**    | 8 bytes (64 bits)     | -2⁶³ to 2⁶³-1                      |
| **float**   | 4 bytes (32 bits)     | ~ ±3.4 × 10³⁸ (6-7 decimal digits) |
| **double**  | 8 bytes (64 bits)     | ~ ±1.7 × 10³⁰⁸ (15 decimal digits) |
| **char**    | 2 bytes (16 bits)     | 0 to 65,535 (Unicode)              |
| **boolean** | 1 bit (JVM dependent) | true / false                       |


Non-Primitive Data Types (Size):

--> No fixed size

| Type          | Size                            |
| ------------- | ------------------------------- |
| String        | Depends on number of characters |
| Array         | Depends on number of elements   |
| Class         | Depends on variables inside     |
| Object        | Depends on object data          |
| Interface     | No storage (only methods)       |
| Enum          | Depends on constants            |
| Wrapper Class | Depends on object               |




*/
