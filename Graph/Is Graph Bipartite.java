// Is Graph Bipartite?
// A graph is bipartite if the nodes can be partitioned into two independent sets A and B such that every edge in the graph connects 
// a node in set A and a node in set B.
// T.C:- O(V+E)        S.C :- O(V+E)


class Solution {
    public boolean isBipartite(int[][] graph) {
        int col[] = new int[graph.length];
        for(int i =0; i < col.length; i++){
            col[i] = -1; 
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i< graph.length; i++){
            if(col[i] == -1){
                q.add(i); // add the starting node
                col[i] =0; // color the first node with 1st color

                while(!q.isEmpty()){
                    int curr = q.remove(); // take the node out from queue

                    // check for all of it's  adj nodes
                    for(int j =0; j< graph[curr].length; j++){
                    // if the adj node is yet not colored give the opposite color of the node
                        if(col[graph[curr][j]] == -1){
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[graph[curr][j]] = nextCol;
                            q.add(graph[curr][j]);
                        }
                        //if neighbour has same color then return false
                        else if(col[graph[curr][j]] == col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
        
    }
}
