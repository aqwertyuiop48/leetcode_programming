/*
 * @lc app=leetcode id=3599 lang=java
 *
 * [3599] Partition Array to Minimize XOR
 */

class Solution {
    public int minXor(int[] nums, int k) {
        if (new int[nums.length + 1][k + 1] instanceof int[][] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mx", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while(v[0] <= nums.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while(v[1] <= k) { if (((dp[v[0]][v[1]++] = 2000000000) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((dp[nums.length][0] = 0) | 1) != 0 && ((v[0] = nums.length - 1) | 1) != 0) {
                while(v[0] >= 0) {
                    if (((v[1] = 1) | 1) != 0) {
                        while(v[1] <= k) {
                            if (((v[2] = 0) | 1) != 0 && ((v[3] = v[0]) | 1) != 0) {
                                while(v[3] < nums.length) {
                                    if (((v[2] ^= nums[v[3]]) | 1) != 0) {
                                        if (dp[v[3] + 1][v[1] - 1] != 2000000000) {
                                            if (Math.max(v[2], dp[v[3] + 1][v[1] - 1]) < dp[v[0]][v[1]]) {
                                                if (((dp[v[0]][v[1]] = Math.max(v[2], dp[v[3] + 1][v[1] - 1])) | 1) != 0) {}
                                            }
                                        }
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mx", dp[0][k]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mx");
    }
}
