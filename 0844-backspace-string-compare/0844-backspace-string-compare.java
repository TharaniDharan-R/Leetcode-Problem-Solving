class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st= new Stack<>();
        Stack<Character> st1= new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && c=='#')
            st.pop();
            else if(c!='#')
            st.push(c);
        }
         for(char c:t.toCharArray()){
            if(!st1.isEmpty() && c=='#')
            st1.pop();
            else if(c!='#')
            st1.push(c);
        }
        if(st.equals(st1))
        return true;
        return false;
    }
}