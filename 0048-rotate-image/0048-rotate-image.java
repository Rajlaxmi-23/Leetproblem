class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;//row size
        int m=matrix[0].length;//col size

        // int ans[][]=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         ans[j][n-1-i]=matrix[i][j];
        //     }
        // }

        // //copy the ans element ro matrix back because void used
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         matrix[i][j]= ans[i][j];
        //     }
        // }
        
        //OPTIMAL APPROCH
        for(int i=0;i<n;i++ ){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverseRow(matrix[i]);
        }
    
    }
    public void reverseRow(int matrix[]){
        int start=0;
        int end=matrix.length-1;
        while(start<end){
            int temp=matrix[start];
            matrix[start]=matrix[end];
            matrix[end]=temp;
            start++;
            end--;
        }

    }
}