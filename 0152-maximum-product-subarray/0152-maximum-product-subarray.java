class Solution {
    public int maxProduct(int[] nums) {

        // BRUTEFORCE APPROACH

        // int max=0;
        // int n=nums.length;
        // if(n<=1){
        //     return nums[0];
        // }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         int product=1;
        //         for(int k=i;k<=j;k++){
        //             product*=nums[k];


        //         }
        //         max= Math.max(max,product);
        //     }
        // }
        // return max;

        // OPTIMAL APPROACH

       
        int ans=0;
        int n=nums.length;

        if(n<=1){
            return nums[0];
        }
        int pre=1;
        int suff=1;
        for(int i=0;i<n;i++){
            if(pre==0) pre=1;
            if(suff==0)suff=1;

            pre*=nums[i];
            suff*=nums[n-i-1];
            ans=Math.max(ans,Math.max(pre,suff));

        }
        return ans;
    }
}