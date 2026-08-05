class Solution {
    public String minWindow(String s, String t) {
        int l = 0;
        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();

        for(char c:t.toCharArray()){
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }
        int minlen = Integer.MAX_VALUE;
        int count = t.length();
        String ans = "";
        for(int r = 0;r<s.length();r++){
            char ch = s.charAt(r);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            if(tmap.containsKey(ch) && smap.get(ch) <= tmap.get(ch)){
                count--;
            }
            while(count == 0){
                if(r-l+1 < minlen){
                    minlen = r-l+1;
                    ans = s.substring(l,r+1);
                }
                char lch = s.charAt(l);
                smap.put(lch, smap.get(lch) - 1);
                if(tmap.containsKey(lch) && smap.get(lch) < tmap.get(lch)){
                    count++;
                }
                l++;
            }
        }
        return ans;
    }
}