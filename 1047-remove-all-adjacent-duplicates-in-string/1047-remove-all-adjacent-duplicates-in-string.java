class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
       /// String ans="";
        // for( char c: s.toCharArray()){
        //     st.push(c);
        //     if(st.peek()==c){
        //         st.pop();
        //     }
       // st.push(s.charAt(0));
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty() && st.peek()==c)
            st.pop();
            else
            st.push(c);
        }
            
            
        StringBuilder sb= new StringBuilder();
        for(char c:st)
        sb.append(c);
        
        return sb.toString();
        }
    }
