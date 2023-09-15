// Evaluation of Prefix Expression

import java.util.*;

public class Solution{

    public static void main(String[] args){
        String S = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        // traverse from right to left
        for(int i = S.length() -1; i >= 0; i--){
            char ch = S.charAt(i);
            
            if(Character.isDigit(ch)){
                val.push(ch-'0');
            }
            else{
                int v1 = val.pop(); //1st pop is v1 as we are traversing from right to left
                int v2 = val.pop(); //2nd pop is v2 as we are traversing from right to left
                if(ch == '+') val.push(v1+v2);
                if(ch == '-') val.push(v1-v2);
                if(ch == '*') val.push(v1*v2);
                if(ch == '/') val.push(v1/v2);
            }   
        }
        System.out.println(val.peek());
    }
}
// Output :- 4
