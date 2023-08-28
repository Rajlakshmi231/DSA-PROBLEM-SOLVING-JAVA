// Implement Queue using Stacks

import java.util.*;
public class QueueDs {
    
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        
        
        //add elements O(N)
        public static void add(int x) {
            while(!s1.isEmpty()){ //if s1 is not empty then push all elements of s1 into s2.
                s2.push(s1.pop());
            }
            s1.push(x); // push(add new element) in s1
            
            while(!s2.isEmpty()){
                s1.push(s2.pop()); // push back all the elements of s2 into s1;
            }
        }
        
        
        //remove element O(1)
        public static int remove() {
            if(s1.isEmpty()){
                return -1; 
            }
            return s1.pop();
            
        }
        
        
        //peek elements  O(1)
        public static int peek() {
            if(s1.isEmpty()){
                return -1; 
            }
            return s1.peek();
        }
    }
       public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

// Output:-
        // 1
        // 2
        // 3
