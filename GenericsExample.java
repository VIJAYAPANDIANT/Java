/* 

Generics in Java

Definition:
- Generics allow classes, interfaces, and methods to be parameterized by types.
- They provide compile-time type safety, eliminating class cast exceptions and the need for manual type casting.

Key Concepts:

1. Generic Class:
   - A class that can operate on any object type specified at instantiation.
   - e.g., class Box<T> { T data; }

2. Type Safety:
   - Without generics, collections hold objects, requiring explicit casts.
   - With generics, the compiler prevents invalid type insertions.

3. Wildcards (?):
   - Represent an unknown type.
   - Unbounded Wildcard (?): Represents any type.
   - Upper Bounded Wildcard (? extends Number): Restricts type to a specific class or its subclasses.
   - Lower Bounded Wildcard (? super Integer): Restricts type to a specific class or its superclasses.

Syntax:
class GenericClass<T> {
    T field;
}
List<?> wildcardList;
List<? extends Number> upperBoundedList;

*/

import java.util.List;

// Generic Box Class
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class GenericsExample {
    // Wildcard demonstration: Print list of any type
    static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    // Upper Bounded Wildcard: Summing numbers
    static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // 1. Generic Class Usage
        System.out.println("--- Generic Class ---");
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics");
        System.out.println("Box contains: " + stringBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Box contains: " + intBox.getItem());

        System.out.println("\n--- Wildcards ---");
        // Use List.of instead of Arrays.asList to avoid shadowing from local Arrays class
        List<String> stringList = List.of("Java", "Python", "C++");
        List<Integer> intList = List.of(10, 20, 30);

        System.out.print("String List: ");
        printList(stringList);

        System.out.print("Integer List: ");
        printList(intList);

        // Sum of list using upper bounded wildcard
        double sum = sumOfList(intList);
        System.out.println("Sum of Integer List: " + sum);
    }
}
