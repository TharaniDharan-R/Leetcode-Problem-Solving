class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
    HashMap<Integer,Integer>hm= new HashMap<>();
       int left=0;
       int maxlen=0;
       for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        while(hm.get(nums[i])>k){
            hm.put(nums[left],hm.get(nums[left])-1);
            left++;
        }
        maxlen=Math.max(maxlen,i-left+1);
       }
       return maxlen;
    //     int maxlen=0;
    //    for(int i=0;i<nums.length;i++){
    //     HashMap<Integer,Integer> hm= new HashMap<>();
    //     for(int j=i;j<nums.length;j++){
    //         hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
    //         if(hm.get(nums[j])>k)
    //         break;
    //     maxlen=Math.max(maxlen,j-i+1);
    //     }

    //    } 
    //    return maxlen;
      
    }
}