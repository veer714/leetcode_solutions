class Solution {
    public int[] nextGreaterElements(int[] nums) {
       
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        
        for(int i = 2*n - 1;i>=0;i--){
            int num = nums[i%n];
            while(!stack.empty() && num >= stack.peek()){
                stack.pop();

            }

            if(i < n && !stack.empty()){
                ans[i] = stack.peek();

            }
            stack.push(num);
        }
       
       return ans;
    }
}