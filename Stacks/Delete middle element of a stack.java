// Delete middle element of a stack

class Solution
{
    void solve(Stack<Integer>s,int sizeOfStack, int count){
    if(count == (sizeOfStack/2) ){
        s.pop();
        return;
    }
    int num = s.peek();
    s.pop();
   
     solve(s, sizeOfStack,count+1);
     s.push(num);
    }
    
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        int count =0;
        solve(s, sizeOfStack, count);
    }
}
