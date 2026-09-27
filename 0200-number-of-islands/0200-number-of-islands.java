class Solution {
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int island = 0;

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
               if(grid[i][j] == '1'){
                bfs(grid,i,j);
                island++;
               }
            }
        }

        return island;
    }
    private void bfs(char[][] grid,int row,int col){
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[] > que = new LinkedList<>();
        que.add(new int[]{row,col});
        grid[row][col] = '0';
        int[] dr = {-1,0,1,0};
        int[] dc = {0,-1,0,1};
        while(!que.isEmpty()){
            int[] curr = que.poll();
            int r = curr[0];
            int c = curr[1];
            for(int i = 0;i<4;i++){
                int nr = r + dr[i];
                int nc = c + dc[i];
                if(nr >= 0 && nr <m && nc >= 0 && nc < n && grid[nr][nc] == '1'){
                    que.add(new int[]{nr,nc});
                    grid[nr][nc] = '0';
                }
            }
        }
    }
}