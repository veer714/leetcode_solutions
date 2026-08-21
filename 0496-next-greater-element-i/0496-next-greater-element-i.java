import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int n = nums1.length;
        for(int num:nums2){
            while(!st.empty() && num > st.peek()){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        int[] result = new int[n];
        for(int i = 0;i<n;i++){
            result[i] = map.getOrDefault(nums1[i],-1);
        }
        return result;
    }
}