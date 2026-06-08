/*
Conditional Statements in Java

Definition:
- Conditional statements are used to execute a block of code based on a condition.

Types of Conditional Statements in Java:
1. if Statement
2. if-else Statement
3. if-else-if Statement
4. Nested if Statement
5. Switch Statement
6. Ternary Operator
*/

class Conditional {
    public static void main(String[] args) {
        int a = 10;

        // 1. if & if-else statement
        System.out.println("--- if-else Example ---");
        if (a > 5) {
            System.out.println("a is greater than 5");
        } else {
            System.out.println("a is not greater than 5");
        }

        // 2. if-else-if statement
        System.out.println("\n--- if-else-if Example ---");
        if (a > 15) {
            System.out.println("a is greater than 15");
        } else if (a > 5) {
            System.out.println("a is greater than 5 but less than or equal to 15");
        } else {
            System.out.println("a is 5 or less");
        }

        // 3. Nested if statement
        System.out.println("\n--- Nested if Example ---");
        if (a > 5) {
            if (a > 10) {
                System.out.println("a is greater than 5 and greater than 10");
            } else {
                System.out.println("a is greater than 5 but not greater than 10");
            }
        }

        // 4. Switch Statement
        System.out.println("\n--- Switch Example ---");
        switch (a) {
            case 10:
                System.out.println("a is 10");
                break;
            case 20:
                System.out.println("a is 20");
                break;
            default:
                System.out.println("a is neither 10 nor 20");
                break;
        }

        // 5. Ternary Operator
        System.out.println("\n--- Ternary Operator Example ---");
        String result = (a > 5) ? "a is greater than 5" : "a is not greater than 5";
        System.out.println(result);
    }
}