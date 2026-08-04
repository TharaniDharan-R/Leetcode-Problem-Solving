class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer>ls=new ArrayList<>();
        int p=0;
        for(int i=nums[0];i<=nums[n-1];i++){
            ls.add(i);
        }
        for(int i=0;i<nums.length;i++){
           if(ls.contains(nums[i])){
            ls.remove(Integer.valueOf(nums[i]));
           }
        }
        return ls;

    }
}