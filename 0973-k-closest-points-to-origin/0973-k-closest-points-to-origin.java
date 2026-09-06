class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        //create a maxHeap based on the distance from the origin
       
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
        (a, b) -> Integer.compare(
        b[0] * b[0] + b[1] * b[1],
        a[0] * a[0] + a[1] * a[1]
    )
);

        //add points to the heap, and remove the farthest point if the heap sixe exceed from k
        for(int[] p : points){
            maxHeap.add(p);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }

        }
        //collect the k closest point the heap
        int result [][]= new int[k][2] ;
        for(int i=0; i<k; i++){
            result[i]=maxHeap.poll();
        }
        return result;
    }
}