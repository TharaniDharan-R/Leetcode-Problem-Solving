class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int maxlen =0;
        for(int num:nums){
            hs.add(num);
        }
        for(int num:hs){
            if(!hs.contains(num-1)){
                int current =num;
                int c=1;
            
            while(hs.contains(current+1)){
                current++;
                c++;
            }
            maxlen =Math.max(maxlen,c);      
             }
        }
        return maxlen;
    }
}