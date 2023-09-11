// Simplify Path 

// T.C :- O(N) iterating on every character of string "path"
// S.C :- O(N)


class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        // split the path on "/"
        for(String dir: path.split("/")){

            // if we have ".." and stack is not empty pop
            if(!st.isEmpty() && dir.equals("..")){
                st.pop();
            }
            else if(!dir.equals("") && !dir.equals(".") && !dir.equals("..")){
                st.push(dir);
            }
        }
        StringBuilder simplifiedPath = new StringBuilder();
        //filling slashes before every dir name
        for(String dir : st){
            simplifiedPath.append("/").append(dir);
        }

        // if empty return "/" else return the simplified string
        return simplifiedPath.length() == 0 ? "/" : simplifiedPath.toString();   
    }
}
