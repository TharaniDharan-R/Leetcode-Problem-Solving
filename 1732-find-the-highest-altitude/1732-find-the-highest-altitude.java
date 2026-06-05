class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int a[]=new int[n+1];
        a[0]=0;
        int p=1;
        for(int i=0;i<n;i++){
            a[p]=a[p-1]+gain[i];
            p++;
        }
        Arrays.sort(a);
        
        return a[n];
    }
}