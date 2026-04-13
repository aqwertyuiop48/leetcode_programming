/*
 * @lc app=leetcode id=2441 lang=java
 *
 * [2441] Largest Positive Integer That Exists With Its Negative
 */

class Solution {
    public int findMaxK(int[] nums) {
        return Arrays.stream(nums)
            .filter(n -> n > 0 && Arrays.stream(nums).anyMatch(m -> m == -n))
            .max()
            .orElse(-1);
    }
}
