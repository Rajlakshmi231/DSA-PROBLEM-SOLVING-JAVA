// Postfix To Infix Conversion

import java.util.*;

public class PostToInfix{

    public static void main(String[] args){
        String S = "953+4*6/-";
        Stack<String> val = new Stack<>(); //in conversion we make our stack of string so that we can append the value not evaluate the value
      
        // traverse from left to right in postfix
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            
            if(Character.isDigit(ch)){
                val.push(ch + "");  //push as string 
            }
            else{
                String v2 = val.pop(); 
                String v1 = val.pop(); 
                char op = ch;
                //infix :- v1 + op + v2 
                String t =  "(" + v1 + op + v2 + ")";
                val.push(t);
            }   
        }
        System.out.println(val.peek());
    }
} 

//Output :- (9-(((5+3)*4)/6))
