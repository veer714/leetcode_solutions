class Solution {
    public void moveZeroes(int[] nums) {
        
        int tmp;
        int l = 0;
        for(int r =0;r<nums.length;r++){
            if(nums[r] != 0){
                tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                l++;
            }
        }
        
       
        
    }
}