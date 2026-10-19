class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
       ArrayList<ArrayList<Integer>>  graph = new ArrayList<>();
       
       for(int i = 0;i<V;i++){
           graph.add(new ArrayList<>());
       }
       
       for(int[] edge:edges){
           graph.get(edge[0]).add(edge[1]);
       }
       
       int[] visited = new int[V];
       
       for(int i = 0;i<V;i++){
           if(dfs(i,graph,visited)){
               return true;
           }
       }
       
       return false;
       
    }
    
    private boolean dfs(int node ,ArrayList<ArrayList<Integer>> graph, int[] visited){
        visited[node] = 1;
        for(int child:graph.get(node)){
            if(visited[child] == 0){
                if(dfs(child,graph,visited)){
                    return true;
                }
            }else if(visited[child] == 1){
                return true;
            }
        }
        
        visited[node] = 2;
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna