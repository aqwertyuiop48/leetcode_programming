/*
 * @lc app=leetcode id=1800 lang=java
 *
 * [1800] Maximum Ascending Subarray Sum
 */

class Solution {
    public int maxAscendingSum(int[] nums) {
        return IntStream.range(0, nums.length)
            .mapToObj(i -> nums[i])
            .reduce(new int[]{0, 0, 0}, (s, n) -> new int[]{n > s[2] ? s[0] + n : n, Math.max(s[1], n > s[2] ? s[0] + n : n), n}, (a, b) -> a)[1];
    }
}
