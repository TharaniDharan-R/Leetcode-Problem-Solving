class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
        //int c=0;
            while(nums[i]>0){
                int d =nums[i]%10;
               // c++;
                nums[i]=nums[i]/10;
                if(d==digit)
                ans++;
            }
        }
        return ans;
    }
}