class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int pile:piles){
            r = Math.max(r,pile);
        }
        int ans = 0;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(caneat(piles,h,mid)){
                ans = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }

    private boolean caneat(int[] piles,int h,int k){
       long hours = 0;
        for(int pile:piles){
            hours += (pile + k - 1)/k; 
        }
        return hours <= h;
    }
}