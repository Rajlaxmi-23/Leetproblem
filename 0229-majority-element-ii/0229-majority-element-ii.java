class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        int n= nums.length;
        int min=n/3;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) == min+1){
                ls.add(nums[i]);

            }
            if(ls.size()==2){
                break;
            }

        }
        return ls;
    }
}