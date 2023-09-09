// First Non-repeating Character in a Stream.
// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];  //track the freq of char
        Queue<Character> q = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            q.add(ch); //add char in the queue
            freq[ch - 'a']++;  //increase freq by 1

            /*while queue is not empty and the freq of char at q.peek is > 1 then this char
             is not the first repeating char so we remove the char from the queue*/ 
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }
        }
        //case1(s.isEmpty()):-no char is present in queue return -1
        if(q.isEmpty()){
            return -1; 
        }
        /*case2(freq[q.peek() - 'a'] = 1):- The freq of char at q.peeks is equal to 1 so 
         this is the non-repeating char */
        else{
            return s.indexOf(q.peek());  
        }
        
    }
}
