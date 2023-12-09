// String Compression
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
