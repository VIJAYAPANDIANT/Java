/* 

Concurrency in Java

Definitions:

1. Thread:
   - A thread is a thread of execution in a program. The JVM allows an application to have multiple threads of execution running concurrently.
   - Can be created by extending Thread class or implementing Runnable interface.

2. Synchronization (synchronized):
   - Used to control the access of multiple threads to any shared resource to prevent race conditions.

3. Executor Service (Thread Pools):
   - Decouples task execution from thread management.
   - Manages a pool of threads and handles task scheduling.

4. CompletableFuture (Java 8+):
   - Used for asynchronous programming. It implements Future and CompletionStage, allowing task chaining, combining results, and non-blocking asynchronous workflows.

Syntax:
// Thread
Thread t = new Thread(() -> { // task });
// ExecutorService
ExecutorService executor = Executors.newFixedThreadPool(threads);
// CompletableFuture
CompletableFuture.supplyAsync(() -> val).thenAccept(v -> {});

*/

import java.util.concurrent.*;

// Shared resource for Synchronization Demo
class Counter {
    private int count = 0;

    // synchronized keyword prevents concurrent modification anomalies
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class ConcurrencyExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // --- 1. Basic Threads & Synchronization ---
        System.out.println("--- Threads & Synchronization ---");
        Counter counter = new Counter();

        // Creating thread using Runnable lambda
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join(); // Wait for t1 to finish
        t2.join(); // Wait for t2 to finish

        System.out.println("Final count: " + counter.getCount() + " (Expected: 2000)");

        // --- 2. ExecutorService & Future ---
        System.out.println("\n--- ExecutorService & Future ---");
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> callableTask = () -> {
            Thread.sleep(500);
            return "Task completed by executor pool thread";
        };

        Future<String> future = executor.submit(callableTask);
        System.out.println("Doing other work...");
        
        // Blocking call to retrieve result
        String result = future.get(); 
        System.out.println("Future Result: " + result);

        // Always shutdown executor services
        executor.shutdown();

        // --- 3. CompletableFuture ---
        System.out.println("\n--- CompletableFuture ---");
        CompletableFuture<Void> cf = CompletableFuture.supplyAsync(() -> "Hello")
                .thenApplyAsync(s -> s + " CompletableFuture")
                .thenAcceptAsync(finalStr -> System.out.println("Asynchronous execution output: " + finalStr));

        // Wait for async task to complete in main thread demo
        cf.join(); 
    }
}
