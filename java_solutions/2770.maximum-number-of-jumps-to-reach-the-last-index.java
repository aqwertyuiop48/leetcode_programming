/*
 * @lc app=leetcode id=2770 lang=java
 *
 * [2770] Maximum Number of Jumps to Reach the Last Index
 */

class Solution {
    public int maximumJumps(int[] nums, int target) {
        if (new int[nums.length] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put("mnj", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((dp[v[0]++] = -1) | 1) != 0) {} }
                if (((dp[0] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < v[0]) {
                                if (Math.abs(nums[v[0]] - nums[v[1]]) <= target && dp[v[1]] != -1) {
                                    if (dp[v[1]] + 1 > dp[v[0]]) { if (((dp[v[0]] = dp[v[1]] + 1) | 1) != 0) {} }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("mnj", dp[nums.length - 1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("mnj");
    }
}
