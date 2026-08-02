import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> res = new ArrayList<>();
       if (s.length() < p.length() ) return res;

       Map<Character,Integer> pmap = new HashMap<>();
       Map<Character,Integer> smap = new HashMap<>();

       for(char ch : p.toCharArray()){
        pmap.put(ch,pmap.getOrDefault(ch,0) +1);
       }
       int count = p.length();
       int l = 0;
       for(int r = 0;r<s.length();r++){
        char ch = s.charAt(r);
        smap.put(ch,smap.getOrDefault(ch,0)+1);
        if(pmap.containsKey(ch) && smap.get(ch) <= pmap.get(ch)){
            count--;
        }
        if(r - l + 1 > p.length()){
            char lchar = s.charAt(l);
            if(pmap.containsKey(lchar) && smap.get(lchar) <= pmap.get(lchar)){
                count++;
            }
            smap.put(lchar,smap.get(lchar)-1);
            l++;
        }
        if(count == 0){
            res.add(l);
        }
       }
       return res;
    }
}