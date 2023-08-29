// First Unique Character in a String
// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Time complexity:O(N)
// Space complexity:O(1)

class Solution {
    public int firstUniqChar(String s) {
      // To keep track of the count of each character, we initialize an int[] freq with size 26...
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

         // Traverse string to keep the track of number of times each character in the string appears...
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            q.add(ch); //Add in queue 
            freq[ch - 'a']++; //increase freq of that char ch

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){ //if the freq of the char in the peek of the is > 1 remove it 
                q.remove();
            }
        }
        if(q.isEmpty()){
            return -1; //No unique character
        }
        else{
            return s.indexOf(q.peek()); //character that appears exactly one time, return it’s index... 
        }
        
    }
}
