class Solution {
    public double findMaxAverage(int[] nums, int k) {
      double avg=Double.MIN_VALUE;
      int maxsum=Integer.MIN_VALUE;
      for(int i=0;i<=nums.length-k;i++){
        int s=0;
        for(int j=i;j<=i+k-1;j++){
           s+=nums[j]; 
        }
        if(s>maxsum){
            maxsum=s;
        }
       
      }
      avg= (double)maxsum/k;
      return avg;
    }
}