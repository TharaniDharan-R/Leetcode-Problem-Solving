class Solution {
    public int digitFrequencyScore(int n) {
        int s=0;
        while(n>0){
            int digit= n%10;
            s+=digit;
            n/=10;
        }
        return s;
    }
}