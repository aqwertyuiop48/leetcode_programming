/*
 * @lc app=leetcode id=3196 lang=java
 *
 * [3196] Maximize Total Cost of Alternating Subarrays
 */

class Solution {
    public long maximumTotalCost(int[] nums) {
        if (new long[2] instanceof long[] dp && new long[1] instanceof long[] ndp && new int[2] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mtc", 0L) != null | true)) {
            if (((dp[0] = nums[0]) | 1) != 0 && ((dp[1] = nums[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((ndp[0] = Math.max(dp[0], dp[1]) + nums[v[0]]) | 1) != 0 && ((dp[1] = dp[0] - nums[v[0]]) | 1) != 0 && ((dp[0] = ndp[0]) | 1) != 0) {}
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mtc", Math.max(dp[0], dp[1])) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mtc");
    }
}
