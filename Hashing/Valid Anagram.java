// Valid Anagram

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Example 1:  Input: s = "anagram", t = "nagaram"    Output: true
// Example 2:  Input: s = "rat", t = "car"    Output: false

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
                    map.remove(ch); //if freq is 1 diresctlt remove it
                }
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
