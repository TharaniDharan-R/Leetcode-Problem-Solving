class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        int con=0;
        int order=0;
        while(n>0){
            int d =n%10;
            if(d!=0){
                ans+=d;
                con=con*10+d;
            }
            n/=10;
        }
        while(con>0){
            int digit=con%10;
            order=order*10+digit;
            con/=10;
        }
        //System.out.print();
        ans=(long) order*ans;
        return ans;
    }
}