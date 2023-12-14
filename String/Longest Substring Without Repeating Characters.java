// Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
         boolean[] count = new boolean[256];
        int first = 0, second = 0, len = 0;

        while (second < s.length()) {
            // Repeating character
            while (count[s.charAt(second)]) {
                count[s.charAt(first)] = false;//ascii value count array me change hogi
                first++;
            }
            count[s.charAt(second)] = true;
            len = Math.max(len, second - first + 1);
            second++;
        }
        return len;
        
    }
}
