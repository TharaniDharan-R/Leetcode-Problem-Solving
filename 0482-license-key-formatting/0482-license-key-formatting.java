class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder str = new StringBuilder();
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='-')
            str.append((Character.toUpperCase(s.charAt(i))));
            
        }
        int c=0;
        for(int i=str.length()-1;i>=0;i--){   
         ans.append(str.charAt(i));
         c++;
         if(c==k && i!=0){
            ans.append("-");
            c=0;
         }
        }
        
        return ans.reverse().toString();
    }
}