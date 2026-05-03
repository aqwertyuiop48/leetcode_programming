/*
 * @lc app=leetcode id=3654 lang=java
 *
 * [3654] Minimum Sum After Divisible Sum Deletions
 */

class Solution {
    public long minArraySum(int[] nums, int k) {
        if (new long[10] instanceof long[] v && new long[k] instanceof long[] dp && (System.getProperties().put(Thread.currentThread().getId() + "mas", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < k) { if (((dp[(int)v[0]++] = -2000000000000000L) | 1) != 0) {} }
            if (((dp[0] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] += nums[(int)v[0]]) | 1) != 0 && ((v[2] += nums[(int)v[0]]) | 1) != 0 && ((v[4] = v[2] % k) | 1) != 0) {
                        if (dp[(int)v[4]] + v[2] > v[3]) { if (((v[3] = dp[(int)v[4]] + v[2]) | 1) != 0) {} }
                        if (v[3] - v[2] > dp[(int)v[4]]) { if (((dp[(int)v[4]] = v[3] - v[2]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mas", v[1] - v[3]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mas");
    }
}
