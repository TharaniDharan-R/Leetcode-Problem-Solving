class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer>hm=new HashMap<>();
        int co=0;
        int k=0;
        char ch[]=word.toCharArray();
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if(i<=7){
                hm.put(c,hm.getOrDefault(c,0)+1);
                k++;
            }
            if(i>7&& i<=15){
                 hm.put(c,hm.getOrDefault(c,0)+2);
                k++;
            }
            if(i>15 && i<=23){
                 hm.put(c,hm.getOrDefault(c,0)+3);
                k++;
            }
            if(i>23){
                 hm.put(c,hm.getOrDefault(c,0)+4);
                k++;
            }
        }
        for(int i:hm.values()){
            co+=i;
        }
        return co;
    }
}