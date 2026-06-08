/* 
Datatype in Java

Definition:
- Datatype specifies the size and type of values that can be stored in an identifier/variable.

Types of Datatype:
1. Primitive Datatypes (byte, short, int, long, float, double, char, boolean)
2. Non-Primitive Datatypes (String, Array, Class, Object, Interface, Enum, Wrapper classes)
*/  

class Datatype {
    public static void main(String[] args) {
        System.out.println("--- Primitive Data Types ---");
        
        byte aByte = 100;
        short aShort = 5000;
        int anInt = 100000;
        long aLong = 15000000000L;
        float aFloat = 5.75f;
        double aDouble = 19.99;
        char aChar = 'A';
        boolean aBoolean = true;

        System.out.println("byte: " + aByte);
        System.out.println("short: " + aShort);
        System.out.println("int: " + anInt);
        System.out.println("long: " + aLong);
        System.out.println("float: " + aFloat);
        System.out.println("double: " + aDouble);
        System.out.println("char: " + aChar);
        System.out.println("boolean: " + aBoolean);

        System.out.println("\n--- Non-Primitive Data Types ---");
        
        String aString = "Hello Java";
        int[] anArray = {1, 2, 3};
        Integer wrapperInt = 100; // Wrapper Class

        System.out.println("String: " + aString);
        System.out.print("Array: ");
        for (int val : anArray) {
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("Wrapper Integer: " + wrapperInt);
    }
}