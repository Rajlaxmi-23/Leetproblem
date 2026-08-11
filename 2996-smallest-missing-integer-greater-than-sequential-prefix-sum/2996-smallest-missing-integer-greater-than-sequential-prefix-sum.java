class Solution {
    public int missingInteger(int[] nums) {
       int n = nums.length;

       //find lonfest sequential prefix sum
       int sum = nums[0];
       int i = 1;
       while(i < n && nums[i] == nums[i - 1]+1){
        sum += nums[i];
        i++;
       }

       // find smallest x >= sum not present in nums
       Set<Integer> set = new HashSet<>();
       for(int num : nums){
        set.add(num);

       }
       while(set.contains(sum)){
        sum++;
       }
       return sum;
}
}