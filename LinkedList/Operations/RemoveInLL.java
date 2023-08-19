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
public void addFirst(int data){  //Time complexity :- O(1)
  // step1 => Create new node
  Node newNode = new Node(data);
  size++;  //after creating a new node increament the size
  
  // If LL is empty
  if(head == null){
    head = tail = newNode;
    return;
  }
  // if LL is not empty
  // Step2 => New node's next = head
  newNode.next = head;
  
  // step3 => head = new Node
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



