class Solution {
    public int countDigitOne(int n) {

        int count = 0;

        for (long factor = 1; factor <= n; factor *= 10) {

            long cycle = factor * 10;

            count += (n / cycle) * factor;

            long remainder = n % cycle;

            if (remainder >= factor) {
                count += Math.min(remainder - factor + 1, factor);
            }
        }

        return count;
    }
}