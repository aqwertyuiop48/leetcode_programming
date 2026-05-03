/*
 * @lc app=leetcode id=3176 lang=java
 *
 * [3176] Find the Maximum Length of a Good Subsequence I
 */

class Solution {
    public int maximumLength(int[] nums, int k) {
        if (new int[nums.length][k + 1] instanceof int[][] dp && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mlg", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] <= k) {
                            if (((dp[v[0]][v[1]] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                while (v[2] < v[0]) {
                                    if (nums[v[0]] == nums[v[2]]) {
                                        if (dp[v[2]][v[1]] + 1 > dp[v[0]][v[1]]) { if (((dp[v[0]][v[1]] = dp[v[2]][v[1]] + 1) | 1) != 0) {} }
                                    } else if (v[1] > 0) {
                                        if (dp[v[2]][v[1] - 1] + 1 > dp[v[0]][v[1]]) { if (((dp[v[0]][v[1]] = dp[v[2]][v[1] - 1] + 1) | 1) != 0) {} }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (dp[v[0]][v[1]] > v[4]) { if (((v[4] = dp[v[0]][v[1]]) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mlg", v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mlg");
    }
}
