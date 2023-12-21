 // Valid Anagram
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

//APPROACH 1 :-
// T.C :- O(nlogn) since sorting function requires nlogn iterations.
// S.C :- O(1)

import java.util.*;
public class Main{
 
public static String SortString(String str){
    char c[] = str.toCharArray();
    Arrays.sort(c);
    return new String(c);
  }
public static boolean checkAnagrams(String str1, String str2){
    // Case 1: when both of the strings have different lengths
    if (str1.length() != str2.length())
      return false;
 
    str1 = SortString(str1);
    str2 = SortString(str2);
 
    // Case 2: check if every character of str1 and str2 matches with each other
    for (int i = 0; i < str1.length(); i++){
      if (str1.charAt(i) != str2.charAt(i))
        return false;
    }
    return true;
 }
public static void main(String args[]){
    String Str1 = "INTEGER";
    String Str2 = "TEGERNI";
    System.out.println(checkAnagrams(Str1, Str2));
  }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//APPROACH 2 (Using HashMap) :-
// T.C :- O(N) 
// S.C :- O(N)
 
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i =0; i<t.length(); i++){
            char ch = t.charAt(i);
         
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch); //if freq is 1 direct remove it
                
                else{
                    map.put(ch, map.get(ch) - 1); //if freq is > 1 decrese the freq by 1
                }
            }
            else{
                return false; 
            }
        }
        return map.isEmpty(); //if map is empty at last then its valid if not then not valid  
    }
} 
