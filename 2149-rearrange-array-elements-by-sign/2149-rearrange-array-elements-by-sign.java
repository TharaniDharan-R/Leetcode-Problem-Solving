class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans []=new int[nums.length];
        int p[]=new int[nums.length/2];
        int n[]=new int[nums.length/2];
        int q=0;
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                p[q]=nums[i];
                q++;
            }
            else{
                n[r]=nums[i];
                r++;
            }
        }
            q=0;
            r=0;
            for(int i=0;i<nums.length;i+=2){
                ans[i]=p[q];
                q++;
                ans[i+1]=n[r];
                r++;
            }
            return ans;
        
    }
}