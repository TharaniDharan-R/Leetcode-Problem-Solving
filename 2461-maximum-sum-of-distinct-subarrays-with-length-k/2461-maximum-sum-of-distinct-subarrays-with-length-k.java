///OPTIMAL///
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long maxSum = 0;

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            sum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            if (j - i + 1 > k) {

                sum -= nums[i];

                map.put(nums[i], map.get(nums[i]) - 1);

                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }

                i++;
            }

            if (j - i + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}

// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         int i = 0;
//         int j = k - 1;
//         long maxsum = 0;
//         while (j < nums.length) {
//             HashSet<Integer> hs = new HashSet<>();
//             long sum = 0;
//             for (int q = i; q <= j; q++) {
//                 hs.add(nums[q]);
//                 sum += nums[q];
//             }
//             if (hs.size() == k) {
//                 maxsum = Math.max(maxsum, sum);
//             }
//             i++;
//             j++;
//         }
//         return maxsum;
//     }
// }