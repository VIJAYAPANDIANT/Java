/*

String in Java

Definition:

A String in Java is a sequence of characters used to store and manipulate text.
It is an object of the String class.

Syntax:

String variableName = "value";

Example:

String name = "Vijay";

String Methods in Java

Definition:

String methods are built-in functions used to perform operations on strings like length, comparison, conversion, etc.

1. length()

Definition:

Returns the length of the string.

Example:

String name = "Vijay";
System.out.println(name.length());  // Output: 5

2. toUpperCase()

Definition:

Converts the string to uppercase.

Example:

String name = "Vijay";
System.out.println(name.toUpperCase());  // Output: VIJAY

3. toLowerCase()

Definition:

Converts the string to lowercase.

Example:

String name = "Vijay";
System.out.println(name.toLowerCase());  // Output: vijay

4. equals()

Definition:

Compares two strings for equality.

Example:

String name1 = "Vijay";
String name2 = "Vijay";
System.out.println(name1.equals(name2));  // Output: true

5. contains()

Definition:

Checks if the string contains a specific sequence of characters.

Example:

String name = "Vijay";
System.out.println(name.contains("Vij"));  // Output: true

6. charAt()

Definition:

Returns the character at a specific index.

Example:

String name = "Vijay";
System.out.println(name.charAt(0));  // Output: V

7. substring()

Definition:

Extracts a part of the string.

Example:

String name = "Vijay";
System.out.println(name.substring(1));  // Output: ijay

8. trim()

Definition:

Removes leading and trailing whitespace.

Example:

String name = "  Vijay  ";
System.out.println(name.trim());  // Output: Vijay

9. replace()

Definition:

Replaces characters in the string.

Example:

String name = "Vijay";
System.out.println(name.replace("V", "P"));  // Output: Pijay

10. isEmpty()

Definition:

Checks if the string is empty.

Example:

String name = "";
System.out.println(name.isEmpty());  // Output: true

Overall Program:

class StringMethodsExample {
    public static void main(String[] args) {
        String name = "  Vijay  ";

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Contains 'Vij': " + name.contains("Vij"));
        System.out.println("Character at index 0: " + name.charAt(0));
        System.out.println("Substring from index 1: " + name.substring(1));
        System.out.println("Trimmed: " + name.trim());
        System.out.println("Replaced: " + name.replace("V", "P"));
        System.out.println("Is empty: " + name.isEmpty());
    }
}

Output:
Length: 9
Uppercase:   VIJAY  
Lowercase:   vijay  
Contains 'Vij': true
Character at index 0:  
Substring from index 1:   ijay  
Trimmed: Vijay
Replaced:   Pijay  
Is empty: false

*/