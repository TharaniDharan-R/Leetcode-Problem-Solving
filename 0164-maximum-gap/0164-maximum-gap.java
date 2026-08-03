class Solution {
    public int maximumGap(int[] nums) {
        int Max=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            Max=Math.max(Max,nums[i]-nums[i-1]);
        }
        return Max;
    }
}