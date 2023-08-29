// Queue Reversal
// Given a Queue Q containing N elements. The task is to reverse the Queue and returns the reversed queue.

// Approach 1:-
// Steps:-
// Pop the elements from the queue and insert into the stack now topmost element of the stack is the last element of the queue.
// Pop the elements of the stack to insert back into the queue the last element is the first one to be inserted into the queue.

// T.C: O(N), As we need to insert all the elements in the stack and later to the queue.
// S.C: O(N), Use of stack to store values. 

class Solution{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        
        while(!q.isEmpty()){
           s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        return q;
    }
}


// Approach 2 Using Recursion :-
