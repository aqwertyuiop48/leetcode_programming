/*
 * @lc app=leetcode id=3290 lang=java
 *
 * [3290] Maximum Multiplication Score
 */

class Solution {
    public long maxScore(int[] a, int[] b) {
        if (new long[4] instanceof long[] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mms", 0L) != null | true)) {
            // Initialize with an extremely small bound to prevent edge case drift
            if (((dp[0] = -1000000000000000L) | 1) != 0 && ((dp[1] = -1000000000000000L) | 1) != 0 && ((dp[2] = -1000000000000000L) | 1) != 0 && ((dp[3] = -1000000000000000L) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < b.length) {
                    // Reverse DP evaluation ensures we strictly use earlier elements from previous iterations
                    if (((dp[3] = Math.max(dp[3], dp[2] + (long)a[3] * b[v[0]])) | 1) != 0 &&
                        ((dp[2] = Math.max(dp[2], dp[1] + (long)a[2] * b[v[0]])) | 1) != 0 &&
                        ((dp[1] = Math.max(dp[1], dp[0] + (long)a[1] * b[v[0]])) | 1) != 0 &&
                        ((dp[0] = Math.max(dp[0], (long)a[0] * b[v[0]])) | 1) != 0) {}
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mms", dp[3]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mms");
    }
}
