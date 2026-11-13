
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count frequency
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        // Store elements in ArrayList
        ArrayList<Integer> list = new ArrayList<>(hm.keySet());

        // Sort based on frequency (descending)
        Collections.sort(list, (a, b) -> hm.get(b) - hm.get(a));

        // Get top K elements
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
