class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{'|| c=='('||c=='['){
                st.push(c);
            }
            if(c=='}'||c==')'||c==']'){
                if(st.isEmpty())
            return false;
            char curr=st.pop();
            
            if(curr=='{'&& c!='}'|| curr=='(' && c!=')'|| curr=='[' && c!=']')
            return false;
            }
        }
            return st.isEmpty();
    }
}