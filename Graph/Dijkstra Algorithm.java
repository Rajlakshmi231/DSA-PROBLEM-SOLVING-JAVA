// Dijkstra Algorithm
// T.C :- O((V+ElogV)    S.C :- O(V+E)

class Solution{
    public static class Pair implements Comparable<Pair>{
        int n;
        int path;
        
        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }
        
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path; //path based sorting for my pairs
        }
    }
    
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        
        Arrays.fill(visited, false);
        
        // PEHLE FILL THE DISTANCES ARRAY WITH INFINITY BECAUSE HUMEIN PATA NHI 
        // HAIN KOI NODE KITNA DUUR HAIN APNE SOURCE NODE SE
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        // SOURCE KA KHUD SE HI DUURI 0 BECAUSE OFCOURSE
        dist[S] = 0;
        pq.add(new Pair(S, 0));
        
        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            
            // AGAR CURRENT NODE VISITED NAHI HAIN SO USKO VISIT KARO
            if (!visited[curr.n]){
                visited[curr.n] = true;
                
                 ArrayList<ArrayList<Integer>> nbrs = adj.get(curr.n);
                
                // FIR SARE NEIGHBOURS KO VISIT KARO AND CHECK KARO 
                // KI KYA USS NODE KO HUMNE SHORTER DISTANCE MEIN VISIT KIYA HAIN 
                for (int i = 0; i < nbrs.size(); i++){
                    ArrayList<Integer> edge = nbrs.get(i);
                    int nbr = edge.get(0);
                    int wt = edge.get(1);
                    
                    // now campare if we are reaching the node faster
                    if (dist[curr.n] + wt < dist[nbr]) {
                        dist[nbr] = dist[curr.n] + wt;
                        pq.add(new Pair(nbr, dist[nbr]));
                    }
                }
            }
        }
        return dist;
    }
}
