class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int ans[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int p=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             p*=nums[j];
        //         }
        //     }
        //     ans[i]=p;
        // }
        int ans[] = new int [nums.length];
        int n= nums.length;
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=right;
            right*=nums[i];
        }
        return ans;
    }
}
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n];

//         // Step 1: Store left products
//         ans[0] = 1;
//         for (int i = 1; i < n; i++) {
//             ans[i] = ans[i - 1] * nums[i - 1];
//         }

//         // Step 2: Multiply with right products
//         int right = 1;
//         for (int i = n - 1; i >= 0; i--) {
//             ans[i] = ans[i] * right;
//             right = right * nums[i];
//         }

//         return ans;
//     }
// }