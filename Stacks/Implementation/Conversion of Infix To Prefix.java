// Conversion of Infix To Prefix

// Infix Expression
import java.util.Stack;
public class infixToPrefix{
    public static void main (String[] args){
        String str = "9-(5+3)*4/6";
        System.out.println(str);
        
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            int ascii = (int) ch;
            if(ascii >= 48 && ascii <=57){ //if ch is digit simply push in val stack
                String s = "" + ch;
                val.push(s);
            }
            
            else if (op.size() == 0|| ch == '(' || op.peek() == '('){
                op.push(ch);
            }
            else if(ch == ')'){
                while(op.peek() != '('){
                    // process  (two pop from val stack and one pop from optr stack then process it as (optr + v1 + v2))
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char optr = op.pop();
                    String t = optr + v1 + v2 ;
                    val.push(t);  //push the process result(i.e. t) in the val stack 
                }
                op.pop(); // then pop the opening brackets '(' we are looking for our corresponding closing brackets. 
            }
            
            else{
                if(ch == '+' || ch == '-'){
                    //process
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char optr = op.pop();
                    String t = optr + v1 + v2 ;
                    val.push(t);
                    
                    //push
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){ // if same precedence then do the process and push the result of process in val stack
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char optr = op.pop();
                        String t =  optr + v1 + v2 ;
                        val.push(t);
                        
                        //push
                        op.push(ch); //now push the 2nd operator in the op stack
                    }
                    else op.push(ch); //the optr on op.peek() has less precedence then simply push the optr in op stack
                }
            }
        }
        //val stack size -> 1
        while(val.size() > 1){ 
            String v2 = val.pop();
            String v1 = val.pop();
            char optr = op.pop();
            String t = optr + v1 + v2 ;
            
            val.push(t);
        }
        String prefix = val.pop();
        System.out.println(prefix);
    }
}

// Output :=
          // 9-(5+3)*4/6
          // -9/*+5346
  
