class Solution {
    public int maxDigitRange(int[] nums) {
       int digit[]= new int[nums.length];
       int lm=0;
       int ans=0;
       int dup[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        dup[i]=nums[i];
       }
       for(int i=0;i<nums.length;i++){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(nums[i]>0){
            int d= nums[i]%10;
            if(d>max)
            max=d;
            if(d<min){
            min= d;
            }
            nums[i]/=10;
        }
        digit[i]=max-min;
        if(lm<max-min)
        lm=max-min;
       }
       for(int i=0;i<nums.length;i++){
        if(digit[i]==lm){
            ans+=dup[i];
        }
       }
       return ans;
    }
}