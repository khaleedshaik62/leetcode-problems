class Solution {
    public int maximumUnits(int[][] b, int t) {
        Arrays.sort(b, (a,c) -> c[1] - a[1]);

        int ans=0;
        for(int box[] : b){
            int boxes = Math.min(box[0],t);
            ans += boxes * box[1];
            t-=boxes;

            if(t==0) break;
        }
        return ans;
    }
}