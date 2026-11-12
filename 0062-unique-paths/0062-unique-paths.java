class Solution {
    public int uniquePaths(int m, int n) {
        int mat [][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=1;
            }
        }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                mat[i][j]=mat[i][j+1]+mat[i+1][j];
            }
        }
        return mat[0][0];


    }
}