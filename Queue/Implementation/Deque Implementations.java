// Deque Implementations

// Deque implementation in Java
public class DequeDS {
    static class Deque {
        static final int MAX = 100;
        int arr[];
        int front;
        int rear;
        int size;
        
        public Deque(int size) {
          arr = new int[MAX];
          front = -1;
          rear = 0;
          this.size = size;
        }
    
        //isFull condition
        boolean isFull() {
          return ((front == 0 && rear == size - 1) || front == rear + 1);
        }
        
        //isEmpty condition
        boolean isEmpty() {
          return (front == -1);
        }
        
        // adding element at front 
        
        void insertfront(int key) {
            if (isFull()) {
              System.out.println("Overflow");
              return;
            }
            
            if (front == -1) { //adding 1st element
              front =  rear = 0;
            }
            
            else if (front == 0) //Cyclic nature
              front = size - 1;
            
            else
              front = front - 1; //Normal flow
            
            arr[front] = key;
        }
    
        // adding element at rear
        
        void insertrear(int key) {
            if (isFull()) {
              System.out.println(" Overflow ");
              return;
            }
            
            if (front == -1) { //adding 1st element
              front =  rear = 0;
            }
            
            else if (rear == size - 1) //Cyclic nature
              rear = 0;
            
            else
              rear = rear + 1; //Normal flow
            
            arr[rear] = key;
        }
    
        // removing element from front
        
        void deletefront() {
            if (isEmpty()) {
              System.out.println("Queue Underflow\n");
              return;
            }
            
            if (front == rear) {  //Deque has only one element
              front = rear = -1;
            } 
            else if (front == size - 1)  front = 0;  //cyclic nature
        
            else  front = front + 1; //Normal flow
        }
    
        // removing element from rear
        void deleterear() {
            if (isEmpty()) {
              System.out.println(" Underflow");
              return;
            }
        
            if (front == rear) {  //Deque has only one element
              front = rear = -1;
            } 
            else if (rear == 0)  rear = size - 1;  //cyclic nature
            
            else  rear = rear - 1;  //Normal flow
        }
    
        //peek from front
        
        int getFront() {
            if (isEmpty()) {
              System.out.println(" Underflow");
              return -1;
            }
            return arr[front];
        }
        
        //peek from rear
        
        int getRear() {
            if (isEmpty() || rear < 0) {
              System.out.println(" Underflow\n");
              return -1;
            }
            return arr[rear];
        }
    }   
    
    public static void main(String[] args) {
    
    Deque dq = new Deque(4);
    
    System.out.println("Insert element at rear end : 12 ");
    dq.insertrear(12);
    
    System.out.println("insert element at rear end : 14 ");
    dq.insertrear(14);
    
    System.out.println("get rear element : " + dq.getRear());
    
    dq.deleterear();
    System.out.println("After delete rear element new rear become : " + dq.getRear());
    
    System.out.println("inserting element at front end");
    dq.insertfront(13);
    
    System.out.println("get front element: " + dq.getFront());
    
    dq.deletefront();
    
    System.out.println("After delete front element new front become : " + +dq.getFront());
    
    }
}

// Output :- 
          // Insert element at rear end : 12 
          // insert element at rear end : 14 
          // get rear element : 14
          // After delete rear element new rear become : 12
          // inserting element at front end
          // get front element: 13
          // After delete front element new front become : 12
