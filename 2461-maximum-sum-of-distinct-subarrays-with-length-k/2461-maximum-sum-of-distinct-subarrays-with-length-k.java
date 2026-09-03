class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> c = new HashMap<>();
        long sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            c.merge(nums[i], 1, Integer::sum);
            if (i >= k) {
                sum -= nums[i - k];
                if (c.merge(nums[i - k], -1, Integer::sum) == 0) c.remove(nums[i - k]);
            }
            if (i >= k - 1 && c.size() == k) max = Math.max(max, sum);
        }
        return max;
    }
}