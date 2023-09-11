// Implement stack using array

import java.util.*;
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

        // diaplay
        void display(){
        for(int i =0; i<= top; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        }
    }
        
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        
        s.pop();
        s.display();
        
        System.out.println(s.peek());   
    }
}

// Output:- 
        // 1 2 3 
        // 1 2 
        // 2
