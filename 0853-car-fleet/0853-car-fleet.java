class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double [][] cars = new double[n][2]; //2D array one cars and subsequent time 

        for(int i = 0; i< n; i++){
            cars[i][0] = position[i]; // for position
            cars[i][1] = (double)(target - position[i])/ speed[i];// for time 
        }

        Arrays.sort(cars , (a,b) -> Double.compare(b[0],a[0])); // sort the given cars based on current position of the given car

        int fleet = 0;
        double prevTime = 0;
        for(double[] car: cars){
            if(car[1] > prevTime){
                fleet++;
                prevTime = car[1]; //car[1] last car came in
            }
        }

    return fleet;
        
    }
}