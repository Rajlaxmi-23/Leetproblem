class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high = nums.length-1;
        int cur = 0 ;

        while(cur<= high){
            if(nums[cur] == 0){
                // if the current element is 0 (red) swap it with the element is low 
                //and move both current and low one step forward
                swap(nums,cur,low);
                low++;
                cur++;
            }
            else if(nums[cur] == 2){
                 // if the current element is 2 (blue) swap it with the element is high
                //and move high  one step backward
                //Note: We donot move current forward in this case because the swapped
                //element from high could be 0 and we need to precess it in the next iteration
                swap(nums,cur,high);
                high--;
            }
            else{
                //If the current element is 1(white) just move current one step forward
                cur++;
            }
        }
    }
        public void swap(int[] nums, int i , int j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        
        
    }
}