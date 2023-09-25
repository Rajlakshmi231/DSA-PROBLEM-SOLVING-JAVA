// Deque Implementation Using  Java  Collection framework

// The Deque interface is part of the Java Collections Framework . Deque interface present in java.util package is a subtype of the queue interface. 
// The double-ended queue supports the addition or removal of elements from either end of the data structure. 
// It can either be used as a queue(first-in-first-out/FIFO) or as a stack(last-in-first-out/LIFO).  Deque is the acronym for double-ended queue.

import java.util.ArrayDeque;
import java.util.Deque;
 
public class Example {
  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.addFirst(1);
    deque.addFirst(2);
    deque.addLast(3);
    deque.addLast(4);
    
    System.out.println(deque);
    deque.removeLast();
    System.out.println(deque);
    
    System.out.println("First: " + deque.getFirst() + ", Last: " + deque.getLast());
  }
}

//Output :-
            [2, 1, 3, 4]
            [2, 1, 3]
            First: 2, Last: 3
