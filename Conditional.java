/*

Conditional Statements in Java

Definition:

Conditional statements are used to execute a block of code based on a condition.

Syntax:

if (condition) {
    // code to be executed if condition is true
}

Example:

int a = 10;
if (a > 5) {
    System.out.println("a is greater than 5");
}

Types of Conditional Statements in Java

1. if Statement

Definition:

The if statement is used to execute a block of code if a condition is true.

Syntax:

if (condition) {
    // code to be executed if condition is true
}

Example:

int a = 10;
if (a > 5) {
    System.out.println("a is greater than 5");
}

Output:
a is greater than 5

2. if-else Statement

Definition:

The if-else statement is used to execute one block of code if a condition is true and another block of code if the condition is false.

Syntax:

if (condition) {
    // code to be executed if condition is true
} else {
    // code to be executed if condition is false
}

Example:

int a = 10;
if (a > 5) {
    System.out.println("a is greater than 5");
} else {
    System.out.println("a is not greater than 5");
}

Output:
a is greater than 5

3. if-else-if Statement

Definition:

The if-else-if statement is used to execute one block of code if a condition is true and another block of code if the condition is false and another block of code if the condition is false and so on.

Syntax:

if (condition1) {
    // code to be executed if condition1 is true
} else if (condition2) {
    // code to be executed if condition2 is true
} else {
    // code to be executed if condition1 and condition2 are false
}

Example:

int a = 10;
if (a > 5) {
    System.out.println("a is greater than 5");
} else if (a > 10) {
    System.out.println("a is greater than 10");
} else {
    System.out.println("a is not greater than 5 and not greater than 10");
}

Output:
a is greater than 5

4. Nested if Statement

Definition:

The nested if statement is used to execute one block of code if a condition is true and another block of code if the condition is false and so on.

Syntax:

if (condition1) {
    if (condition2) {
        // code to be executed if condition1 and condition2 are true
    } else {
        // code to be executed if condition1 is true and condition2 is false
    }
} else {
    // code to be executed if condition1 is false
}

Example:

int a = 10;
if (a > 5) {
    if (a > 10) {
        System.out.println("a is greater than 5 and greater than 10");
    } else {
        System.out.println("a is greater than 5 and not greater than 10");
    }
} else {
    System.out.println("a is not greater than 5");
}

Output:
a is greater than 5 and not greater than 10

5. Switch Statement

Definition:

The switch statement is used to execute one block of code if a condition is true and another block of code if the condition is false and so on.

Syntax:

switch (expression) {
    case value1:  // code to be executed if expression equals value1
        break;
    case value2:  // code to be executed if expression equals value2
        break;
    default:  // code to be executed if expression does not equal any of the values
        break;
}

Example:

int a = 10;
switch (a) {
    case 10:  // code to be executed if a equals 10
        System.out.println("a is 10");
        break;
    case 20:  // code to be executed if a equals 20
        System.out.println("a is 20");
        break;
    default:  // code to be executed if a does not equal 10 and not equal 20
        System.out.println("a is not 10 and not 20");
        break;
}

Output:
a is 10

6. Ternary Operator

Definition:

The ternary operator is used to execute one block of code if a condition is true and another block of code if the condition is false and so on.

Syntax:

condition ? value1 : value2;

Example:

int a = 10;
String result = (a > 5) ? "a is greater than 5" : "a is not greater than 5";
System.out.println(result);

Output:
a is greater than 5

Common Condition Operators:

1. == (Equal to)
2. != (Not equal to)
3. > (Greater than)
4. < (Less than)
5. >= (Greater than or equal to)
6. <= (Less than or equal to)
7. && (Logical AND)
8. || (Logical OR)
9. ! (Logical NOT)
10. ? : (Ternary Operator)
11. % (Modulo Operator)
12. ++ (Increment Operator)
13. -- (Decrement Operator)
14. += (Addition Assignment Operator)
15. -= (Subtraction Assignment Operator)
16. *= (Multiplication Assignment Operator)
17. /= (Division Assignment Operator)
18. %= (Modulo Assignment Operator)
19. &= (Bitwise AND Assignment Operator)
20. |= (Bitwise OR Assignment Operator)
21. ^= (Bitwise XOR Assignment Operator)
22. <<= (Left Shift Assignment Operator)
23. >>= (Right Shift Assignment Operator)
24. >>>= (Unsigned Right Shift Assignment Operator)
25. instanceof (Instanceof Operator)

*/