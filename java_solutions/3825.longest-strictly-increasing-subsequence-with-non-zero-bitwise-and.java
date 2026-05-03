/*
 * @lc app=leetcode id=3825 lang=java
 *
 * [3825] Longest Strictly Increasing Subsequence With Non-Zero Bitwise AND
 */

class Solution {
    public int longestSubsequence(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lis", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < 31) {
                    if (new int[nums.length + 5] instanceof int[] dp && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[2] < nums.length) {
                            if ((nums[v[2]] & (1 << v[0])) != 0) {
                                if (((v[4] = 0) | 1) != 0 && ((v[5] = v[3]) | 1) != 0) {
                                    while (v[4] < v[5]) {
                                        if (((v[6] = v[4] + (v[5] - v[4]) / 2) | 1) != 0) {
                                            if (dp[v[6]] < nums[v[2]]) { if (((v[4] = v[6] + 1) | 1) != 0) {} }
                                            else { if (((v[5] = v[6]) | 1) != 0) {} }
                                        }
                                    }
                                    if (((dp[v[4]] = nums[v[2]]) | 1) != 0) {
                                        if (v[4] == v[3]) { if (((v[3] += 1) | 1) != 0) {} }
                                    }
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (v[3] > v[1]) { if (((v[1] = v[3]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "lis", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lis");
    }
}
