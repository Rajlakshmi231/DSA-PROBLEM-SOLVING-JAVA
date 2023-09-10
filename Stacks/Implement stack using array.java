// Implement stack using array

public class StackDs{
    public static class Stack{
      int top = -1;
  	  int arr[] = new int[1000];
  	
  	//Function to push an integer into the stack.
      void push(int a){
  	    if(top == arr.length - 1){
  	        return;
  	    }
  	    top++;
  	    arr[top] = a;
  	  } 

      //peek
      int peek(){
        if(top == -1){
          System.out.println("Stack is empty");
          return -1;
        }
        return arr[top];
        
      }
  	
      //Function to remove an item from top of the stack.
    	 int pop(){
    	    if(top == -1){
            System.out.println("Stack is empty");
    	      return -1;
    	    }
    	    int ans = arr[top];
    	    top--;
    	    return ans;
  	   }

      // 
      void display(){
        for(int i =0; i<= top; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
      }


  
    }
}


  
