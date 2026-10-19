class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i] == target){
                result.add(i);
                for(int j = i+1;j<n;j++){
                    if(nums[j] == target){
                    result.add(j);
                    }else{
                        break;
                    }
                }
                break;
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna