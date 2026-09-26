class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];

        if(original == color){
            return image;
        }
        dfs(sr,sc,image,color,original);
        return image;
    }
    private void dfs(int r,int c,int[][] image,int color,int org){
        int row = image.length;
        int col = image[0].length;
        if(r < 0 || r >= row || c < 0 || c >= col || image[r][c] != org ){
            return;
        }

        image[r][c] = color;
        dfs(r+1,c,image,color,org);
        dfs(r-1,c,image,color,org);
        dfs(r,c+1,image,color,org);
        dfs(r,c-1,image,color,org);
    }
}