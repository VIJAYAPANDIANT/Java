/* 

Lambdas & Streams API in Java

Definitions:

1. Lambda Expressions:
   - Anonymous functions (no name, return type, or modifiers) that allow passing behavior as arguments.
   - Syntax: (parameters) -> { body }

2. Functional Interfaces:
   - An interface with exactly one abstract method (annotated with @FunctionalInterface).
   - e.g., Runnable, Comparator, or built-in Java 8 functional interfaces:
     - Predicate<T>: Returns boolean.
     - Function<T, R>: Accepts T, returns R.
     - Consumer<T>: Accepts T, returns void (performs action).
     - Supplier<T>: Accepts nothing, returns T.

3. Method References:
   - Shorthand syntax for lambda expressions that call an existing method.
   - Syntax: ClassName::methodName or object::methodName

4. Streams API:
   - A sequence of elements supporting sequential and parallel aggregate operations.
   - Map: Transforms elements.
   - Filter: Selects elements based on a condition.
   - Collect: Packages stream elements into a collection (List, Set, etc.).

*/

import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

class LambdaAndStreams {
    public static void main(String[] args) {
        // 1. Custom Functional Interface with Lambda
        System.out.println("--- Lambda Expression ---");
        MathOperation addition = (a, b) -> a + b;
        System.out.println("10 + 5 = " + addition.operate(10, 5));

        // 2. Method References
        System.out.println("\n--- Method Reference ---");
        // Use List.of instead of Arrays.asList to avoid shadowing from local Arrays class
        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.forEach(System.out::println);

        // 3. Streams API (Filter, Map, Collect)
        System.out.println("\n--- Streams API Example ---");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Stream pipeline: Filter even numbers, square them, and collect into a list
        List<Integer> squaredEvens = numbers.stream()
                .filter(n -> n % 2 == 0)        // Intermediate operation: Filter
                .map(n -> n * n)                // Intermediate operation: Map
                .collect(Collectors.toList());  // Terminal operation: Collect

        System.out.println("Original numbers: " + numbers);
        System.out.println("Squared even numbers: " + squaredEvens);
    }
}
