class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        for(int i=0;i<ob.length;i++){
            for(int j=0;j<ob[0].length;j++){
                if(ob[i][j]==0){
                ob[i][j]=1;
                }
                else
                ob[i][j]=0;
            }
        }
        int n= ob[0].length;
        int m= ob.length;
        if(ob[ob.length-1][ob[0].length-1]==0){
            return 0;
        }
         for(int j = ob[0].length-2; j >= 0; j--) {
            ob[m-1][j] = ob[m-1][j] * ob[m-1][j+1];
        }

        // Last column
        for(int i = ob.length-2; i >= 0; i--) {
            ob[i][n-1] = ob[i][n-1] * ob[i+1][n-1];
        }
        for(int i=ob.length-2;i>=0;i--){
            for(int j=ob[0].length-2;j>=0;j--){
                if(ob[i][j]!=0){
                ob[i][j]=ob[i][j+1]+ob[i+1][j];
                }
            }
        }
        return ob[0][0];
    }
}