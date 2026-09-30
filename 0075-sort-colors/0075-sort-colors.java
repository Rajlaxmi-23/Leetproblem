class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high = nums.length-1;
        int mid = 0 ;

        while(mid<= high){
            if(nums[mid] == 0){
                // if the current element is 0 (red) swap it with the element is low 
                //and move both current and low one step forward
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                 // if the current element is 2 (blue) swap it with the element is high
                //and move high  one step backward
                //Note: We donot move current forward in this case because the swapped
                //element from high could be 0 and we need to precess it in the next iteration
                swap(nums,mid,high);
                high--;
            }
            else{
                //If the current element is 1(white) just move current one step forward
                mid++;
            }
        }
    }
        public void swap(int[] nums, int i , int j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        
        
    }
}