class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int c=0;
        int len=0;
        for(int n : nums){
            if(n==1) c++;

            else{
                len=Math.max(len,c);
                c=0;
            } 
        }
        len=Math.max(len,c);
        return len;
    }
}