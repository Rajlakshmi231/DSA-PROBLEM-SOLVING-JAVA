// Generate Parentheses

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        findAll("(", 1, 0, result, n);
        return result;
    }
    //Recursive function
    void findAll(String curr, int ob, int cb,List<String> result, int n ){
        if(curr.length() == 2*n){
            result.add(curr);
            return;
        }
        if(ob < n)  findAll(curr+"(", ob+1,cb, result, n );
        if(cb < ob)  findAll(curr+")", ob ,cb+1, result, n );
    }
}
