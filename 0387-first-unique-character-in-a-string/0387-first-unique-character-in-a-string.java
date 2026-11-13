class Solution {
    public int firstUniqChar(String s) {
         LinkedHashMap<Character,Integer>hm= new LinkedHashMap<>();
      for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
        hm.put(c,hm.getOrDefault(c,0)+1);
      }
      char copy=0;
      for(char i:hm.keySet()){
        if(hm.get(i)==1){
        copy=i;
        System.out.print(i);
        break;
        }
      }
      int ans=0;
      for(int i=0;i<s.length();i++){
        if(copy==s.charAt(i)){
            ans=i;
     return ans;
        
        }
      }
      return -1;
    }
}