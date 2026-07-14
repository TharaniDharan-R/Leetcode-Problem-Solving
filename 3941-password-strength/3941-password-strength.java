class Solution {
    public int passwordStrength(String password) {
        int s=0;
        HashSet<Character> hs= new HashSet<>();
        for(char c:password.toCharArray()){
            hs.add(c);
        }
        for(char c: hs){
            if(c-'a'>=0 && c-'a'<=25)
            s+=1;
            if(c-'A'>=0 && c-'A'<=25)
            s+=2;
            if(c-'0'>=0 && c-'0'<=9)
            s+=3;
            if(c=='!' || c=='@'|| c=='#'|| c=='$')
            s+=5;
        }
        return s;
    }
}