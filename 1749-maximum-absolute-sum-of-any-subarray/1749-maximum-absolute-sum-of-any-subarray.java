class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         //System.out.println(sum);
        //         max=Math.max(max,Math.abs(sum));
        //     }
        // }
        // return max;
         int smax=nums[0];
        int res=nums[0];
        int smin=nums[0];
        int res1=nums[0];
        for(int i=1;i<nums.length;i++){
            smax=Math.max(smax+nums[i],nums[i]);
            res=Math.max(smax,res);
            
            smin=Math.min(smin+nums[i],nums[i]);
            res1=Math.min(smin,res1);
        }
        return Math.max(res,Math.abs(res1));
    }
}