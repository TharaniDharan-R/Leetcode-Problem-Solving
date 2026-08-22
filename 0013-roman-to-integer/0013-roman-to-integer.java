class Solution {
    public int romanToInt(String s) {
        int a=0;
        int b=0;
        for(int i=s.length()-1;i>=0;i--){
            int n=0;
            switch(s.charAt(i)){
            case 'I':
            n+=1; break;
            case 'V':
            n+=5; break;
            case 'X':
            n+=10; break;
            case 'L':
            n+=50; break;
            case 'C':
            n+=100; break;
            case 'D':
            n+=500; break;
            case 'M':
            n+=1000; break;
            }
            if(n<b){
                a=a-n;
            }
            else{
                a=a+n;
            }
            b=n;
        }
        return a;
    }
}