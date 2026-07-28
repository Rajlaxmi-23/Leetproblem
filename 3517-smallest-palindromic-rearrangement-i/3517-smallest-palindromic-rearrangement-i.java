class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];
   
        for(char ch : s.toCharArray()){//count frequency
            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        String middle = "";

         //left half

         for(int i = 0 ; i < 26; i++){
            for(int j = 0; j < freq[i]/2; j++){
                left.append((char)('a' + i)); //ascii value ko con vert hoga a=97 i=0 so 97+0=97 o/p 'a'

            }
            if(freq[i] % 2 == 1){
                middle = String.valueOf((char)('a' + i));
            }
        }

        //Rifht half to reverse
        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + middle + right;
        
    }
}