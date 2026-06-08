/* 

Regex & String Formatting in Java

Definitions:

1. Regular Expressions (Regex):
   - A regular expression is a sequence of characters that forms a search pattern.
   - java.util.regex package contains:
     - Pattern Class: Defines a pattern (to be used in a search).
     - Matcher Class: Used to search for the pattern.

2. String Formatting:
   - String.format() provides layout control for strings, similar to printf in C.
   - Useful for padding, decimals, and alignments.

Syntax:
Pattern pattern = Pattern.compile("regexPattern");
Matcher matcher = pattern.matcher("targetText");
boolean found = matcher.find();
String formatted = String.format("formatSpecifier", args);

*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {
    public static void main(String[] args) {
        // 1. Regex (Pattern & Matcher)
        System.out.println("--- Regex Examples ---");
        String text = "Contact us at info@example.com or support@website.org";
        
        // Simple regex pattern to match email addresses
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);
        
        System.out.println("Finding emails in text: \"" + text + "\"");
        while (matcher.find()) {
            System.out.println("Found match: " + matcher.group() + " at indexes (" + matcher.start() + " to " + matcher.end() + ")");
        }

        // 2. String.format() Examples
        System.out.println("\n--- String formatting Examples ---");
        String name = "Vijay";
        int score = 95;
        double gpa = 3.8456;

        // %s for String, %d for integer, %.2f for double with 2 decimal places
        String formattedString = String.format("Student: %s | Score: %d | GPA: %.2f", name, score, gpa);
        System.out.println(formattedString);

        // Padding/Alignment formatting
        System.out.println(String.format("Left aligned:  |%-10s|", name));
        System.out.println(String.format("Right aligned: |%10s|", name));
    }
}
