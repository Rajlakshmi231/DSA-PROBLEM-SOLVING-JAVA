// Sort a stack
// Given a stack, the task is to sort it such that the top of the stack has the greatest element.

class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		if(s.isEmpty()){
		    return s;
		}
		int num = s.peek();
		s.pop();
		
		sort(s);
		sortedInsert(s, num);
		return s;
	}
	
	public Stack<Integer> sortedInsert(Stack<Integer> s , int num){
    if(s.isEmpty() || s.peek() < num){
        s.push(num);
    return s;
		}
		int n = s.peek();
		s.pop();
	
		sortedInsert(s, num);
		s.push(n);
		return s;
	}
	
}
