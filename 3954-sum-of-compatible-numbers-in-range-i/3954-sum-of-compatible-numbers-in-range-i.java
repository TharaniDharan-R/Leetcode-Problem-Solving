class Solution {
    public int sumOfGoodIntegers(int n, int k) {
       int s=0;
       for(int i=1;i<=n+k;i++){
        if((n&i)==0 && Math.abs(n-i)<=k){
            s+=i;
            System.out.print(i);
        }
       }
       return s ; 
    }
}