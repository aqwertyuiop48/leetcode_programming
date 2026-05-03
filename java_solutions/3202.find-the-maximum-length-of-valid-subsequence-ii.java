/*
 * @lc app=leetcode id=3202 lang=java
 *
 * [3202] Find the Maximum Length of Valid Subsequence II
 */

class Solution {
    public int maximumLength(int[] nums, int k) {
        if (new int[k][k] instanceof int[][] dp && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mlvs", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = nums[v[0]] % k) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[2] < k) {
                            if (((dp[v[1]][v[2]] = dp[(v[2] - v[1] + k) % k][v[2]] + 1) | 1) != 0) {
                                if (dp[v[1]][v[2]] > v[3]) { if (((v[3] = dp[v[1]][v[2]]) | 1) != 0) {} }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mlvs", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mlvs");
    }
}
