class Solution {
    public int findMiddleIndex(int[] nums) {
        ArrayList<Integer> al= new ArrayList<>();
        int ts=nums[0];
        al.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            al.add(nums[i]+al.get(i-1));
            ts+=nums[i];
        }
        int ls=0;
        for(int i=0;i<nums.length;i++){
            if(i==0)
            ls=0;
            else
            ls=al.get(i-1);
           int rs=ts-al.get(i);
            if(ls==rs){
                return i;
            }
        }
        return -1;
    }
}