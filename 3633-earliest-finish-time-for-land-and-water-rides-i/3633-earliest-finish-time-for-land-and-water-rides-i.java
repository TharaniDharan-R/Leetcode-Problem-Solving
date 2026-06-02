class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans= Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int sl=landStartTime[i]+landDuration[i];
                int wl = Math.max(sl,waterStartTime[j]);
                int r1=wl+waterDuration[j];

                int wll=waterStartTime[j]+waterDuration[j];
                int sll= Math.max(wll,landStartTime[i]);
                int r2 = sll+landDuration[i];
            ans = Math.min(ans,Math.min(r1,r2));
            }
        }
        return ans;
    }
}