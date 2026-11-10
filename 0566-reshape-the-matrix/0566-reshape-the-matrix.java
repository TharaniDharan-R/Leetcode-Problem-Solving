class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length *mat[0].length != r*c){
            return mat;
        }
        int ans[][]=new int[r][c];
            
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int index= i*c+j;
                int oldRow=index/mat[0].length;
                int oldCol=index%mat[0].length;
                ans[i][j]=mat[oldRow][oldCol];
            }
        }
        return ans;
      
        
    }
}