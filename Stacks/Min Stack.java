// Min Stack
// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// Approach 1    T.C :- O(1)   S.C :-O(N)
class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {   
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(min.peek() < val) min.push(min.peek());
            else  min.push(val);
        }
    }
  
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();  
    }
}


// Approach 2   .C :- O(1)   S.C :-O(1) 
