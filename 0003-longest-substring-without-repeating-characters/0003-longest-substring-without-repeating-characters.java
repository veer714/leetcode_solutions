class Solution {
    public int lengthOfLongestSubstring(String s) {
      int maxlen = 0;
      int l = 0;
      Map<Character,Integer> map = new HashMap<>();
      for(int r = 0;r<s.length();r++){
        char ch = s.charAt(r);
        if(map.containsKey(ch)){
            l = Math.max(l,map.get(ch)+1);
        }
        map.put(ch,r);
        maxlen = Math.max(maxlen,r-l+1);
      }
      return maxlen;
    }
}