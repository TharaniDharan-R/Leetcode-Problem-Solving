class Solution {
    public String rearrangeString(String s, char x, char y) {
        String ans="";
        String occ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==x)
            occ+=s.charAt(i);
            else
            ans+=s.charAt(i);
        }
        ans+=occ;
        return ans;
    }
}