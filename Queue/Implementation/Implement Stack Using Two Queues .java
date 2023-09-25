// Implement Stack Using Two Queues 

// Approach 1  :- Push in O(1) And pop and Push in O(N) T.C

import java.util.*;
public class QueueDs {
    
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        
        
        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        
        
        //add elements     T.C :- O(1)
        public static void push(int data) {
            if(!q1.isEmpty()){ 
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }
        
        
        //remove element     T.C :- O(N)
        public static int pop() {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1; 
            }
            int top = -1;
            // case1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            // case2
            else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        
        //peek elements     T.C :- O(N)
        public static int peek() {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1; 
            }
            int top = -1;
            // case1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }
            // case2
            else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

// Approach 2  :- Push in O(N) And pop and Push in O(1) T.C
import java.util.*;
public class QueueDs {
    class Queues{
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        
        //Function to push an element into stack using two queues. 
        void push(int a) {
            q2.add(a);
    
            while(!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }
    
            while(!q2.isEmpty()){
                q1.add(q2.peek());
                q2.remove();
            }  
        }
        
        //Function to pop an element from stack using two queues. 
        int pop(){
            int ans;
            if(q1.isEmpty()){
                ans= -1;
            }
            else{
                ans = q1.peek();
                q1.remove();
            }
            return ans;
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

//OUTPUT :- 
        // 3
        // 2   
        // 1
