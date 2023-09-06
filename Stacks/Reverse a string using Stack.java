// Reverse a string using Stack

// T.C:-O(N)  S.C:-O(N)

class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> st = new Stack<>();
        int idx =0;
        while(idx < S.length()){
            st.push(S.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder("");
        while(!st.isEmpty()){
            char curr = st.pop();
            res.append(curr);
        }
        return res.toString();
    }

}
