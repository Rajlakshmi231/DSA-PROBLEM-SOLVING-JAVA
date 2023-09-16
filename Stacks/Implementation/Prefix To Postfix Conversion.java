// Prefix To Postfix Conversion

import java.util.*;

public class PreToPost{

    public static void main(String[] args){
        String S = "-9/*+5346";
        Stack<String> val = new Stack<>(); //in conversion we make our stack of string so that we can append the value not evaluate the value
      
        // traverse from right to left in prefix
        for(int i = S.length() -1; i >= 0; i--){
            char ch = S.charAt(i);
            
            if(Character.isDigit(ch)){
                val.push(ch + "");  //push as string 
            }
            else{
                String v1 = val.pop(); //1st pop is v1 as we are traversing from right to left
                String v2 = val.pop(); //2nd pop is v2 as we are traversing from right to left
                char op = ch;
                //PostFix :- v1 + v2 + op
                String t = v1 + v2 + op;
                val.push(t);
            }   
        }
        System.out.println(val.peek());
    }
}

//Output :- 953+4*6/-
