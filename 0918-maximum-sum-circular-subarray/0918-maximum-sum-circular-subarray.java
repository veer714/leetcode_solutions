class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum = nums[0];
        int fsum = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            fsum +=  nums[i];
            maxsum = Math.max(fsum,maxsum);
            if(fsum < 0){
                fsum = 0;
            }
        }
        int total = 0;
        int minsum = nums[0];
        int fmin = 0;
        for(int num:nums){
            total += num;
            fmin += num;
            minsum = Math.min(minsum,fmin);
            if(fmin > 0){
                fmin = 0;
            }
            
        }

        if (maxsum < 0) {
        return maxsum;
    }

        return Math.max(maxsum,total-minsum);
    }
}