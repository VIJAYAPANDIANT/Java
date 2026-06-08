/* 

Optional class in Java

Definition:
- java.util.Optional<T> is a container object introduced in Java 8 which may or may not contain a non-null value.
- It is used to avoid NullPointerException (NPE) and design cleaner APIs without checking '!= null' everywhere.

Key Methods:
- Optional.of(T value): Returns Optional with non-null value (throws NullPointerException if value is null).
- Optional.ofNullable(T value): Returns Optional with value, or empty Optional if value is null.
- Optional.empty(): Returns an empty Optional instance.
- isPresent() / isEmpty(): Checks if a value is present or not.
- ifPresent(Consumer<? super T> action): Performs action if value is present.
- orElse(T other): Returns value if present, otherwise returns 'other' default value.
- orElseGet(Supplier<? extends T> other): Returns value if present, otherwise invokes supplier and returns result.
- map(Function<? super T, ? extends U> mapper): Transforms value if present.

Syntax:
Optional<Type> opt = Optional.ofNullable(variable);
Type val = opt.orElse(defaultValue);

*/

import java.util.Optional;

class OptionalExample {
    public static void main(String[] args) {
        String name = "Vijay";
        String nullName = null;

        // 1. Creation and checks
        System.out.println("--- Optional Creation & Checks ---");
        Optional<String> optName = Optional.ofNullable(name);
        Optional<String> optNull = Optional.ofNullable(nullName);

        System.out.println("optName isPresent: " + optName.isPresent());
        System.out.println("optNull isPresent: " + optNull.isPresent());

        // 2. Default values (orElse & orElseGet)
        System.out.println("\n--- Handling Defaults ---");
        String finalName1 = optName.orElse("Guest User");
        String finalName2 = optNull.orElse("Guest User");

        System.out.println("finalName1: " + finalName1);
        System.out.println("finalName2: " + finalName2);

        // 3. Functional chaining using map & ifPresent
        System.out.println("\n--- Chaining Operations ---");
        Optional.ofNullable("java programming")
                .map(String::toUpperCase)
                .filter(str -> str.contains("JAVA"))
                .ifPresent(val -> System.out.println("Chained Result: " + val));
    }
}
