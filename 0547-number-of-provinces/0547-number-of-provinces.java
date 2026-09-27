class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i = 0;i<n;i++){
            if(!visited[i]){
                dfs(i,visited,isConnected,n);
                count++;
            }
        }
        return count;
    }
    private void dfs(int node,boolean[] visited,int[][] isConnected,int n){
        visited[node] = true;

        for(int i = 0;i<n;i++){
            if(!visited[i] && isConnected[node][i] == 1){
                dfs(i,visited,isConnected,n);
            }
        }
    }
}