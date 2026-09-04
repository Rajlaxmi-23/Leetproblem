class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int n : nums){
            minHeap.add(n);
           
           if(minHeap.size() > k){
            minHeap.poll(); // remove the smallest element to maintain the heap size as k
           }
        }
        return minHeap.peek();//return the root of the min heap which is kth largest element
    }
}