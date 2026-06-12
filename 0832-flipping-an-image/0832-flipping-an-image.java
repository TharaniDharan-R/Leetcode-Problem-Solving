class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int ans [][]=new int[n][n];
        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;
            while(l<r){
                int temp =image[i][l];
                image[i][l]= image[i][r];
                image[i][r]=temp;
                l++;
                r--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(image[i][j]==0){
                    ans[i][j]=1;
                }
                else{
                    ans[i][j]=0;
                }
            }
        }
        return ans;
    }
}