// Implement Queue using array

	public class QueueDs {
    
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        
        public static boolean isEmpty(){
            return rear == -1;
        }
        
        // Add  T.c = O(1)
        public static void add(int data){
            if(rear == size-1){  //check if queue is full
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        
        // Remove  T.C = O(N)
        public static int remove(){
            if(isEmpty()){  //check if queue is empty
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        
        // peek  T.C = O(1) 
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0]; 
        }
        
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
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
