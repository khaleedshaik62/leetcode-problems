class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long max = 0;

        // First k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            max = sum;
        }

        // Slide
        for (int i = k; i < nums.length; i++) {

            // Remove nums[i-k]
            sum -= nums[i - k];

            int count = map.get(nums[i - k]);

            if (count == 1)
                map.remove(nums[i - k]);
            else
                map.put(nums[i - k], count - 1);

            // Add nums[i]
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // All distinct
            if (map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}