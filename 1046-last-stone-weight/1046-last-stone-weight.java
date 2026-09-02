class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>( (a,b)-> b - a); //create a max heap

        //add all stones to the heap
        for(int s: stones){
            maxHeap.add(s);
        }

        //continuously remove and smash the two heaviest stones
        while(maxHeap.size() >1){
            int y= maxHeap.poll(); //the heaviest stone
            int x= maxHeap.poll(); //the 2nd heaviest stone

            if(x != y){
                maxHeap.add(y-x);//add the remaining stone back to the heap
            }
        }

        //return the weight of the last remaining stone or 0 if no stones are left
        return maxHeap.isEmpty()? 0 : maxHeap.poll();

        
    }
}