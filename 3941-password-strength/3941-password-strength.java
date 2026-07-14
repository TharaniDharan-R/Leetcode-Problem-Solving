class Solution {
    public int passwordStrength(String password) {
        int s=0;
        HashSet<Character> hs= new HashSet<>();
        for(char c:password.toCharArray()){
            hs.add(c);
        }
        for(char c: hs){
            if(c>='a' && c<='z')
            s+=1;
            if(c>='A' && c<='Z')
            s+=2;
            if(c>='0' && c<='9')
            s+=3;
            if(c=='!' || c=='@'|| c=='#'|| c=='$')
            s+=5;
        }
        return s;
    }
}