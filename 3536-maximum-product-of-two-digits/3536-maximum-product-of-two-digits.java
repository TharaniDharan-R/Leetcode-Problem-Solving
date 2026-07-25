class Solution {
    public int maxProduct(int n) {
      String s=String.valueOf(n);
      char ch[]=s.toCharArray();
      int a[]=new int[s.length()];
      for(int i=0;i<ch.length;i++){
        a[i]=ch[i]-'0';
      }
      Arrays.sort(a);
      return a[a.length-2]*a[a.length-1];
     // return 1;

    }
}