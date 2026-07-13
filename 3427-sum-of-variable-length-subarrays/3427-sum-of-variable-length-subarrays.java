class Solution {
    public int subarraySum(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            int start =Math.max(0,i-nums[i]);
            for(int j=start;j<=i;j++){
                s+=nums[j];
            }
        }
        return s;
    }
}