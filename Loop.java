/* 

Loops in Java

Definition:
- Loops are used to execute a block of code repeatedly as long as a specified condition is met.
- They help in reducing code redundancy and iterating over arrays/collections.

Types of Loops:
1. for loop
2. while loop
3. do-while loop
4. for-each (enhanced for) loop

*/

/*

1. for loop

Definition:
- Used when you know exactly how many times you want to loop through a block of code.

Syntax:
for (initialization; condition; increment/decrement) {
    // code block to be executed
}

Example Program:
*/

class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("For Loop 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

/*
Output:
For Loop 1 to 5:
1 2 3 4 5 
*/

/*

2. while loop

Definition:
- Loops through a block of code as long as a specified condition is true.
- Useful when the number of iterations is not known beforehand.

Syntax:
while (condition) {
    // code block to be executed
}

Example Program:
*/

class WhileLoopExample {
    public static void main(String[] args) {
        System.out.println("While Loop 1 to 5:");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}

/*
Output:
While Loop 1 to 5:
1 2 3 4 5 
*/

/*

3. do-while loop

Definition:
- The do-while loop is a variant of the while loop.
- It will execute the code block once before checking the condition, and then repeat the loop as long as the condition is true.
- Guarantees execution at least once.

Syntax:
do {
    // code block to be executed
} while (condition);

Example Program:
*/

class DoWhileLoopExample {
    public static void main(String[] args) {
        System.out.println("Do-While Loop execution (runs at least once):");
        int i = 6;
        do {
            System.out.println("Inside loop, value of i: " + i);
            i++;
        } while (i <= 5);
    }
}

/*
Output:
Do-While Loop execution (runs at least once):
Inside loop, value of i: 6
*/

/*

4. Loop Control Statements: break and continue

- break: Used to exit or terminate the loop prematurely.
- continue: Breaks the current iteration and continues with the next iteration.

Example Program:
*/

class LoopControlExample {
    public static void main(String[] args) {
        System.out.println("Demonstrating 'break' at i = 3:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // exits the loop completely
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Demonstrating 'continue' at i = 3:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skips the print statement for i = 3
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

/*
Output:
Demonstrating 'break' at i = 3:
1 2 
Demonstrating 'continue' at i = 3:
1 2 4 5 
*/
