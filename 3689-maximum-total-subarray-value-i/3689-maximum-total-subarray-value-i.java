class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long l=0;
        Arrays.sort(nums);
        l=(long)(nums[nums.length-1]-nums[0])*k;
        return l;
    }
}