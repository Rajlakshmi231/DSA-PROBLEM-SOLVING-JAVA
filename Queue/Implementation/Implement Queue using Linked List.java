// Implement Queue using Linked List


public class QueueDs {
    
    static class Node{
        int data ;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class Queue{
        
        static Node head = null;
        static Node tail = null;
        
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        // public static boolean isFull(){ no need of isFull because ll is of variable size
        //     return (rear + 1)%size == front;
        // }
        
        // Add  T.c = O(1)
        public static void add(int data){
            Node newNode = new Node(data);
            // Adding first element
            if(head == null){
                head = tail = newNode;
                return;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        
        
        // remove  T.C = O(1)
        public static int remove(){
            if(isEmpty()){  //check if queue is empty
                System.out.println("Queue is empty");
                return -1;
            }
            int frontVal = head.data;
            // single element is present
            if(tail == head){
                head = tail = null;
            }
            else{
                head = head.next;
            }
            return frontVal;
        }

        
        // peek  T.C = O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data; 
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

// output:-   
                // 1
                // 2
                // 3
                // 4
                // 5
