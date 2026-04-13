/*
 * @lc app=leetcode id=2016 lang=java
 *
 * [2016] Maximum Difference Between Increasing Elements
 */

class Solution {
    public int maximumDifference(int[] nums) {
        return IntStream.range(1, nums.length)
            .map(j -> nums[j] - IntStream.range(0, j).map(i -> nums[i]).min().getAsInt())
            .filter(diff -> diff > 0)
            .max()
            .orElse(-1);
    }
}
