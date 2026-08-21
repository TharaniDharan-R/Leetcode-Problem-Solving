class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                a[i][j]=matrix[n-1-j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                matrix[i][j]=a[i][j];
               System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}