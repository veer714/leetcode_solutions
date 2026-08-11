class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findindex(nums,target,true);
        int last = findindex(nums,target,false);
        return new int[]{first,last}; 
        
    }

    private int findindex(int[] nums,int target,boolean isfirst){
       int l = 0;
       int r = nums.length-1;
       int result = -1;
       while(l<=r ){
        int mid = l+(r-l)/2;
        if(nums[mid] == target){
           result = mid;
           if(isfirst){
            r = mid -1;
           }else{
            l = mid+1;
           }
        }else if(nums[mid]>target){
            r = mid-1;
        }else{
            l = mid+1;
        }

       }
       return result;
         
    }
}