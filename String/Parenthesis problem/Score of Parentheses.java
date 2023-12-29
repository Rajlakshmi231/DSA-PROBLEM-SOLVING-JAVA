// Score of Parentheses

class Solution {
    int i =0;
    public int scoreOfParentheses(String s) {
        int score =0;
        while(i<s.length()){
            char first = s.charAt(i); i++;
            if(first == '('){
                if(s.charAt(i) == ')'){
                    score++;
                    i++;
                }
                else{
                    score = score + 2*(scoreOfParentheses(s));
                }
            }
            else{
                return score;
            }
        }
        return score;
    }
}
