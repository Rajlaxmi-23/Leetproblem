class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n= nums.length;
        int low=1;
        int high=0;

        for(int i=0;i<n;i++){
            high=Math.max(high,nums[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;

            if(sumByD(nums,mid)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int sumByD(int[] arr, int div){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/(double)div);
        }
        return sum;
    }
}