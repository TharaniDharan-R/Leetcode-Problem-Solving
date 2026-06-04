class Solution {
    public void moveZeroes(int[] nums) {
        int s[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i]=nums[i];
        }
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(s[i]!=0){
            nums[k]=s[i];
            k++;
        }
        }
        for(int i=k;i<nums.length;i++){
            nums[i]=0;
            
        }
    }
}