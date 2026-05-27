class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0;
        String sc="";
        for(int i=0;i<sentences.length;i++){
            String se=sentences[i];
            String[]s=se.split(" "); 

            if(c<s.length){
            c=s.length;
            sc=se;
            }
        }
        System.out.println(sc);
        return c;
    }
    
}