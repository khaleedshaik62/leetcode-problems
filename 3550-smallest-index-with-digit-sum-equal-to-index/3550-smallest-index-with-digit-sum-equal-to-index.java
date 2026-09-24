class Solution {

    public static int sum(int n){
        int res=0;
        while(n>0){
            res = res+(n%10);
            n /= 10;
        }
        return res;
    }

    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int s = sum(nums[i]);
            if(i==s) return i; 
        }
        return -1;
    }
}