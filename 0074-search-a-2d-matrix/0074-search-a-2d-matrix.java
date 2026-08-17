class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = -1;
        int top = 0;
        int bottom = m-1;
        while(top <= bottom ){
            int mid = (top+bottom)/2;
            if(matrix[mid][0] <= target && matrix[mid][n-1] >= target){
                row = mid;
                break;
            }else if(matrix[mid][0] < target){
                top = mid + 1;
            }else{
                bottom = mid -1;
            }
        }

        if(row == -1) return false;

        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[row][mid] == target){
                return true;
            }else if(matrix[row][mid] > target){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return false;

        
    }
}