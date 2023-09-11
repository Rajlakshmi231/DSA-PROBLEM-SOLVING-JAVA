// Decode String

class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack(); 
        Stack<StringBuilder> strStack = new Stack();
        StringBuilder str = new StringBuilder(""); //store the temporary string
        int num =0;
 

        for(int i =0; i<s.length(); i++){
            // $ types of char:- 
            // digits, alphabets, open brackets and close brackets
            char c = s.charAt(i);

            if(Character.isDigit(c)) {
                num = (num * 10) + (c - '0'); //if char is a number add into num 
                continue;
            }
            else if (c == '['){
                strStack.push(str);
                str = new StringBuilder();

                numStack.push(num);
                num = 0;

            }
            else if(c == ']'){
                StringBuilder temp = str;
                str = strStack.pop();
                int count = numStack.pop();
                while(count -->0){
                    str.append(temp);
                }
            }
            else{   //(Character.isLetter(c)
                str.append(c);

            }
        }
        return str.toString();
    }
}
