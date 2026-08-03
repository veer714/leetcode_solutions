class Solution {
    public int lengthOfLongestSubstring(String s) {
      int maxlen = 0;
      int l = 0;
      Map<Character,Integer> map = new HashMap<>();
      for(int r = 0;r<s.length();r++){
        char ch = s.charAt(r);
        map.put(ch,map.getOrDefault(ch,0)+1);
        while(map.get(ch) > 1){
            char lch = s.charAt(l);
            map.put(lch,map.get(lch)-1);
            l++;
        }
        maxlen = Math.max(maxlen,r-l+1);
      }
      return maxlen;
    }
}