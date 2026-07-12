class Solution {
    public int[] arrayRankTransform(int[] arr) {
       // int ans [] = new int[arr.length];
        int ans1 [] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans1[i]= arr[i];
            
        }
        Arrays.sort(ans1);
        TreeSet <Integer> ts=new TreeSet<>();


        TreeMap<Integer,Integer>hm= new TreeMap<>();
        for(int i=0;i<ans1.length;i++){
            ts.add(ans1[i]);
        }
        int c=1;
        for(int i:ts){
            
            hm.put(i,c++);
        }
        for(int j=0;j<arr.length;j++){
            if(hm.containsKey(arr[j])){
                ans1[j]=hm.get(arr[j]);
            }
        }
        return ans1;
    }
}