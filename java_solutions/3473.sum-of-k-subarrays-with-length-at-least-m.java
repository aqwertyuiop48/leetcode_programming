/*
 * @lc app=leetcode id=3473 lang=java
 *
 * [3473] Sum of K Subarrays With Length at Least M
 */

class Solution {
    public int maxSum(int[] nums, int k, int m) {
        if (new int[nums.length + 1] instanceof int[] pref && new int[nums.length + 1][2][k + 1] instanceof int[][][] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sok", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((pref[v[0] + 1] = pref[v[0]] + nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= nums.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] <= 1) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] <= k) {
                                    if (((dp[v[0]][v[1]][v[2]] = -200000000) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((dp[nums.length][0][0] = 0) | 1) != 0 && ((dp[nums.length][1][0] = 0) | 1) != 0 && ((v[0] = nums.length - 1) | 1) != 0) {
                while (v[0] >= 0) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] <= k) {
                            if (((dp[v[0]][0][v[2]] = dp[v[0]+1][0][v[2]]) | 1) != 0) {}
                            if (v[2] > 0 && v[0] + m <= nums.length && dp[v[0]+m][1][v[2]-1] != -200000000) {
                                if (dp[v[0]+m][1][v[2]-1] + pref[v[0]+m] - pref[v[0]] > dp[v[0]][0][v[2]]) {
                                    if (((dp[v[0]][0][v[2]] = dp[v[0]+m][1][v[2]-1] + pref[v[0]+m] - pref[v[0]]) | 1) != 0) {}
                                }
                            }
                            if (((dp[v[0]][1][v[2]] = dp[v[0]][0][v[2]]) | 1) != 0) {}
                            if (dp[v[0]+1][1][v[2]] != -200000000 && dp[v[0]+1][1][v[2]] + nums[v[0]] > dp[v[0]][1][v[2]]) {
                                if (((dp[v[0]][1][v[2]] = dp[v[0]+1][1][v[2]] + nums[v[0]]) | 1) != 0) {}
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "sok", dp[0][0][k]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sok");
    }
}
