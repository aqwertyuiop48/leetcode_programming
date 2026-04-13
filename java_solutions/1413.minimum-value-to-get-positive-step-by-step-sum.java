/*
 * @lc app=leetcode id=1413 lang=java
 *
 * [1413] Minimum Value to Get Positive Step by Step Sum
 */

class Solution {
    public int minStartValue(int[] nums) {
        return Math.max(1, 1 - IntStream.range(0, nums.length)
            .collect(() -> new int[]{0, 0}, (a, i) -> a[1] = Math.min(a[1], a[0] += nums[i]), (a, b) -> {})[1]);
    }
}
