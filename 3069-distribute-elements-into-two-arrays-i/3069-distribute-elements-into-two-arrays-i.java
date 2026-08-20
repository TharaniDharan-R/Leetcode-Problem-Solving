class Solution {
    public int[] resultArray(int[] nums) {
        int a1[]=new int[nums.length];
        int a2[]=new int[nums.length];
        int ans[]=new int[nums.length];
        int c1=1;
        int c2=1;
        int c=0;
        a1[0]=nums[0];
        a2[0]=nums[1];
        for(int i=2;i<nums.length;i++){
            if(a1[c1-1]>a2[c2-1]){
                a1[c1++]=nums[i];   
            }
            else
                a2[c2++]=nums[i];            
            // if(nums[i]<ans[i-1]){
            //     ans[c++]=nums[i];
            // }
            // else
            // ans[c++]=nums[i];
        }
        for(int i=0;i<c1;i++){
            ans[c++]=a1[i];
        }
        for(int i=0;i<c2;i++){
            ans[c++]=a2[i];
        }
        return ans;
    }
}