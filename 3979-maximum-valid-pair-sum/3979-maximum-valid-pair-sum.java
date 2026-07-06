class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(j-i>=k){
        //         int s=nums[i]+nums[j];
        //         max= Math.max(s,max);
        //         }
        //     }
        // }
        // return max;

        ///optiimal
        int max=nums[0];
        int ans = Integer.MIN_VALUE;
        for(int i=k;i<nums.length;i++){
            max=Math.max(max,nums[i-k]);
            ans=Math.max(ans,max+nums[i]);
        }
        return ans;
    }
}