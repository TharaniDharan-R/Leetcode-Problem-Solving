class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int s=0;
        while(x>0){
            int digit= x%10;
            s=s*10+digit;
            x=x/10;
        }
        //System.out.print(s);
        if(a==s)
        return true;
        else
        return false;
    }
}