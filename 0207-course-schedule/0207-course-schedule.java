class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];
        for(int[] edge:prerequisites){
            graph.get(edge[1]).add(edge[0]);
            indegree[edge[0]]++;
        }

        
        Queue<Integer> que = new LinkedList<>();
        int count = 0; 

        for(int i = 0;i<numCourses;i++){
            if(indegree[i] == 0){
                que.offer(i);
            }
        }

        while(!que.isEmpty()){
            int course = que.poll();
            count++;
            for(int child:graph.get(course)){
                indegree[child]--;
                if(indegree[child] == 0){
                que.offer(child);
                }
            }
        }
        return numCourses == count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna