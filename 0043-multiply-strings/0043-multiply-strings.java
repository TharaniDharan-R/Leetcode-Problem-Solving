class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")|| num2.equals("0"))
        return "0";
        int a= num1.length();
        int b= num2.length();
        int r[]=new int[a+b];
        for(int i=a-1;i>=0;i--){
            for(int j=b-1;j>=0;j--){
                int d1 =num1.charAt(i)-'0';
                int d2= num2.charAt(j)-'0';
                int product = d1*d2;
                int sum = product+r[i+j+1];
                r[i+j+1]=sum%10;
                r[i+j]+=sum/10;
            }
        }
        String ans="";
        for(int i:r){
            if(!(ans.length()==0 && i==0)){
            ans+=i;
            }
        }
        return ans;
    }
}