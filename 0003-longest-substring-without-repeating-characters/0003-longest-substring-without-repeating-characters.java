class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs= new HashSet<>();
        int st=0;
        int n=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(hs.contains(c)){
                hs.remove(s.charAt(st));
                st++;
            }
            hs.add(c);
            if(hs.size()>n)
            n=hs.size();
        }
        return n;
    }
}