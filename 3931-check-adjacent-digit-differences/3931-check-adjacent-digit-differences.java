class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        char c[]=s.toCharArray();
        for(int i=0;i<c.length-1;i++){
            if(Math.abs(c[i]-c[i+1])>2)
            return false;
            
        }
        return true;
    }
}