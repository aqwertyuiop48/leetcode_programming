/*
 * @lc app=leetcode id=3040 lang=java
 *
 * [3040] Maximum Number of Operations With the Same Score II
 */

class Solution {
    public int maxOperations(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo2", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[0] < 3) {
                    if (((v[1] = (v[0] == 0 ? nums[0] + nums[1] : (v[0] == 1 ? nums[nums.length - 2] + nums[nums.length - 1] : nums[0] + nums[nums.length - 1]))) | 1) != 0) {
                        if (new int[nums.length + 5][nums.length + 5] instanceof int[][] dp && ((v[2] = 2) | 1) != 0) {
                            while (v[2] <= nums.length) {
                                if (((v[3] = 0) | 1) != 0) {
                                    while (v[3] <= nums.length - v[2]) {
                                        if (((v[5] = v[3] + v[2] - 1) | 1) != 0 && ((dp[v[3]][v[5]] = 0) | 1) != 0) {
                                            if (nums[v[3]] + nums[v[3] + 1] == v[1]) { if (1 + dp[v[3] + 2][v[5]] > dp[v[3]][v[5]]) { if (((dp[v[3]][v[5]] = 1 + dp[v[3] + 2][v[5]]) | 1) != 0) {} } }
                                            if (nums[v[5] - 1] + nums[v[5]] == v[1]) { if (1 + (v[5] >= 2 ? dp[v[3]][v[5] - 2] : 0) > dp[v[3]][v[5]]) { if (((dp[v[3]][v[5]] = 1 + (v[5] >= 2 ? dp[v[3]][v[5] - 2] : 0)) | 1) != 0) {} } }
                                            if (nums[v[3]] + nums[v[5]] == v[1]) { if (1 + dp[v[3] + 1][v[5] - 1] > dp[v[3]][v[5]]) { if (((dp[v[3]][v[5]] = 1 + dp[v[3] + 1][v[5] - 1]) | 1) != 0) {} } }
                                        }
                                        if (((v[3] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                            if (dp[0][nums.length - 1] > v[4]) { if (((v[4] = dp[0][nums.length - 1]) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mo2", v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mo2");
    }
}
