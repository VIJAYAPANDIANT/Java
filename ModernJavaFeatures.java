/* 

Modern Java Features (Java 14 - 17+)

Definitions:

1. Records (Java 16+):
   - Special immutable classes designed to act as transparent carriers for immutable data.
   - Automatically generates fields, constructor, getters (without get prefix, e.g., name()), equals(), hashCode(), and toString().

2. Sealed Classes/Interfaces (Java 17+):
   - Restrict which other classes or interfaces may extend or implement them.
   - Declared with 'sealed' keyword and must specify allowed subclasses using 'permits'.
   - Subclasses must be final, sealed, or non-sealed.

3. Switch Expressions (Java 14+):
   - Switch can be used as an expression (returns a value) using arrow syntax (->) and yields values.
   - Eliminates need for 'break' statements.

4. Pattern Matching for instanceof (Java 16+):
   - Performs a type check and casts the object to a target type in a single step.

Syntax:
// Record
record RecordName(dataType field1, dataType field2) {}
// Sealed Class
sealed interface InterfaceName permits Class1, Class2 {}
// Instanceof Pattern Matching
if (obj instanceof String str) { ... }
// Switch Expression
type result = switch(val) { case v -> resultVal; default -> defaultVal; };

*/

// 1. Sealed Interface with Permitted Implementations
sealed interface Shape permits Circle, Rectangle {}

// Permitted classes must explicitly be final, sealed, or non-sealed
final class Circle implements Shape {
    private final double radius;
    Circle(double radius) { this.radius = radius; }
    double radius() { return radius; }
}

final class Rectangle implements Shape {
    private final double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double length() { return length; }
    double width() { return width; }
}

// 2. Record definition (Immutable Data Class)
record Person(String name, int age) {}

class ModernJavaFeatures {
    public static void main(String[] args) {
        // --- 1. Records ---
        System.out.println("--- Java Records ---");
        Person person = new Person("Vijay", 25);
        System.out.println("Person Name: " + person.name()); // auto-generated getter
        System.out.println("Person Age: " + person.age());
        System.out.println("Record toString(): " + person);

        // --- 2. Pattern Matching for instanceof ---
        System.out.println("\n--- Pattern Matching for instanceof ---");
        Object obj = "Hello Java 17";
        if (obj instanceof String str) {
            // No need for explicit cast: String str = (String) obj;
            System.out.println("String length: " + str.length());
        }

        // --- 3. Sealed Classes & Calculations ---
        System.out.println("\n--- Sealed Class Checking ---");
        Shape shape = new Circle(5.0);

        double area = 0.0;
        if (shape instanceof Circle c) {
            area = Math.PI * c.radius() * c.radius();
        } else if (shape instanceof Rectangle r) {
            area = r.length() * r.width();
        }
        System.out.println("Calculated Area: " + area);

        // --- 4. Switch Expressions ---
        System.out.println("\n--- Switch Expressions ---");
        int day = 3;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Other Day";
        };
        System.out.println("Day 3 is: " + dayName);
    }
}
