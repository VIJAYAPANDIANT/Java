/* 

Collections Framework in Java

Definition:
- The Java Collections Framework provides an architecture to store and manipulate a group of objects.
- It includes interfaces (List, Set, Queue, Map) and implementation classes (ArrayList, HashSet, LinkedList, HashMap, etc.).

Core Interfaces:

1. List (Ordered, permits duplicates):
   - ArrayList: Dynamic array implementation.
   - LinkedList: Doubly-linked list implementation.

2. Set (Unordered, no duplicates permitted):
   - HashSet: Backed by a hash table.
   - TreeSet: Elements stored in a sorted tree structure.

3. Map (Key-Value pairs, keys are unique):
   - HashMap: Unordered key-value storage.
   - TreeMap: Key-value storage sorted by keys.

4. Queue (FIFO - First-In-First-Out ordering):
   - LinkedList / PriorityQueue: Used for queue processing.

Syntax:
List<Type> list = new ArrayList<>();
Set<Type> set = new HashSet<>();
Map<KeyType, ValueType> map = new HashMap<>();
Queue<Type> queue = new LinkedList<>();

*/

import java.util.*;

class CollectionsExample {
    public static void main(String[] args) {
        // 1. List Example (ArrayList)
        System.out.println("--- List (ArrayList) ---");
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Duplicates allowed
        System.out.println("List: " + list);
        System.out.println("First element: " + list.get(0));

        // 2. Set Example (HashSet)
        System.out.println("\n--- Set (HashSet) ---");
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate ignored
        System.out.println("Set: " + set);

        // 3. Map Example (HashMap)
        System.out.println("\n--- Map (HashMap) ---");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(1, "Updated One"); // Overwrites key 1
        System.out.println("Map: " + map);
        System.out.println("Value for key 1: " + map.get(1));

        // 4. Queue Example (LinkedList as Queue)
        System.out.println("\n--- Queue (LinkedList) ---");
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        System.out.println("Queue: " + queue);
        System.out.println("Polled element: " + queue.poll()); // Removes and returns head
        System.out.println("Queue after poll: " + queue);
    }
}
