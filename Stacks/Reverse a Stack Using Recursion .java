// Reverse a Stack Using Recursion
// Write a program to reverse a stack using recursion, without using any loop.

// Follow the steps mentioned below to implement the idea:
// Create a stack and push all the elements in it.
// Call reverse(), which will pop all the elements from the stack and pass the popped element to function pushAtBottom()
// Whenever pushAtBottom() is called it will insert the passed element at the bottom of the stack.


class Solution
{ 
    static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
        
    }

    
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }
}
