class Solution {
    // public static int[] insertionsort(int [] a){
    //     for(int i=1;i<a.length;i++){
    //         int temp =a[i];
    //         int j=i-1;
    //         while(j>=0 && a[j]>temp){
    //             a[j+1]=a[j];
    //             j--;
    //         }
    //         a[j+1]=temp;
    //     }
    //     return a;
    // } 
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        System.out.print(Arrays.toString(piles));
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