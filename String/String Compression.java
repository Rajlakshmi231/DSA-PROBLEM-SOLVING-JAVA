// String Compression Type 1

import java.util.*;
public class Classroom{
    
    public static String compression1(String s){
        String result = s.charAt(0) + ""; //s.substring(0,1); //or we can also string from charAt eg:- s.charAt(0) + "";
        
        for(int i =1; i<s.length(); i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if( curr != prev){
                result += curr;
            }
        }
        return result;
    }
    
    public static void main (String args[]){
        String s = "aaabbcccddaeef";
        System.out.println(compression1(s));
        
    }
}
// Output :- abcdaef

----------------------------------------------------------------------------------------------------------------------------------------------------------------

// String Compression Type 1
// T.C :- O(n)
// S.C :- O(1)

class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;
        int i = 0;

        while(i < n){
            char currChar = chars[i];
            int count = 0;

            //find count of duplicates
            while(i < n && chars[i] == currChar){
                count++;
                i++;
            }
            
            //Now do the assign work
            chars[index] = currChar;
            index++;

            if(count > 1){
                for(char ch : Integer.toString(count).toCharArray()){
                    chars[index] = ch;
                    index++;
                }
            }
        }
        return index;
        
    }
}
