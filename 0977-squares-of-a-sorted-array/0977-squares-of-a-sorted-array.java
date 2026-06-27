class Solution {
    public int[] sortedSquares(int[] nums) {
         int a[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //      a[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(a);
        // return a;
       
        // while(i<nums.length){
        //     a[i]=nums[i]*nums[i];
        //     i++;
        // }
        // Arrays.sort(a);
        // return a;
         int l=0;
         int r=nums.length-1;
         int index=nums.length-1;
         while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                a[index]=nums[l]*nums[l];
                index--;
                l++;
            }
            // else(Math.abs(nums[r])>Math.abs(nums[l])){
            else{
                a[index]=nums[r]*nums[r];
                index--;
                r--;
            }
            
         }
         return a;
    }
}