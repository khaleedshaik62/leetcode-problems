class Solution {
    public int maxArea(int[] height) {
        int max=0;

        int l = 0;
        int r = height.length-1;

        while(l<r){
            int cap = Math.min(height[l],height[r]) * (r-l);

            max = Math.max(max,cap);

            if(height[l]<height[r]){
                l++;
            }
            else r--;
        }

        return max;
    }
}