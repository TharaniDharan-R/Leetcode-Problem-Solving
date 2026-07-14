class Solution {
    public int minOperations(String[] logs) {
        int c=0;
        int n=logs.length;
        for(int i=0;i<n;i++){
            if(logs[i].equals("../"))
            c--;
            else if(logs[i].equals("./"))
            c=c;
            else
            c++;
            System.out.println(c);
        if(c<0)
        c=0;
        }
        return c;
    }
}