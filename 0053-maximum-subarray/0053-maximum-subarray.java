class Solution {
    public int maxSubArray(int[] nums) {
        int Maxsum = nums[0];
        int currsum = 0;
        for(int num:nums){
            currsum += num;
            Maxsum = Math.max(currsum,Maxsum);

            if(currsum < 0){
                currsum = 0;
            }
        }
        return Maxsum;
    }
}