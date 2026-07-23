class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();

        for (int n : nums) {
            numSet.add(n);
        }

        int longest = 0;

        for (int n : numSet) {

            // Start only if n is the first element of a sequence
            if (!numSet.contains(n - 1)) {

                int current = n;
                int length = 1;

                while (numSet.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}