class Solution {
    public void rotate(int[] nums, int k) {
        
        if(nums.length==1) return;
        k=k%nums.length;

        helper(nums,0,nums.length-1);
        helper(nums,0,k-1);
        helper(nums,k,nums.length-1);
        
    }

    static void helper(int nums[],int l, int r){

        while(l<r){

            nums[l] = nums[l]^nums[r];
            nums[r] = nums[l]^nums[r];
            nums[l] = nums[l]^nums[r];

            l++;
            r--;
        }
    }
}