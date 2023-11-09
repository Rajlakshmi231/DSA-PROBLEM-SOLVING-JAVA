// Sort a String
// T.C :- O(N)

class Solution { 
    String sort(String s) {
        //create an array to store the alphabet
        int[] alpha = new int[26];
        for(int i =0; i<s.length(); i++){
            alpha[s.charAt(i) - 'a']++; //storing the cnt in the array
        }
        String ans = "";
        
        for(int i =0; i< 26; i++){ //iterate on alpha
            char c = (char)(i+(int)'a');  //adding these char in the ans string
            
            while(alpha[i] != 0){ //till the char cnt not become 0 
                ans += c;
                alpha[i]--; //if char is present more than 1 time
            }
        }
        return ans;
    }
}
