class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[] = new int[nums.length*2];
        int c=0;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            c++;
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[c]=nums[i];
            c++;
        }
        return ans;
    }
}