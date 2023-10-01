// Priority Queue Implementation Using JCF
// By Default give priority in ascending order

import java.util.*;
 
public class PriorityQueueDS{
   
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
 
        // Adding items to the pQueue using add()  T.C :- O(logN)
        pq.add(10);
        pq.add(20);
        pq.add(15);
 
        // Printing the top element of PriorityQueue
        System.out.println(pq.peek());
 
        // Printing the top element and removing it  T.C :- O(logN)
        // from the PriorityQueue container
        System.out.println(pq.poll());
 
        // Printing the top element again   T.C :- O(1)
        System.out.println(pq.peek());
    }
}

//Output :- 
        // 10
        // 10
        // 15

//For priority in descending Order 

import java.util.*;
 
public class PriorityQueueDS{
   
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
 
        // Adding items to the pQueue using add()
        pq.add(10);
        pq.add(20);
        pq.add(15);
 
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}

//Output :- 
        // 20
        // 15
        // 10
