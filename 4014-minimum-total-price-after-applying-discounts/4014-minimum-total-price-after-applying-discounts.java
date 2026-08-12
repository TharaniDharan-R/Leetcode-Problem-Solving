class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double d=0;
        int k=1;
        int c=0;
       // if(discounts.length<prices.length){
        for(int i=discounts.length-1;i>=0;i--){
            for(int j=prices.length-k;j>=0;j--){
                System.out.println(prices[j]+" "+discounts[i]);
                d+=(double)prices[j]*(100-discounts[i])/100;
                k++;
                c++;
                break;
            }
        }
        for(int i=prices.length-c-1;i>=0;i--){
            System.out.print(prices[i]);
            d+=prices[i];
            
        }
        //}
        // else{
        // for(int i=discounts.length-1;i>=0;i--){
        //     for(int j=prices.length-k;j>=0;j--){
        //        // System.out.println(prices[i]+" "+discounts[j]);
        //         d+=(double)discounts[i]*(100-prices[j])/100;
        //         k++;
        //         break;
        //     }
        // }
        // }
        return d;

    }
}