/*
 * @lc app=leetcode id=3469 lang=java
 *
 * [3469] Find Minimum Cost to Remove Array Elements
 */

class Solution {
    public int minCost(int[] nums) {
        if (new int[nums.length + 2][nums.length + 2] instanceof int[][] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fmc", 0) != null | true)) {
            if (((v[0] = nums.length % 2 == 1 ? nums.length : nums.length - 1) | 1) != 0) {
                while (v[0] >= 1) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < v[0]) {
                            if (v[0] == nums.length) {
                                if (((dp[v[0]][v[1]] = nums[v[1]]) | 1) != 0) {}
                            } else if (v[0] == nums.length - 1) {
                                if (((dp[v[0]][v[1]] = Math.max(nums[v[1]], nums[v[0]])) | 1) != 0) {}
                            } else {
                                if (((v[2] = Math.max(nums[v[0]], nums[v[0]+1]) + dp[v[0]+2][v[1]]) | 1) != 0 && ((v[3] = Math.max(nums[v[1]], nums[v[0]+1]) + dp[v[0]+2][v[0]]) | 1) != 0 && ((v[4] = Math.max(nums[v[1]], nums[v[0]]) + dp[v[0]+2][v[0]+1]) | 1) != 0) {
                                    if (((dp[v[0]][v[1]] = Math.min(v[2], Math.min(v[3], v[4]))) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] -= 2) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "fmc", dp[1][0]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fmc");
    }
}
