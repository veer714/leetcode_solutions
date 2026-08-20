class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[row-1][col-1];
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(isValid(matrix,k,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    private boolean isValid(int[][] matrix,int k,int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int r = row-1;
        int c = 0;
        int count = 0;
        while(r >= 0 && c < col){
            if(matrix[r][c] > target){
                r--;
            }else{
                count += r+1;
                c++;
            }
        }
    
        return count >= k;
    }
}