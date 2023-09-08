// Stock span problem

class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        Stack<Integer> st = new Stack();
        int span[] = new int[n];
        st.push(0);
        span[0] = 1; //day 1 span is 1
        
        for(int i =1; i<n; i++){
            int currPrice = price[i];
            while(!st.isEmpty() && currPrice >= price[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){ 
                span[i] = i+1;
            }
            else{
                int prevHigh = st.peek();
                span[i] = i - prevHigh;
            }
            st.push(i);
        }
        return span;
    }
    
}
