// Implementation Of Queue Using Deque

import java.util.* ;
import java.io.*; 

public class DequeDS {
	// Initialize your data structure.
	Deque<Integer> deque = new LinkedList<>();

	// Adding 'X' into the queue. Returns true if it gets Added into the queue, and false otherwise.
	public boolean add(int x) {
		deque.addLast(x);
		return true;
	}

	// remove top element from queue. Returns -1 if the queue is empty, otherwise returns the removed element.
	public int remove() {
		if(deque.isEmpty())  return -1;
		else return deque.removefirst();
	}

	// Returns the topmost element of the queue. In case the queue is empty, it returns -1.
	public int top() {
		if(deque.isEmpty())  return -1;
		else return deque.getFirst();
	}

	// Returns true if the queue is empty, otherwise false.
	public boolean isEmpty() {
	  return deque.isEmpty();	
	}

	// Returns the number of elements currently present in the queue.
	public int size() {
		return deque.size();
	}
}
