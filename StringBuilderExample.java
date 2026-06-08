/* 

StringBuilder in Java

Definition:
- In Java, String objects are immutable (meaning they cannot be changed once created).
- Whenever you modify a String (e.g., concatenate, replace), a new String object is created in memory, which is inefficient.
- StringBuilder represents a mutable sequence of characters. It provides an efficient alternative when making frequent modifications to strings.
- Unlike StringBuffer, StringBuilder is not thread-safe, which makes it faster and preferred for single-threaded operations.

Syntax:
StringBuilder variableName = new StringBuilder("value");
variableName.append("suffix");

*/

/*

Key Methods of StringBuilder:

1. append(String s): Appends the string representation of the argument to the sequence.
2. insert(int offset, String s): Inserts the string into this sequence at the specified offset.
3. replace(int start, int end, String s): Replaces the characters in a substring of this sequence with characters in the specified String.
4. delete(int start, int end): Removes the characters in a substring of this sequence.
5. reverse(): Replaces this character sequence with the reverse of the sequence.
6. charAt(int index): Returns the char value in this sequence at the specified index.
7. length(): Returns the length (character count).

Example Program:
*/

class StringBuilderExample {
    public static void main(String[] args) {
        // 1. Creation
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial string: " + sb);

        // 2. Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 3. Insert
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // 4. Replace
        sb.replace(6, 12, "Java");
        System.out.println("After replace: " + sb);

        // 5. Delete
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // 6. Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // Reverse back
        sb.reverse();

        // 7. Get length and charAt
        System.out.println("Length: " + sb.length());
        System.out.println("Character at index 0: " + sb.charAt(0));
    }
}

/*
Output:
Initial string: Hello
After append: Hello World
After insert: Hello, World
After replace: Hello,Java
After delete: HelloJava
After reverse: avaJolleH
Length: 9
Character at index 0: H
*/

/*

Difference between String and StringBuilder:

| Feature          | String                                 | StringBuilder                            |
| ---------------- | -------------------------------------- | ---------------------------------------- |
| **Mutability**   | Immutable (cannot be changed)          | Mutable (can be modified in-place)       |
| **Performance**  | Slower when concatenating many strings | Faster for string modifications          |
| **Memory**       | Creates new objects on modification    | reuses existing memory buffer            |
| **Usage**        | Used for constant values/configuration | Used for dynamic string building/loops   |

*/
