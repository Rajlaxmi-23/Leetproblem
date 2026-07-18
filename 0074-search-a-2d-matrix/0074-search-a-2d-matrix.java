class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m*n -1;

        while(left <= right){
            int mid = left +(right-left)/2;//find the mid pointer
            int midvalue = matrix[mid / n][mid % n];//point that mid value in 2d array

            if(midvalue > target){
                right = mid-1;

            }
            else if(midvalue < target){
                left = mid + 1;
            }
            else{
                return true;
            }
        }

        return false;
    }
}