class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        char [] c=s.toCharArray();
        char ch=(char)(x+'0');
        if(c[0]==ch)
        return false;
        for(int i=1;i<c.length;i++){
            if(c[i]==ch){
            return true;
            }
            
        }
       // System.out.print(q);
        return false;
    }
}