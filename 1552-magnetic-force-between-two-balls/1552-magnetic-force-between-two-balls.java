class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length - 1] - position[0];
        
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(canput(position,m,mid)){
                ans = mid;
                low = mid+1;
            }else{
            high = mid-1;
            }
        }
        return ans;
    }
    private boolean canput(int[] position,int m,int f){
        int n = position.length;
        int count = 1;
        int pos = position[0];
        for(int i  = 1;i<n;i++){
            if(position[i] - pos >= f){
                count++;
                pos = position[i];
                if(count >= m){
                    return true;
                }
            }
        }
        return false;
    }
    
}