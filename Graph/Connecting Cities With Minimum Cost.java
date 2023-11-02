// Connecting Cities With Minimum Cost
// T.C :- The outer loop(i.e. the loop to add new node to MST) runs n times and in each iteration of the loop it takes O(n) time to find the min node and O(n) 
// time to update the neighboring nodes of u-th node. Hence the overall complexity is O(n2)
// S.C :- o(n)

import java.util.* ;
import java.io.*; 
public class Solution {
    static class Edge implements Comparable<Edge>{
        int dest;
        int cost;

        public Edge(int d, int c){
            this.dest = d;
            this.cost = c;
        }
        @Override 
        public int compareTo(Edge e2){
            return this.cost - e2.cost;
        }
    }

    public static int connectCities(int[][] cities) {
        // Write your code here.
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[cities.length];
        pq.add(new Edge(0, 0)); //add source
        int finalCost =0;

        while(!pq.isEmpty()){
            Edge curr = pq.remove();
            if(!vis[curr.dest]){
                vis[curr.dest] = true;
                finalCost += curr.cost;

                for(int i =0; i<cities[curr.dest].length; i++){
                    if(cities[curr.dest][i] != 0){
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalCost;
    }

    public static void main(String args[]){
        int cities[][] =  {{0, 1, 2, 3, 4},
                           {1, 0, 5, 0, 7},
                           {2, 5, 0, 6, 0},
                           {3, 0, 6, 0, 0},
                           {4, 7, 0, 0, 0}};
        System.out.print(connectCities(cities));
    }
}

// Output :- 10
