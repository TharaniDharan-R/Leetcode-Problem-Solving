class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
       HashSet<Integer> hs = new HashSet<>();
       for(int i=0;i<nums.length;i++) {
        if(!hs.contains(nums[i])){    
        hs.add(nums[i]);
        nums[c++]=nums[i];
        }
       }
      return c;
    }
}