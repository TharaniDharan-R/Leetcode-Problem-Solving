class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int ans[] =new int[nums.length];
        int p=0;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i:nums){
            int c=hm.getOrDefault(i,0);
            if(c<k){
                ans[p++]=i;
                hm.put(i,c+1);
            }
        }
        return Arrays.copyOf(ans,p);
    }
}