class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long)m*k > n) return -1;
        int low = Integer.MAX_VALUE;
        int high = 0;
        for(int b:bloomDay){
            low = Math.min(low,b);
            high = Math.max(high,b);
        }
        int ans = -1;
        while(low <= high ){
           int mid = low+(high-low)/2;
           if(canpick(bloomDay,m,k,mid)){
            ans = mid;
            high = mid-1;
           }else{
            low = mid+1;
           }
        }
        return ans;
    }

    private boolean canpick(int[] bloom,int m,int k,int day){
        int count = 0;
        int b = 0;
        for(int d:bloom){
            if(d<=day){
                count++;
                if(count == k){
                    count=0;
                    b++;
                }
            }else{
                count = 0;
            }
        }
        return b>=m;

    }
}