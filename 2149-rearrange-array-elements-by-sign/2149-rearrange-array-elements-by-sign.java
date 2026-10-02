class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int pos[]=new int[n/2];
        int neg[]= new int[n/2];
        int pc=0;
        int nc=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[pc++]=nums[i];
            }else{
                neg[nc++]=nums[i];
            }
        }for(int i=0;i<n/2;i++){
            nums[2*i]=pos[i];
            nums[2*i+1]=neg[i];
        }
        return nums;
    }
}