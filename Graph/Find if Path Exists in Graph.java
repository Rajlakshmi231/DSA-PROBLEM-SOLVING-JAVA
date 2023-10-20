//Find if Path Exists in Graph
//T.C :- O(V + E)

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        ArrayList<List<Integer>> e = new ArrayList<>(); // To store all edges
        boolean[] visited = new boolean[n]; // To keep track of visited nodes
        
        // Initialize the List of List
        for(int i=0; i<n; i++){
            e.add(new ArrayList<>());
        }
        
        // Stored all the edges
        for(int[] edge: edges){
            e.get(edge[0]).add(edge[1]);
            e.get(edge[1]).add(edge[0]);
        }
        
        return hasPath( e, visited, source, destination);
    }
    
    public boolean hasPath(List<List<Integer>> e, boolean[] vis, int src, int dst){
        if(src == dst) return true;    // if source is destination, we reached
        
        vis[src] = true; // marking node as visited
        for(int neighbor: e.get(src)) {
            if (!vis[neighbor] && hasPath(e, vis, neighbor, dst)) return true;
        }
        
        return false;    
    }
}
