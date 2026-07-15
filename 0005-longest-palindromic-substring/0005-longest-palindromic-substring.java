class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        int ci=0;
        String s1="#";
        for(int i=0;i<s.length();i++)
        {
            s1+=s.charAt(i)+"#";
        }
        int p[]=new int[s1.length()];

        for(int i=0;i<p.length;i++)
        {
            int l=i-1;
            int r=i+1;
            while(l>=0&&r<s1.length()&&s1.charAt(l)==s1.charAt(r))
            {
                p[i]++;
                l--;
                r++;
            }
            if(p[i]>max)
            {
                max=p[i];
                ci=i;
            }
 
        }
        int start=(ci-max)/2;
        return s.substring(start,start+max);
    }
}