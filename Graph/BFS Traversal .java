// BFS Traversal 
// T.C :- O(V + E) 

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        //Create ans array - keep track of traversed nodes
        ArrayList<Integer> bfs = new ArrayList<>();
        
        //Create Queue for BFS
        Queue<Integer> q = new LinkedList<>();
        
        //Create visited array and make root as visited
        boolean vis[] = new boolean[V];
        vis[0] = true;
        
        //Add Source to queue
        q.add(0); 
        
        //BFS Traversal
        while(!q.isEmpty()){
            //Remove first element from the queue & add to the ans
            int curr = q.remove();
            bfs.add(curr);
            
            //Visit neighbours of removed element from the queue
            for(int i : adj.get(curr))
            
            //if neighbours not visited add to queue and make them visited
            if(!vis[i]){
                q.add(i);
                vis[i] = true;
            }
            
        }
        return bfs;
    }
}
