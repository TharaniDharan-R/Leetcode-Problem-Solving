class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int c=0;
        int ans[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            c=0;
            for(int j=0;j<=i;j++){
               for(int k=0;k<=i;k++){
                if(a[j]==b[k]){
                    c++;
                }
                ans[i]=c;
               }
            }
        }
        return ans;
    }
}