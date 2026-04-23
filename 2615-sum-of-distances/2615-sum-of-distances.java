// class Solution {
//     public long[] distance(int[] nums) {
//         long a[]=new long[nums.length];
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j] && j!=i){
//                     a[i]+=Math.abs(i-j);
//                 }
//             }
//         }
//         return a;
//     }
// }
import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];

        Map<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: group indices
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        // Step 2: process each group
        for (List<Integer> list : map.values()) {

            long sum = 0;

            // left side
            for (int i = 0; i < list.size(); i++) {
                int idx = list.get(i);
                res[idx] += (long) idx * i - sum;
                sum += idx;
            }

            // reset sum
            sum = 0;

            // right side
            for (int i = list.size() - 1; i >= 0; i--) {
                int idx = list.get(i);
                res[idx] += sum - (long) idx * (list.size() - 1 - i);
                sum += idx;
            }
        }

        return res;
    }
}