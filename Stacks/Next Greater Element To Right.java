// Next Greater Element To Right

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] nge = new long[arr.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i = arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] = -1;
            }
            else{
                nge[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return nge;
        
    } 
}
