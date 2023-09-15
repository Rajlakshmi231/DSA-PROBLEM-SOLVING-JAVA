// Evaluation of Postfix Expression
// Steps:-
// Create a stack to store operands (or values).
// Traverse left to right and do the following for every traversed element.
// If element is a number, push it into the stack.
// If element is an operator, pop(2 pops v1 & v2) operands for the operator from the stack. Evaluate the operator and push the result back to the stack.
// When the expression is ended, the number in the stack is the final answer.


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> val = new Stack<>();
        for(int i =0; i<S.length(); i++){
            char ch = S.charAt(i);
            
            if(Character.isDigit(ch)){
                val.push(ch-'0');
            }
            else{
                int v2 = val.pop();
                int v1 = val.pop();
                if(ch == '+') val.push(v1+v2);
                if(ch == '-') val.push(v1-v2);
                if(ch == '*') val.push(v1*v2);
                if(ch == '/') val.push(v1/v2);
            }
            
        }
        return val.peek();
    }
}
