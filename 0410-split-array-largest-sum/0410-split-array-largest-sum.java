class Solution {
    public int splitArray(int[] nums, int k) {
        if(k > nums.length) return -1;
        int low = 0;
        int high = 0;
        for(int n:nums){
            low = Math.max(low,n);
            high += n;
        }
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(cansplit(nums,k,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    private boolean cansplit(int[] nums,int k,int maxsum){
        int sum = 0;
        int splits = 1;
        for(int n:nums){
            if(n+sum<=maxsum){
                sum += n;
            }else{
                splits++;
                sum = n;
            }
        }
        return splits <= k;
    }
}