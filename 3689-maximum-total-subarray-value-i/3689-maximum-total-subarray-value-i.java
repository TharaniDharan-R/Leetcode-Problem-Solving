class Solution {
    public long maxTotalValue(int[] nums, int k) {
        /// method 1////
        // long l=0;
        // Arrays.sort(nums);
        // l=(long)(nums[nums.length-1]-nums[0])*k;
        // return l;
        // METHOD 2//
        int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max1=Math.max(max1,nums[i]);
            min1=Math.min(min1,nums[i]);
        }
        return (long)(max1-min1)*k;
    }
}