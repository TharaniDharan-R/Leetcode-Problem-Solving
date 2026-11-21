class Solution {
    public String digitSum(String s, int k) {
        StringBuilder c=new StringBuilder(s);
        while(c.length()>k){
            StringBuilder next=new StringBuilder(); 
            int c1=0;
            int sum=0;
            for(int i=0;i<c.length();i++){
                if(c1==k){
                    next.append(sum);

                    sum=0;
                    c1=0;
                }
            int n=c.charAt(i)-'0';
            sum+=n;
            c1++;
            }
            if(c1>0){
                next.append(sum);
            }
            c.setLength(0);
            c.append(next);

        }
        return c.toString();
    }
}