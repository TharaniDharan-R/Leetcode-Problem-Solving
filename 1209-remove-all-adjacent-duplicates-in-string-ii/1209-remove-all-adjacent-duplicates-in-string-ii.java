class pair{
          char ch;
          int count;
          pair(char ch, int count){
            this.ch=ch;
            this.count =count;
          }

        }
    class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<pair> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(st.isEmpty()){
                st.push(new pair(c,1));
            }
            else if(!st.isEmpty() && st.peek().ch==c){
                st.peek().count++;
             if(st.peek().count==k){
                st.pop();
            }
            }
            else
            st.push(new pair(c,1));
        }
       StringBuilder sb= new StringBuilder();
       for(pair p:st){
        for(int i=0;i<p.count;i++){
       sb.append(p.ch);
        }
       
        
       }
       return sb.toString();
       
    }
}