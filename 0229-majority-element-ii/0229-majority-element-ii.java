class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // List<Integer> ls = new ArrayList<>();
        // int n= nums.length;
        // int min=n/3;
        // for(int i=0;i<n;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        //     if(map.get(nums[i]) == min+1){
        //         ls.add(nums[i]);

        //     }
        //     if(ls.size()==2){
        //         break;
        //     }

        // }
        // return ls;

        int count1=0;
        int count2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=el2){
                count1=1;
                el1=nums[i];
            }
            else if(count2==0 && nums[i]!=el1){
                count2=1;
                el2=nums[i];
            }
            else if(el1==nums[i]){
                count1++;
            }
            else if(el2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> ls= new ArrayList<>();
        int cnt1=0,cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(el1==nums[i]){
                cnt1++;
            }
        
            if(el2==nums[i]){
                cnt2++;
            }
        }
            int min=(nums.length/3)+1;
            if(cnt1>=min){
                ls.add(el1);
            }
            if(cnt2>=min){
                ls.add(el2);
            }
           Collections.sort(ls);

        
        return ls;
    }
    // public void sort(int[] nums,int start,int end){
    //     start=0;
    //     end=nums.length-1;
    //     int i=0;
    //     while(start<=end){
    //         while(i<nums.length){

    //             if(nums[i]>nums[i+1]){
    //                 int temp=nums[i];
    //                 nums[i]=nums[i+1];
    //                 nums[i+1]=temp;

    //                 i++;
    //                 start++;
    //                 end--;

    //             }
    //         }

    //     }

    
}