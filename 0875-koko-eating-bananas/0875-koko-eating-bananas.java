class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right = 1;
        for(int p : piles){
            right = Math.max(right, p);
        }

        while( left < right){
            int mid = (left+right)/2;
            if(canFinish(piles,mid,h)){
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static boolean canFinish(int[] piles , int speed, int h){
        int hour = 0;
        for(int p : piles){
            hour += Math.ceil((double)p / speed);
        }
        return hour <= h;
    }
}