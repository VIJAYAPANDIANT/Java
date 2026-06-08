/* 

Virtual Threads & Project Loom (Java 21+)

Definitions:

1. Platform Threads (Traditional OS Threads):
   - Mapped 1:1 to operating system threads.
   - Resource-intensive (typically 1MB stack memory per thread). Limits scaling capacity to a few thousand threads.

2. Virtual Threads (Project Loom):
   - Lightweight threads that are managed by the JVM, not the OS.
   - Cheap to create (hundreds of bytes to a few kilobytes). Millions of virtual threads can run concurrently.
   - When a virtual thread performs a blocking I/O operation, the JVM yields execution of the underlying carrier OS thread, allowing other virtual threads to execute on it.

3. Structured Concurrency:
   - Simplifies multithreaded programming by treating groups of related tasks running in different threads as a single unit of work.
   - Ensures error handling, cancellation, and thread cleanup are synchronized.

----------------------------------------------------------------------
API Usage in Java 21+ (How to run):

// 1. Spawning a single virtual thread
Thread vt = Thread.startVirtualThread(() -> {
    System.out.println("Running inside a Virtual Thread");
});
vt.join();

// 2. Creating a Virtual Thread Executor Pool
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
    executor.submit(() -> {
        Thread.sleep(100);
        System.out.println("Task executed by Virtual Thread");
    });
}
----------------------------------------------------------------------

Syntax:
Thread vt = Thread.startVirtualThread(() -> { // task });
var executor = Executors.newVirtualThreadPerTaskExecutor();

*/

class VirtualThreadsLoom {
    public static void main(String[] args) {
        System.out.println("Project Loom & Virtual Threads Reference:");
        System.out.println("-----------------------------------------");
        System.out.println("1. Virtual Threads are lightweight, JVM-managed threads introduced as standard in Java 21.");
        System.out.println("2. They solve the scale bottleneck of thread-per-request models without needing reactive programming.");
        System.out.println("3. Note: Running/compiling Virtual Thread APIs requires JDK 21 or higher (Current JDK: " + System.getProperty("java.version") + ").");
    }
}
