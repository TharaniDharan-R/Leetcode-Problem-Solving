class Solution {
    public int maxSubArray(int[] nums) {
    //    int msum=nums[0];
    //    int csum=nums[0];
    //    for(int i=1;i<nums.length;i++){
    //     csum=Math.max(nums[i],(csum+nums[i]));
    //     msum=Math.max(csum,msum);
    //    }
    //    return msum;
    int smax= nums[0];
    int res= nums[0];
    for(int i=1;i<nums.length;i++){
        smax=Math.max((smax+nums[i]),nums[i]);
        res= Math.max(smax,res);
    }
    return res;
    
    }
}
