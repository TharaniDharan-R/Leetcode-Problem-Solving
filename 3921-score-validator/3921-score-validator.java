class Solution {
    public int[] scoreValidator(String[] events) {
       // HashMap<Integer,Integer> hm= new HashMap<>();
        int s=0;
        int c=0;
        int a[]=new int[2];
        for(int i=0;i<events.length;i++){
            if(c>9)
            break;
            if(!events[i].equals("W") && !events[i].equals("WD") && !events[i].equals("NB")){
                s+=Integer.parseInt(events[i]);
            }
            if(events[i].equals("WD")||events[i].equals("NB")){
                s+=1;
            }
            if(events[i].equals("W"))
            c++;
        }
        
        a[0]=s;
        a[1]=c;
        return a;
    }
}