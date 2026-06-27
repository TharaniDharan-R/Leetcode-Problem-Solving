// // class Solution {
// //     public int maxProduct(int[] nums) {
// //         int max=Integer.MIN_VALUE;
// //         for(int i=0;i<nums.length;i++){
// //             for(int j=i;j<nums.length;j++){
// //                   int val=1;
// //                 for(int k=i;k<=j;k++){
// //                     val*=nums[k];
// //                 }
// //                 max=Math.max(max,val);
// //             }
// //         }
// //         return max;
// //     }
// // }
// // class Solution {
// //     public int maxProduct(int[] nums) {

// //         int max = Integer.MIN_VALUE;

// //         for(int i = 0; i < nums.length; i++){
            
// //             int product = 1;

// //             for(int j = i; j < nums.length; j++){
// //                 product *= nums[j];
// //                 max = Math.max(max, product);
// //             }
// //         }

// //         return max;
// //     }
// // }
class Solution {
    public int maxProduct(int[] nums) {

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++){

            if(nums[i] < 0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            result = Math.max(result, maxProd);
        }

        return result;
    }
}
// class Solution {
//     public int maxProduct(int[] nums) {
//       	int n = nums.length;
//         int maxProd = nums[0];

//         for (int i = 0; i < n; i++) {
//             int mul = 1;
//             for (int j = i; j < n; j++) {
//                 mul *= nums[j];
//                 maxProd = Math.max(maxProd, mul);
//             }
//         }
//         return maxProd;
//     }

// }