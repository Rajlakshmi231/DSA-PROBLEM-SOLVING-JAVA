// Detect cycle in a directed graph

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        boolean stack[] = new boolean[V];
        
        for(int i = 0; i<V; i++){
            if(!vis[i]){
                if(isCycleUtil(adj, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycleUtil(ArrayList<ArrayList<Integer>> adj, int curr, boolean vis[], boolean stack[]){
        if(stack[curr]) return true;
        
        if(vis[curr])   return false;
      
        vis[curr] = true;
        stack[curr] = true;
        for(int child : adj.get(curr)){
            
            if(isCycleUtil(adj, child, vis, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }   
}
