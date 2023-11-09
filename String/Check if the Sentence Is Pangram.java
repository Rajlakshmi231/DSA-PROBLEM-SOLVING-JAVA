// Check if the Sentence Is Pangram
// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean alphabets[] = new boolean [26];

        for(int i =0; i<sentence.length(); i++){
            alphabets[sentence.charAt(i) - 'a'] = true ;
        }

        for(int i =0; i<26; i++){
            if(!alphabets[i] ){
                return false;
            }
        }
        return true;
    }
}
