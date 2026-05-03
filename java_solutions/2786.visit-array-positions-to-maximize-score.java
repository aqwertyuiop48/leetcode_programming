/*
 * @lc app=leetcode id=2786 lang=java
 *
 * [2786] Visit Array Positions to Maximize Score
 */

class Solution {
    public long maxScore(int[] nums, int x) {
        if (new long[2] instanceof long[] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ms", 0L) != null | true) && ((dp[0] = -1000000000000000L) | 1) != 0 && ((dp[1] = -1000000000000000L) | 1) != 0 && ((dp[nums[0] % 2] = nums[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[1] = nums[v[0]] % 2) | 1) != 0) {
                    if (((dp[v[1]] = Math.max(dp[v[1]] + nums[v[0]], dp[1 - v[1]] + nums[v[0]] - x)) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ms", Math.max(dp[0], dp[1])) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "ms");
    }
}
