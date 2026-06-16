class Solution {
    public String convert(String s, int numRows) {
       if(numRows ==1 || s.length()<numRows){
        return s;
       } 
       StringBuilder [] row= new StringBuilder[numRows];
       for(int i=0;i<numRows;i++){
        row[i]=new StringBuilder();
       }
       int currentrow =0;
       boolean down=true;

       for(int i=0;i<s.length();i++){
        row[currentrow].append(s.charAt(i));
        if(currentrow ==0){
            down= true;
        }
        else if(currentrow == numRows-1){
            down =false;
        }
        if(down)
        currentrow++;
        else
        currentrow--;
       }
       StringBuilder ans=new StringBuilder();
       for(int i=0;i<numRows;i++){
        ans.append(row[i]);
       }
       return ans.toString();
    }
}