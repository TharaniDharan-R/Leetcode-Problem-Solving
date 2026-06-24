class Solution {
    public int[] twoSum(int[] num, int target) {
//         // int ans[]=new int[2];
//         // int i=0;
//         // while(i<numbers.length-1){
//         //     for(int j=0;j<numbers.length;j++){
//         //         if((numbers[i]+numbers[j])==target){
//         //             ans[0]=i+1;
//         //             ans[1]=j+1;
//         //            return ans;  
//         //         }
//         //     }
//         //     i++;
//         // }
//         // return ans;
       // int ans[]=new int[2];
        int i=0;
        int j=num.length-1;
        while(i<j){
            int sum=num[i]+num[j];
            if(sum > target){
                j--;
            }
            else if(sum==target){
                // ans[0]=i+1;
                // ans[1]=j+1;
                return new int[]{i+1,j+1};
            }
            else
            i++;
        }
        return new int[]{};
    }
}
