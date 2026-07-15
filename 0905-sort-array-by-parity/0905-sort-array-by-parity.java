class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]=new int[nums.length];
        int odd[]=new int [nums.length];
        int c=0;
        int d=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
            ans[c++]=nums[i];
            else
            odd[d++]=nums[i];
        }
        int s=c;
        for(int i=0;i<nums.length-s;i++){
            ans[c++]=odd[i];
        }
        return ans;
    }
}