/*

Math Operations in Java

Definition:

Math operations are arithmetic calculations performed on numbers such as addition, subtraction, multiplication, and division using operators or built-in methods in Java.

Syntax:

int variableName = value;

Example:

int a = 10;
int b = 20;

Math Operations in Java

1. Addition (+)

Definition:

Adds two numbers.

Example:

int a = 10;
int b = 20;
System.out.println(a + b);  // Output: 30

2. Subtraction (-)

Definition:

Subtracts two numbers.

Example:

int a = 10;
int b = 20;
System.out.println(a - b);  // Output: -10

3. Multiplication (*)

Definition:

Multiplies two numbers.

Example:

int a = 10;
int b = 20;
System.out.println(a * b);  // Output: 200

4. Division (/)

Definition:

Divides two numbers.

Example:

int a = 10;
int b = 20;
System.out.println(a / b);  // Output: 0

5. Modulo (%)

Definition:

Returns the remainder of a division.

Example:

int a = 10;
int b = 20;
System.out.println(a % b);  // Output: 10

Overall Program:

class MathOperationsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));
    }
}

Output:
Addition: 30
Subtraction: -10
Multiplication: 200
Division: 0
Modulo: 10

Difference Between Math and Math Operations

| Feature       | Math                                     | Math Operations                                      |
| ------------- | ------------------------------------------ | ---------------------------------------------------- |
| Definition    | Mathematical operations                  | Arithmetic operations                                |
| Type          | Class                                    | Methods (functions)                                  |
| Usage         | Perform mathematical calculations        | Perform arithmetic operations                        |
| Example       | Math.abs(-10); Math.sqrt(16);            | a + b; a - b; a * b; a / b; a % b;                   |
| Returns       | Depends on method (int, double, etc.)    | Depends on operation (int, double, etc.)             |
| Modifiable    | Immutable (cannot be changed)              | Create new values (values are immutable)             |
| Memory        | No extra memory (operate on existing values) | No extra memory (operate on existing values)         |
| Null Check    | Not applicable                           | Not applicable                                       |
| Common Methods| abs(), sqrt(), pow(), max(), min(), etc.   | +, -, *, /, %                                        |

*/