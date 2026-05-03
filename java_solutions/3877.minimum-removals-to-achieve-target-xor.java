/*
 * @lc app=leetcode id=3877 lang=java
 *
 * [3877] Minimum Removals to Achieve Target XOR
 */

class Solution {
    public int minRemovals(int[] nums, int target) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mra", -1) != null | true) && ((v[0] = 0) | 1) != 0) {
            if (new int[32768] instanceof int[] dp && new int[32768] instanceof int[] next) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < 32768) { if (((dp[v[1]] = -1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                }
                if (((dp[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[1] < nums.length) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < 32768) { if (((next[v[2]] = dp[v[2]]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                        }
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < 32768) {
                                if (dp[v[2]] != -1) {
                                    if (((v[3] = v[2] ^ nums[v[1]]) | 1) != 0) {
                                        if (dp[v[2]] + 1 > next[v[3]]) { if (((next[v[3]] = dp[v[2]] + 1) | 1) != 0) {} }
                                    }
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < 32768) { if (((dp[v[2]] = next[v[2]]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (dp[target] != -1) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "mra", nums.length - dp[target]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mra");
    }
}
