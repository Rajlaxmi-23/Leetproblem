class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k=k%n;
        //push kth character to temp
        int []temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i]=nums[n-k+i];
        }

       // Shift remaining elements to the right
    for (int i = n - k - 1; i >= 0; i--) {
        nums[i + k] = nums[i];
    }

    // Put temp elements at the beginning
    for (int i = 0; i < k; i++) {
        nums[i] = temp[i];
    }
    }
}