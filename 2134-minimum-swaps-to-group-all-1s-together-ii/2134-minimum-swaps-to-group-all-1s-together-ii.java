class Solution {
    public int minSwaps(int[] nums) {

        int n = nums.length;

        // Count 1s
        int ones = 0;

        for (int num : nums) {
            if (num == 1) {
                ones++;
            }
        }

        // Initial window
        int zeros = 0;

        for (int i = 0; i < ones; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
        }

        int answer = zeros;

        // Sliding window
        for (int i = ones; i < n + ones; i++) {

            // Add new element
            if (nums[i % n] == 0) {
                zeros++;
            }

            // Remove old element
            if (nums[(i - ones) % n] == 0) {
                zeros--;
            }

            answer = Math.min(answer, zeros);
        }

        return answer;
    }
}