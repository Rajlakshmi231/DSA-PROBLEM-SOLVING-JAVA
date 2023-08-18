// STEPS TO ADD FIRST IN LL 
// Create new node
// New node's next = head
// head = new Node

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

 //Add First Method 
public void addFirst(int data){  //Time complexity :- O(1)
  // step1 => Create new node
  Node newNode = new Node(data);

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

 //Printing an array 
public void print(){
    if(head == null){
        System.out.println("LL is empty");
        return;
        
    }
    Node temp = head;
    while(temp!= null){
        System.out.print(temp.data + "-> ");
        temp= temp.next;
    }
    System.out.println("null");
}  
  
public static void main (String args[]){
  LinkedList ll = new LinkedList();
  ll.addFirst(1);
  ll.print();
  ll.addFirst(2);
  ll.print();
  ll.addFirst(3);
  ll.print();
  ll.addFirst(4);
  ll.print();
}
}

// output
// 1-> null
// 2-> 1-> null
// 3-> 2-> 1-> null
// 4-> 3-> 2-> 1-> null
