class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int r = 0;
        int c = col-1;
        while(c >= 0 && r < row){
             if(matrix[r][c] > target){
                c--;
             }else if(matrix[r][c] == target){
                return true;
             }else{
                r++;
             }
        }
        return false;
    }
}