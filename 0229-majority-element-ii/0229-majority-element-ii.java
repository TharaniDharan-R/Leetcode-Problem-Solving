class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> al=new ArrayList<>();
        
        int k=nums.length/3;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet()){
            if(hm.get(i)>k){
                al.add(i);
            }
        }
        return al;
    }
}