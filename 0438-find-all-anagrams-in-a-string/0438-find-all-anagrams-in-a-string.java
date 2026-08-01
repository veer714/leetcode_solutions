import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int n = s.length();
        int k = p.length();

        int[] pcount = new int[26];
        for(char ch : p.toCharArray()){
            pcount[ch - 'a']++;
        }
        for(int i = 0;i<=n-k;i++){
            int[] scount = new int[26];
            for(int j = i;j<=i+k-1;j++){
                scount[s.charAt(j) - 'a']++;
            }
            if(Arrays.equals(scount,pcount)){
                result.add(i);
            }
        }
        return result;
    }
}