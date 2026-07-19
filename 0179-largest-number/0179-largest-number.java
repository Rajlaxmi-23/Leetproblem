class Solution {
    public String largestNumber(int[] nums) {
        // first create a string size of nums and all elements of nums convert to string 
        String[] aString = new String[nums.length];
        for(int i = 0 ; i<nums.length; i++){
            aString[i] = String.valueOf(nums[i]);
        }

        //sort strings according to custom comparator
        Arrays.sort(aString , new Comparator<String>(){
            public int compare(String a , String b){
                String order1 = a+b;
                String order2 = b+a;
                return order2.compareTo(order1);
            }
        });

        //if after being sorted, the largest number is '0' ,the entire string become 0
        if(aString[0].equals("0")){
            return "0";
        } 

        //Build largest number from sorted array
        StringBuilder largestNumber = new StringBuilder();
        for(String numAsString : aString){
            largestNumber.append(numAsString);
        }

        return largestNumber.toString();
    }
}