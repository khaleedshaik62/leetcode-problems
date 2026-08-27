class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;

        int max=0;

        while(l<r){
            int width = Math.min(height[l],height[r])*(r-l);

            max = Math.max(max,width);

            if(height[l]<=height[r])    l++;
            else    r--;
        }
        return max;
    }
}