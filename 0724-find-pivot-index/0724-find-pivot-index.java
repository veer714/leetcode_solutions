class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int ans;
        for(int n:nums){
            sum += n;
        }
        int leftsum = 0;
        for(int i = 0;i<nums.length;i++){
            int rightsum = sum - leftsum - nums[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }

        return -1;
    }
}