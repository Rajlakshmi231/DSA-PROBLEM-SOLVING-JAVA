// Detect cycle in an undirected graph
//T. C :- O(V + E)

class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        for(int i =0; i<V; i++){
            if(!vis[i]){
                if(dfs(adj, vis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int curr, int par){
        vis[curr] = true;
        
        for(int nbr :adj.get(curr)){
            //case1 :- neighbour not visited then there is a cycle
            if(!vis[nbr]){
                if(dfs(adj, vis, nbr, curr)){
                    return true;
                }
                
            }
            //case2 :- neighbour visited but that node is not the parent of curr node
            else if(par != nbr){
                return true;
            }
        }
        return false;
    }
}
