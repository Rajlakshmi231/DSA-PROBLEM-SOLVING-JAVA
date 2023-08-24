//  Java Collection framework provides a Stack class that models and implements a Stack data structure.The class is based on the basic principle of last-in-first-out. 
// In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek.


import java.util.*;
public class StackDS{
    public static void main(String args[]){
        // Create a stack
        Stack<Integer> s = new Stack<>();
        // push operation 
        s.push(1); 
        s.push(2);
        s.push(3);
        System.out.println(s);
        
        
        // pop operation
        s.pop();
        System.out.println(s);
        
        // top/peek
        System.out.println(s.peek());
        
        // Empty operation
        if(s.isEmpty()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
            
        }    
    }
}

    // output:-
    // [1, 2, 3]
    // [1, 2]
    // 2
    // False

  
