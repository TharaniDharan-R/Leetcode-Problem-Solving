class Solution {
    public int maxDepth(String s) {
        int co=0;
        int max=0;
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(c[i]=='(')
            co++;
            max=Math.max(co,max);
            if(c[i]==')'){
                co--;
            }
        }
        return max;
    }
}