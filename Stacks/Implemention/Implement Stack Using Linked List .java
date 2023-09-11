 // Implement Stack Using Linked List

 import java .util.*;
 public class StackDS{
    static class Node{
        int val;
        Node next;
        Node(int val){
             this.val = val;
             this.next = null;
        }
    }
    static class Stack{
        static Node head = null;
         
        public static boolean isEmpty(){ 
             return head == null;
        }
      
       // push operation
        public static void push(int val) {
            Node newNode  = new Node(val);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

      // pop operation
        public static int  pop() {
            if(isEmpty()){
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;
        }

      // peek operation
        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            return head.val;
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

// Output
// 3
// 2
// 1
