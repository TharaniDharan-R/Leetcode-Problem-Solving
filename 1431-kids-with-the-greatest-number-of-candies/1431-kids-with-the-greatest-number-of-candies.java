class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        List<Boolean> b= new ArrayList<>();
        int d[]=new int[candies.length];
        for(int i=0;i<d.length;i++){
            d[i]=candies[i];
        }
        Arrays.sort(candies);
        int l=candies[d.length-1];
        for(int i=0;i<d.length;i++){
            if((d[i]+e)>=l){
                b.add(true);
            }
            else
            b.add(false);
        }
      
        return b;
    }
}