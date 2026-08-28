class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        // XOR of all numbers
        for (int num : nums) {
            xor ^= num;
        }

        // Get the rightmost set bit
        int diff = xor & -xor;

        int num1 = 0;
        int num2 = 0;

        // Divide numbers into two groups
        for (int num : nums) {
            if ((num & diff) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        return new int[]{num1, num2};
    }
}
    