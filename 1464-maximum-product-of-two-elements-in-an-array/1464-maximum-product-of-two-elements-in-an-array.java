class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for(int n : nums){
            if(n > max1){
                max2 = max1; // 1st max1 value assign to max2
                max1 = n;    // max1 is now empty then n value assign to max1
            }
            else if(n > max2){
                max2 = n;
            }
        }

        return ((max1 - 1)*(max2 - 1));
        
    }
}