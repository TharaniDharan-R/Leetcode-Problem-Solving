class Solution {
    public void merge(int[] n1, int m, int[] n2, int n)
    { int c=0;
        int a[]=new int[m+n];
        for(int i=0;i<m;i++)
        {
            a[i]=n1[i];
            c++;
        }
        
        for(int i=0;i<n;i++)
        {
            a[c]=n2[i];
            c++;
        }
        Arrays.sort(a);
        for(int i=0;i<m+n;i++)
        {
            n1[i]=a[i];
        }
    }
}