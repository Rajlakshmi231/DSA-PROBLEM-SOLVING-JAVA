// DFS Traversal

// T.C :- For an undirected graph, O(N) + O(2E), For a directed graph, O(N) + O(E), Because for every node we are calling the recursive function once, 
// the time taken is O(N) and 2E is for total degrees as we traverse for all adjacent nodes.
// S.C :- O(3N) ~ O(N), Space for dfs stack space, visited array and an adjacency list.

class Solution {
    
    public static void dfs(int curr, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, boolean vis[]){
       //marking current node as visited
        ans.add(curr);
        vis[curr] = true;
        
        //getting neighbour nodes
        for(int i=0; i<adj.get(curr).size(); i++){
            if(!vis[adj.get(curr).get(i)]){
                dfs(adj.get(curr).get(i), adj, ans, vis);
            }
        }
    }
  
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        //boolean array to keep track of visited vertices
        boolean vis[] = new boolean[V];
      
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(0, adj, ans, vis);
        return ans;
    }
}
