class Solution {
    public String largestEven(String s) {
        int n=s.length();
        StringBuilder sb= new StringBuilder();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='2'){
                for(int j=0;j<=i;j++){
                    sb.append(s.charAt(j));
                  //  System.out.print(s.charAt(j));
                }
                break;
            }
        }
        return sb.toString();
    }
}