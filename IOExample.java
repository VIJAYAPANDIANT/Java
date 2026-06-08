/* 

I/O & Files in Java

Definition:
- Java I/O (Input and Output) is used to process inputs and produce outputs, such as reading from or writing to files.

Key Frameworks:

1. Stream Classes (Byte Streams):
   - Operate on 8-bit bytes.
   - e.g., FileInputStream, FileOutputStream.

2. Reader / Writer Classes (Character Streams):
   - Operate on 16-bit characters (useful for text files).
   - e.g., FileReader, FileWriter, BufferedReader, BufferedWriter.

3. Java NIO (New Input/Output - Java 1.4+):
   - Introduces buffers, channels, and non-blocking I/O.
   - Files class (Java 7+ NIO.2) provides static utility methods to read/write paths easily.

Syntax:
// Character stream writer
try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) { ... }
// NIO.2 Paths
Path path = Paths.get("filename.txt");
Files.write(path, lines);

*/

import java.io.*;
import java.nio.file.*;
import java.util.List;

class IOExample {
    public static void main(String[] args) {
        String filename = "io_demo.txt";

        // 1. Writing to a file using FileWriter & BufferedWriter (Character Stream)
        System.out.println("--- Writing with Character Stream ---");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Hello from Character Stream!\n");
            writer.write("Writing Java files standard process.");
        } catch (IOException e) {
            System.out.println("Writing error: " + e.getMessage());
        }

        // 2. Reading from a file using FileReader & BufferedReader
        System.out.println("\n--- Reading with Character Stream ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Reading error: " + e.getMessage());
        }

        // 3. Using Java NIO (Files class) to write and read
        System.out.println("\n--- Using Java NIO (Files class) ---");
        Path nioPath = Paths.get("nio_demo.txt");
        try {
            // Write lines using NIO
            List<String> linesToWrite = List.of("Line 1: NIO writes", "Line 2: Modern Java File APIs");
            Files.write(nioPath, linesToWrite);

            // Read lines using NIO
            List<String> linesRead = Files.readAllLines(nioPath);
            for (String line : linesRead) {
                System.out.println(line);
            }

            // Cleanup generated files
            Files.deleteIfExists(Paths.get(filename));
            Files.deleteIfExists(nioPath);
            System.out.println("\nDemo files successfully cleaned up.");
        } catch (IOException e) {
            System.out.println("NIO Error: " + e.getMessage());
        }
    }
}
