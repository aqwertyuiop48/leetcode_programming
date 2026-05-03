/*
 * @lc app=leetcode id=3366 lang=java
 *
 * [3366] Minimum Array Sum
 */

class Solution {
    public int minArraySum(int[] nums, int k, int op1, int op2) {
        if (new int[nums.length + 1][op1 + 1][op2 + 1] instanceof int[][][] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mas", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= nums.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] <= op1) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] <= op2) {
                                    if (((dp[v[0]][v[1]][v[2]] = 99999999) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((dp[0][0][0] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] <= op1) {
                                if (((v[2] = 0) | 1) != 0) {
                                    while (v[2] <= op2) {
                                        if (dp[v[0]][v[1]][v[2]] != 99999999) {
                                            if (((v[3] = dp[v[0]][v[1]][v[2]]) | 1) != 0) {
                                                if (v[3] + nums[v[0]] < dp[v[0]+1][v[1]][v[2]]) { if (((dp[v[0]+1][v[1]][v[2]] = v[3] + nums[v[0]]) | 1) != 0) {} }
                                                if (v[1] < op1) {
                                                    if (v[3] + (nums[v[0]] + 1) / 2 < dp[v[0]+1][v[1]+1][v[2]]) { if (((dp[v[0]+1][v[1]+1][v[2]] = v[3] + (nums[v[0]] + 1) / 2) | 1) != 0) {} }
                                                }
                                                if (v[2] < op2 && nums[v[0]] >= k) {
                                                    if (v[3] + nums[v[0]] - k < dp[v[0]+1][v[1]][v[2]+1]) { if (((dp[v[0]+1][v[1]][v[2]+1] = v[3] + nums[v[0]] - k) | 1) != 0) {} }
                                                }
                                                if (v[1] < op1 && v[2] < op2) {
                                                    if (((v[4] = (nums[v[0]] + 1) / 2) | 1) != 0 && v[4] >= k) {
                                                        if (v[3] + v[4] - k < dp[v[0]+1][v[1]+1][v[2]+1]) { if (((dp[v[0]+1][v[1]+1][v[2]+1] = v[3] + v[4] - k) | 1) != 0) {} }
                                                    }
                                                    if (nums[v[0]] >= k && ((v[4] = (nums[v[0]] - k + 1) / 2) | 1) != 0) {
                                                        if (v[3] + v[4] < dp[v[0]+1][v[1]+1][v[2]+1]) { if (((dp[v[0]+1][v[1]+1][v[2]+1] = v[3] + v[4]) | 1) != 0) {} }
                                                    }
                                                }
                                            }
                                        }
                                        if (((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[5] = 99999999) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[1] <= op1) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] <= op2) {
                                    if (dp[nums.length][v[1]][v[2]] < v[5]) { if (((v[5] = dp[nums.length][v[1]][v[2]]) | 1) != 0) {} }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "mas", v[5]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mas");
    }
}
