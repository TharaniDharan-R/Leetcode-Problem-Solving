// class Solution {
//     public int maximumProduct(int[] nums) {
//         int l=nums.length;
//         int[]a= new int[l];
        
//          int p=1;
//          for(int i=l-1;i>=0;i--){
//         //     p*=nums[i];
//          a[i]=(Math.abs(nums[i]));
//          }
//          Arrays.sort(a);
//          for(int i=1;i<=3;i++){
//         //     p*=nums[i];
//           p*=(a[l-i]);
//          }
       
//         return p;
//     }
// }
import java.util.*;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int case1 = nums[n-1] * nums[n-2] * nums[n-3];
       int case2 = nums[0] * nums[1] * nums[n-1];
       return Math.max(case1, case2);
       
    }
}
