// Conversion of Infix To Postfix

// Infix Expression
import java.util.Stack;
public class infixToPostfix{
    public static void main (String[] args){
        String str = "9-(5+3)*4/6";
        System.out.println(str);
        
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            int ascii = (int) ch;
            if(ascii >= 48 && ascii <=57){
                String s = "" + ch;
                val.push(s);
            }
            
            else if (op.size() == 0|| ch == '(' || op.peek() == '('){
                op.push(ch);
            }
            else if(ch == ')'){
                while(op.peek() != '('){
                    // process
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char optr = op.pop();
                    String t = v1 + v2 + optr; 
                    val.push(t);
                }
                op.pop();
            }
            
            else{
                if(ch == '+' || ch == '-'){
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char optr = op.pop();
                    String t = v1 + v2 + optr;
                    val.push(t);
                    op.pop();
                    
                    //push
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char optr = op.pop();
                        String t = v1 + v2 + optr;
                        val.push(t);
                        
                        //push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        //val stack size -> 1
        while(val.size() > 1){
            String v2 = val.pop();
            String v1 = val.pop();
            char optr = op.pop();
            String t = v1 + v2 + optr;
            
            val.push(t);
        }
        String postfix = val.pop();
        System.out.println(postfix);
    }
}

// Output :-
          // 9-(5+3)*4/6
          // 953+4*6/-

  
