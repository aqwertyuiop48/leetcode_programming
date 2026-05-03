/*
 * @lc app=leetcode id=1696 lang=java
 *
 * [1696] Jump Game VI
 */

class Solution {
    public int maxResult(int[] nums, int k) {
        if (new int[nums.length] instanceof int[] dp && new int[nums.length + 5] instanceof int[] dq && new int[10] instanceof int[] v && (System.getProperties().put("jg6", 0) != null | true)) {
            if (((dp[0] = nums[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((dq[v[2]++] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    while (v[1] < v[2] && dq[v[1]] < v[0] - k) { if (((v[1] += 1) | 1) != 0) {} }
                    if (((dp[v[0]] = dp[dq[v[1]]] + nums[v[0]]) | 1) != 0) {
                        while (v[1] < v[2] && dp[dq[v[2] - 1]] <= dp[v[0]]) { if (((v[2] -= 1) | 1) != 0) {} }
                        if (((dq[v[2]++] = v[0]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("jg6", dp[nums.length - 1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("jg6");
    }
}
