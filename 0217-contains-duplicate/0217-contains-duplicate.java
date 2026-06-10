class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     if(nums[i]==nums[i+1])
        //      return true;
        // }
        // // return false;
        // HashSet<Integer> set=new HashSet<>();
        // for(int i:nums){
        //     set.add(i);
        // } 
        // //System.out.print(set);
        // if(set.size()==nums.length)
        // return false;
        // return true;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(hm.get(i)>1)
            return true;
        }
        return false;
    }
}