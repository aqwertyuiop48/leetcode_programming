/*
 * @lc app=leetcode id=2289 lang=java
 *
 * [2289] Steps to Make Array Non-decreasing
 */

class Solution {
    public int totalSteps(int[] nums) {
        if (new int[nums.length] instanceof int[] dp && new int[nums.length] instanceof int[] st && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ts", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[3] = 0) | 1) != 0) {
                    while (v[1] > 0 && nums[st[v[1] - 1]] <= nums[v[0]]) {
                        if (dp[st[v[1] - 1]] > v[3]) { if (((v[3] = dp[st[v[1] - 1]]) | 1) != 0) {} }
                        if (((v[1] -= 1) | 1) != 0) {}
                    }
                    if (v[1] > 0) { if (((dp[v[0]] = v[3] + 1) | 1) != 0) {} }
                    if (dp[v[0]] > v[2]) { if (((v[2] = dp[v[0]]) | 1) != 0) {} }
                    if (((st[v[1]++] = v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ts", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ts");
    }
}
