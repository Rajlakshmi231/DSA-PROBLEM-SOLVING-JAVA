// What is Linked List
// A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. The elements in a 
// linked list are linked using pointers.In simple words, a linked list consists of nodes where each node contains a data field and a 
// reference(link) to the next node in the list.

// ADD IN LL
// 1. Add First [T.C :- O(1)]
// 2. Add Last [T.C :- O(1)]
// 3. Add at any index [T.C :- O(N)]

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

// 1. Add First Method 
// Create new node
// New node's next = head
// head = new Node  
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

  
// 2. Add Last Method 
// Create new node
// tails's next = new node 
// tail = new Node 
public void addLast(int data){  //Time complexity :- O(1)
  // step1 => Create new node
  Node newNode = new Node(data);
  size++;
  
  // If LL is empty
  if(head == null){
    head = tail = newNode;
    return;
  }
  // if LL is not empty
  // Step2 => tails's next = new node
  tail.next = newNode;
  
  // step3 =>  tail = new Node
  tail = newNode;
}  


  
// 3. Add at any index/middle of a LL Method  //T.C :-O(n)
// add(index, data)
public void add(int idx, int data){  //Time complexity :- O(N)
  if(idx == 0){ //add at first idx
  addFirst(data);
  return;
  }
  // step1 => Create new node
  Node newNode = new Node(data);
  size++;
  Node temp = head;
  int i =0;
  while(i < idx-1){
  temp = temp.next;
  i++;
  }
  // i= idx-1 , temp -> prev
  // step2
  newNode.next = temp.next;
  // step3
  temp.next = newNode;
}  


  
// 4. Printing the LL      // Time complexity :- O(N) 
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
  ll.print();
  ll.addFirst(2);
  ll.print();
  ll.addFirst(1);
  ll.print();
  ll.addLast(4);
  ll.print();
  ll.addLast(5);
  ll.print();
  ll.add(2,3);
  ll.print();
  System.out.println(ll.size); 
}
}

// Output :-
// LL is empty
// 2-> null
// 1-> 2-> null
// 1-> 2-> 4-> null
// 1-> 2-> 4-> 5-> null
// 1-> 2-> 3-> 4-> 5-> null
// 5
