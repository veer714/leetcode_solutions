class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int w:weights){
            max = Math.max(max,w);
            sum += w;
        }
        int ans = 0;
        while(max<=sum){
            int cap = max+(sum-max)/2;
            if(canship(weights,days,cap)){
                ans = cap;
                sum = cap-1;
            }else{
               max = cap+1;
            }
        }
        return ans;
    }
    private boolean canship(int[] weights,int days, int cap){
        int day = 1;
        int sum = 0;
        for(int w:weights){
            if(sum+w>cap){
                day++;
                sum = w;
            }else{
                sum+=w;
            }
        }
        return day<=days;
    }
}