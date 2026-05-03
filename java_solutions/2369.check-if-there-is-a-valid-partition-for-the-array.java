/*
 * @lc app=leetcode id=2369 lang=java
 *
 * [2369] Check if There is a Valid Partition For The Array
 */

class Solution {
    public boolean validPartition(int[] nums) {
        if (new int[nums.length + 5] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put("vp", false) != null | true)) {
            if (((dp[0] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] == nums[v[0] - 1] && dp[v[0] - 1] == 1) { if (((dp[v[0] + 1] = 1) | 1) != 0) {} }
                    if (v[0] >= 2 && nums[v[0]] == nums[v[0] - 1] && nums[v[0] - 1] == nums[v[0] - 2] && dp[v[0] - 2] == 1) { if (((dp[v[0] + 1] = 1) | 1) != 0) {} }
                    if (v[0] >= 2 && nums[v[0]] == nums[v[0] - 1] + 1 && nums[v[0] - 1] == nums[v[0] - 2] + 1 && dp[v[0] - 2] == 1) { if (((dp[v[0] + 1] = 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("vp", dp[nums.length] == 1) != null | true) {}
            }
        }
        return (boolean) System.getProperties().get("vp");
    }
}
