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


// Approach 2    T.C :- O(1)   S.C :-O(1) 

class MinStack {
    Stack<Long> st = new Stack<>();
    long min = -1;

    public MinStack() {    
    }
    
    public void push(int val) {
        long x = (long)val;
        if(st.isEmpty()){
            st.push(x);
            min = x;
        }
        else if(x >= min){
            st.push(x);
        }
        else if(x<min){
            st.push(2*x - min); //we will push some fake value 
            min = x;
        }   
    }
    
    public void pop() {
        if(st.size() == 0) return;
        else if(st.peek()>= min) st.pop();
        else if(st.peek() < min){ //peek pr fake value padi h
            //restore the old min
            long oldMin = min;
            min = 2*min - st.peek();
            st.pop();
        }
    }
    
    public int top() {
        if(st.size() == 0) return -1;
        long q = st.peek();
        if(q>= min) return (int)q;
        if(q< min) return (int)min;
        return 0;
    }
    
    public int getMin() {
        if(st.size() == 0) return -1;
        return (int)min;
        
    }
}
