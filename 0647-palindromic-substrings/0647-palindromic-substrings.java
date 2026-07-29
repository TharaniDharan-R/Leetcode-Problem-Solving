class Solution {
    public static boolean palin(String s){
        StringBuilder sb= new StringBuilder(s);
        if(s.equals(sb.reverse().toString()))
        return true;
        return false;
    }
    public int countSubstrings(String s) {
        int c=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(palin(s.substring(i,j))){
                    c++;
                }
            }
        }
        return c;
    }
}