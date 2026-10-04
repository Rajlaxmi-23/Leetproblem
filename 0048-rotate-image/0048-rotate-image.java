class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;//row size
        int m=matrix[0].length;//col size

        int ans[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][n-1-i]=matrix[i][j];
            }
        }

        //copy the ans element ro matrix back because void used
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]= ans[i][j];
            }
        }
        
    
    }
}