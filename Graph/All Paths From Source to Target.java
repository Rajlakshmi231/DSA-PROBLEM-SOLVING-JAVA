// All Paths From Source to Target
//T.C :- o(V + E)

class Solution {
    public void printAllNodes(int[][] graph, List<List<Integer>> result, int src, int dest, List<Integer> path ){
        if(src == dest){
            result.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i=0; i<graph[src].length;i++){
            path.add(graph[src][i]);
            printAllNodes(graph, result, graph[src][i] , dest, path );
            path.remove(path.size()-1);
        }

    }
  
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        printAllNodes(graph, result, 0, graph.length-1,path);
        return result;   
    }
}
