class Solution {
    public int wateringPlants(int[] plants, int c) {
        int n = plants.length;
        int temp=c;
        int steps = 0;

        for(int i=0;i<n;i++){
            if(plants[i]>c){
                steps += 2*i;
                 c = temp;
            }
            steps++;
            c -= plants[i];
        }
        return steps;
    }
}