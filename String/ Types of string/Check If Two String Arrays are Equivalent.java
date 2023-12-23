 // Check If Two String Arrays are Equivalent
// Approach1 :- \
// T.C :- O(N)      S.C :- O(N)  

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Using String.join to concatenate strings in word1 and word2
        String s1 = String.join("", word1);
        String s2 = String.join("", word2);
        
        return s1.equals(s2);
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Approach2 :-
// T.C :- O(N∗K)      S.C :- O(1)  

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int m = word1.length;
        int n = word2.length;

        // Pointers to mark the current word in the given two lists.
        int w1i = 0, w2i = 0;
      
        // Pointers to mark the character in the string pointed by the above pointers.
        int i = 0 , j = 0;

        while (w1i < m && w2i < n) {
            // If the characters at the two string are same, increment the string pointers, Otherwise return false.
            if (word1[w1i].charAt(i) != word2[w2i].charAt(j))
                return false;
            i++;
            j++;

            // If the string pointer reaches the end of string in the list word1, 
            // Move to the next string in the list and, reset the string pointer to 0.
          
            if (i == word1[w1i].length()) {
                i = 0;
                w1i++;
            }

            // If the string pointer reaches the end of string in the list word2, 
            // Move to the next string in the list and, reset the string pointer to 0.
           
            if (j == word2[w2i].length()) {
                j = 0;
                w2i++;
            }
        }

        // Strings in both the lists should be traversed.
        return w1i == m && w2i == n;  
    }
}  
