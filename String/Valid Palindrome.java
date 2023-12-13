// Valid Palindrome
class Solution {
    public boolean checkPalindrome(String str){
        int n = str.length();
        for(int i = 0; i < n; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;

    }

    public boolean isPalindrome(String s) {
        //Convert string to lowercase
        s = s.toLowerCase();

        //Remove all non-alphsnumeric character
        String temp = "";
        for(int j = 0; j < s.length(); j++){
            char ch = s.charAt(j);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
                temp += s.charAt(j);
            }
        }
        //check Palindrome
        return checkPalindrome(temp);   
    }
}
