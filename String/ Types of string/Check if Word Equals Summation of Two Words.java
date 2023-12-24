// Check if Word Equals Summation of Two Words
// T.C :- O(N)    S.C :- O(1)

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        return convert(firstWord) + convert(secondWord) == convert(targetWord);
    }
    private int convert(String word){
        int ans=0;
        for(int i=0;i<word.length();i++){
            ans = (word.charAt(i) - 'a')+ ans*10;
        }
        return ans;
    }
}
