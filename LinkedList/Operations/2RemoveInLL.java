// Remove IN LL
// 1. Remove First [T.C :- O(1)]
// 2. Remove Last [T.C :- O(1)]
// 3. Remove at any index [T.C :- O(N)]

import java.util.*;
public class LinkedList{
  public static class Node{
    int data;
    Node next;
  
    public Node(int data){
      this.data = data;
      this.next = null;
    }
}

public static Node head;
public static Node tail;
public static int size;  //size of LL    

// 1. Remove First Method 
// step-> head = head.next
public int removeFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return Integer.MIN_VALUE;
      } 
      else if (size == 1) {
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
      } 
      else {
        int val = head.data;
        head = head.next;
        size--;
        return val;
      }
 }

//2. Remove Last Method  
 public int removeLast() {
      if (size == 0) {
        System.out.println("List is empty");
        return Integer.MIN_VALUE;
      } 
      else if (size == 1) {
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
      }
      else {
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
          prev = prev.next;
        }
        int val = head.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
      }
} 
public void addFirst(int data){  
  Node newNode = new Node(data);
  size++;  
  if(head == null){
    head = tail = newNode;
    return;
  }
  newNode.next = head;
  head = newNode;
}  

public void print(){
    if(head == null){
        System.out.println("LL is empty");
        return;
        
    }
    Node temp = head;
    while(temp!= null){
        System.out.print(temp.data + "-> ");
        temp = temp.next;
    }
    System.out.println("null");
}   

public static void main (String args[]){
LinkedList ll = new LinkedList();  
  ll.addFirst(1);
  ll.addFirst(2);
  ll.addFirst(3);
  ll.addFirst(4);
  ll.addFirst(5);
  
  ll.removeFirst();
  ll.print();
  ll.removeLast(); 
  ll.print();
}
}

// OUTPUT:-
// 4-> 3-> 2-> 1-> null
// 4-> 3-> 2-> null



