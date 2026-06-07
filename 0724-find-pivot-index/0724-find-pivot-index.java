class Solution {
    public int pivotIndex(int[] nums) {
        ArrayList<Integer> total= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==0){
                total.add(nums[i]);
            }
            else
            total.add(nums[i]+total.get(i-1));
        }
        int ts= total.get(total.size()-1);
        int ls =0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ls=0;
            }
            else{
            ls =total.get(i-1);
            }
            int rs= ts - total.get(i);
            if(ls==rs){
                return i;
            }
        }
       return -1;
    }
}