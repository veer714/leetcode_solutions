class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum = nums[0];
        int currsum = 0;
        for(int num:nums){
            currsum += num;
            maxsum = Math.max(currsum,maxsum);
            if(currsum < 0){
                currsum = 0;
            }
        }
        currsum = 0;
        int minsum = nums[0];
        for(int num:nums){
            currsum += num;
            minsum = Math.min(currsum,minsum);
            if(currsum > 0){
                currsum = 0;
            }

        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}