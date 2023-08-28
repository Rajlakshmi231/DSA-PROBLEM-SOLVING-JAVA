// Implementing Queue Using Java Collection Framework
// The Queue interface is present in java.util package and extends the Collection interface is used to hold the 
// elements about to be processed in FIFO(First In First Out) order.
// Since Queue is an interface, objects cannot be created of the type queue. We always need a class which extends this list in order to create an object.
// The most common classes are the ArrayDeque and LinkedList in Java.

import java.util.LinkedList;
import java.util.Queue;

public class QueueDs{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        // add elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
 
        // print the queue
        System.out.println("Queue: " + q);
 
        // remove the element at the front of the queue
        int front = q.remove();
        System.out.println("Removed element: " + front);
 
        // print the updated queue
        System.out.println("Queue after removal: " + q);
 
        // peek at the element at the front of the queue
        int peeked = q.peek();
        System.out.println("Peeked element: " + peeked);
 
        // print the updated queue
        System.out.println("Queue after peek: " + q);
    }
}
// Output:-
        // Queue: [1, 2, 3]
        // Removed element: 1
        // Queue after removal: [2, 3]
        // Peeked element: 2
        // Queue after peek: [2, 3]
