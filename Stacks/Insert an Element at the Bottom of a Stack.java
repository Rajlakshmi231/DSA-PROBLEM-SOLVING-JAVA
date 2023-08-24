// You are given a stack St of N integers and an element X. You have to insert X at the bottom of the given stack.
// Time Complexity:- O(N)
// Space Complexity:- O(1) 

class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> St, int X) {
        if(St.isEmpty()){
            St.push(X);
            return St ;
        }
        int top = St.pop();     //pop & store the top
        insertAtBottom(St, X); //call for next level
        St.push(top);  //push the top (which we have poped & stored in top variable)
        
        return St;
    }
}
