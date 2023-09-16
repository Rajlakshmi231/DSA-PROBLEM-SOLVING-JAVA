// Infix Expression
import java.util.*;
public class infix{
    public static void main (String[] args){
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            int ascii = (int) ch;
            if(ascii >= 48 && ascii <=57){
                val.push(ascii - 48);
            }
                
            else if (op.size() == 0|| ch == '(' || op.peek() == '('){
                op.push(ch);
            }
             else if(ch == ')'){
                while(op.peek() != '('){
                    // process  (two pop from val stack and one pop from optr stack then process it 
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                }
                op.pop(); // then pop the opening brackets '(' we are looking for our corresponding closing brackets. 
            }    
                
            else{
                if(ch == '+' || ch == '-'){
                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                    //push
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        //work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek() == '*' )val.push(v1*v2);
                        if(op.peek() == '/' )val.push(v1/v2);
                        op.pop();
                        //push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        //val stack size -> 1
        while(val.size() > 1){
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek() == '-') val.push(v1-v2);
            if(op.peek() == '+') val.push(v1+v2);
            if(op.peek() == '*') val.push(v1*v2);
            if(op.peek() == '/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}

// Output:- 4

  
