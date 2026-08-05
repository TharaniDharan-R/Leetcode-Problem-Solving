class Solution {
    public int firstMissingPositive(int[] nums) {
        // List<Integer>ls= new ArrayList <>();
        // for(int i: nums){
        //     ls.add(i);
        // }
        // int ans=0;
        // for(int i=1;i<nums.length+1;i++){
        //     if(!ls.contains(i)){
        //     return i;
        //     }
        // }
        // return (nums.length+1);
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        int ans = 1;
        while (set.contains(ans)) {
            ans++;
        }

        return ans;
    

    }
}