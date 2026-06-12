class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int l=0;
        int r=nums.length-1;
        int max= Integer.MIN_VALUE;
        while(l<r){
            sum=nums[l]+nums[r];
            r--;
            l++;
            max=Math.max(max,sum);
            
            
        }
       
        return max;
    }
}