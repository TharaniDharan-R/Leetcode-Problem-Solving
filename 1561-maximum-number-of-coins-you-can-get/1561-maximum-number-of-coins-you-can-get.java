class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int s=0;
        int i=0;
        
        int k=piles.length-2;
        while(i<k){
            s+=piles[k];
            k-=2;
            i++;
        }
        return s;
    }
}