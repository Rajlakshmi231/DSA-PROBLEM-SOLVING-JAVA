// Create A Graph (Adjacency List)

import java.util.*;
public class Classroom{
    static class Edge{
        int src;
        int dest;
        int wt;
        
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void main (String args[]){
        /*              (5)
                    0 ------- 1
                            /   \
                        (1)/     \ (3)
                          /       \
                         2 ------- 3
                         |
                    (2)  |
                         |
                         4
        */
        
        int V = 5;
        ArrayList<Edge> [] graph = new ArrayList[V];
        for(int i =0; i < V; i++){
            graph[i] = new ArrayList<>();
        }
        // 0 - vertex
        graph[0].add(new Edge(0, 1, 5));
        
        //1 - vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        graph[1].add(new Edge(1, 3, 3));
        
        //2 - vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));
        
        //3 - vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        
        //4 - vertex
        graph[4].add(new Edge(4, 2, 2));
        
        //2's neighbour
        for(int i =0; i< graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        } 
    }
}

// Output :- 
          // 1
          // 3
          // 4

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Using  ArrayList<ArrayList<Integer>>

import java.io.*;
import java.util.*;

public class Classroom{
    
    public static void main(String[] args){
        int n =3, m=3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        //n + 1
        for(int i =0; i <=n; i++){
           adj.add(new ArrayList<Integer>());
        }
        
        /* For adjacency list for undirected graph
        adj.get(u).add(v);
        adj.get(v).add(u);
        
        For adjacency list for directed graph we connect one edge like this (edge u ---> v)
        adj.get(u).add(v);
        
        */
        
        //edge 1---2
        adj.get(1).add(2); //get the arrylist at the first index and store 2
        adj.get(2).add(1);
        
        //edge 2---3
        adj.get(2).add(3);
        adj.get(3).add(2);
        
        //edge 1---3
        adj.get(1).add(3);
        adj.get(3).add(1);
         
        //print all the edges     adjacency list for undirected graph
        for(int i =1; i <= n; i++){
            for(int j =0; j < adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

//Output :-
        // 2 3 
        // 1 3 
        // 2 1
