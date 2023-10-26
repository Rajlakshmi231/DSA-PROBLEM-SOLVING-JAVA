// Topological sort (DFS)

// Algorithm
// Make visited Array to tackle both disconnected & visited Nodes.
// Call DFS on each unvisited node
    // Call DFS on unvisited Neighbours
    // After making all calls to Neighbours Store current Node in a Stack.
// Finally, pop all the elements of stack into resultant array

// T.C :- O(V + E)    S.C :- O(V)

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean vis[]= new boolean[V];
        Stack<Integer>s= new Stack<>();
        int ans[]= new int[V];
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                topSortUtil(adj,i,vis,s);
            }
        }
        
        while(!s.isEmpty()){
            for(int i=0;i<ans.length;i++){
                ans[i]=s.pop();
            }
        }
        return ans;
    }
  
     public static void topSortUtil(ArrayList<ArrayList<Integer>> adj, int curr, boolean[] vis, Stack<Integer>s){
        vis[curr]=true;
        
        for(int i=0;i<adj.get(curr).size();i++){
            if(!vis[adj.get(curr).get(i)]){
                topSortUtil(adj,adj.get(curr).get(i),vis,s);
            }
        }
        s.push(curr);
    }
}
