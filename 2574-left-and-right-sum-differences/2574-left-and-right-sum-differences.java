class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls[]=new int[nums.length];
        int rs[]=new int[nums.length];
        int ans[]=new int[nums.length];
        int lsum =0;
        for(int i=0;i<nums.length;i++){
            ls[i]=lsum;
            lsum+=nums[i];
            int rsum=0;
            for(int j=i+1;j<nums.length;j++){
                rs[i]+=nums[j];
            }
            //System.out.print(rs[i]+" ");
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(ls[i]-rs[i]);
        }

        return ans;
    }
}