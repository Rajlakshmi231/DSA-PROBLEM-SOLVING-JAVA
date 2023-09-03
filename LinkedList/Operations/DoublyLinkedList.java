// Doubly Linked List
// What is Doubly Linked List?
// A doubly linked list (DLL) is a special type of linked list in which each node contains a pointer to the previous node 
// as well as the next node of the linked list.

//  A node can be inserted in a Doubly Linked List in four ways:
  //1. At the front of the DLL. (Time Complexity: O(1))
  //2. In between two nodes (Time Complexity: O(1))
    //i. After a given node.
    //ii. Before a given node.
  //3. At the end of the DLL.

public class DoubleLL{
    public class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    // AddFirst
    // step1:- Create new Node
    // step2:- newNode.next = head;
    // step3:- head.prev = newNode;
    // step4:- head = newNode;
 
    public void addFirst(int data){      
        Node newNode = new Node(data);
        size++;
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
  
  // 2. Insert in between two nodes
   public  void insertAtIdx(int idx, int data){
        Node newNode = new Node(data);
        size++;
     
        Node temp = head;
        int i =0;
        while(i != idx-1){ 
            temp = temp.next;
            i++;
        }
        temp.next.prev = newNode; //step1
        newNode.prev = temp;  //step2
        newNode.next = temp.next;  //step3
        temp.next = newNode;  //step4
       
    }

    // print function
    public void print(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
         System.out.println("null");
    }

  
    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        
        dll.print();
      
        dll.insertAtIdx(2,4);
        dll.print();
      
        System.out.println("size = " + dll.size);   
    }
}

// Output:-
// 1<->2<->4<->null
// 1<->2<->3<->4<->null
// size = 4
  

