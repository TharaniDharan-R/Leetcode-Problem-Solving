class Solution {
    public int lengthOfLongestSubstring(String s) {
       int st=0;
       int e=0;
       int max=0;
       Set<Character> hs=new HashSet<>();
       while(e<s.length()){
        char c= s.charAt(e);
        while(hs.contains(c)){
            hs.remove(s.charAt(st));
            st++;
        }
        hs.add(c);
        int size = e-st+1;
        max=Math.max(max,size);
        e++;
       }
       return max;
    }
}