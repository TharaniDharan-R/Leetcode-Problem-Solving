class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int s=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
               int l=j-i+1;
                if(l%2!=0){
                    for(int k=i;k<=j;k++){
                        //System.out.print(arr[k]);
                        //q=a[i]
                        s+=arr[k];
                    }
                }
                    //System.out.println();
            }
        }
        return s;
    }
}