class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];

        for(int i = 0;i<n;i++){
            if(visited[i] == 0){
                if(!dfs(i,1,graph,visited)){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean dfs(int node , int col , int[][] graph , int[] visited){
        visited[node] = col;
        for(int n:graph[node]){
            if(visited[n] == 0){
                if(!dfs(n,-col,graph,visited)){
                    return false;
                }
            }else{
                if(visited[n] == col){
                    return false;
                }
            }
        }
        return true;
    }
}