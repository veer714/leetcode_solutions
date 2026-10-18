class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for(int i = 0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        int[] visited = new int[V];
        
        for(int i = 0;i<V;i++){
            if(visited[i] == 0 && dfs(i,-1,graph,visited)){
                return true;
            }
        }
        return false;
    }
    
    private boolean dfs(int node , int parent ,ArrayList<ArrayList<Integer>> graph , int[] visited ){
        visited[node] = 1;
        for(int child:graph.get(node)){
            if(visited[child] == 0 ){
                if(dfs(child,node,graph,visited)){
                    return true;
                }
            }else if(child != parent){
                    return true;
                }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna