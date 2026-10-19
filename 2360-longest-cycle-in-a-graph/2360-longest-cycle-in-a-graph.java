class Solution {
    public int longestCycle(int[] edges) {
       int V = edges.length;
       boolean[] visited = new boolean[V];
       int ans = -1;
       for(int i = 0 ;i<V;i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            int node = i;
            int dist = 0;
            if(visited[i])  continue;
            while(node != -1 && !visited[node]){
                visited[node] = true;
                map.put(node,dist++);
                node = edges[node];
            }
            if(node != -1 && map.containsKey(node)){
                ans = Math.max(ans, dist - map.get(node));
            }
       }
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna