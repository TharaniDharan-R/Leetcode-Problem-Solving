class Solution {
    public boolean checkValidString(String s) {
        char c[]=s.toCharArray();
        int n=c.length;
        int minopen =0;
        int maxopen=0;
        for(int i=0;i<n;i++){
            if(c[i]=='('){
                minopen++;
                maxopen++;
            }
            if(c[i]==')'){
                minopen--;
                maxopen --;
            }
            if(c[i]=='*'){
                minopen--;
                maxopen++;
            }
            if(maxopen <0){
                return false;
            }
            if(minopen < 0){
                minopen =0;
            }
        }
        return minopen==0;
    }
}