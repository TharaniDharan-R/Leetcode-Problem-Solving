class Solution {
    public void rotate(int[] nums, int k) {
        // int n=nums.length;
        // int r[]=new int[n];
        // k=k%n;
        // for(int i=0;i<k;i++){
        //         r[i]=nums[n-k+i];
        //     }
        //     for(int j=0;j<n-k;j++){
        //         r[j+k]=nums[j];   
        //     }
        //     for(int i=0;i<r.length;i++){
        //         nums[i]=r[i];
        //     }

         int n= nums.length;
         int a[] =new int[n];  
         for(int i=0;i<n;i++){
            a[i]=nums[i];
         }
         k=k%n;
         for(int i=0;i<n;i++){
            nums[(i+k)%n]=a[i];
         } 
        // return a;
    }
}