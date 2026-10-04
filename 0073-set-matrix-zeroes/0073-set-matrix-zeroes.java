// class Solution {

//     public void setZeroes(int[][] matrix) {

//         int n = matrix.length;
//         int m = matrix[0].length;

        // // Mark rows and columns
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {

        //         if (matrix[i][j] == 0) {

        //             // Mark row
        //             for (int k = 0; k < m; k++) {
        //                 if (matrix[i][k] != 0) {
        //                     matrix[i][k] = -1;
        //                 }
        //             }

        //             // Mark column
        //             for (int k = 0; k < n; k++) {
        //                 if (matrix[k][j] != 0) {
        //                     matrix[k][j] = -1;
        //                 }
        //             }
        //         }
        //     }
        // }

        // // Convert -1 to 0
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (matrix[i][j] == -1) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        //OPTIMAL SOLUTION
        class Solution {

    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int col0 = 1;

        // STEP 1: Mark rows and columns
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == 0) {

                    // Mark the row
                    matrix[i][0] = 0;

                    // Mark the column
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // STEP 2: Set inner matrix elements to 0
        for (int i = 1; i < n; i++) {

            for (int j = 1; j < m; j++) {

                if (matrix[i][j] != 0) {

                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // STEP 3: Set first row to 0
        if (matrix[0][0] == 0) {

            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // STEP 4: Set first column to 0
        if (col0 == 0) {

            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}