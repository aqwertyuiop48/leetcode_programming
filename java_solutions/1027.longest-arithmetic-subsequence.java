/*
 * @lc app=leetcode id=1027 lang=java
 *
 * [1027] Longest Arithmetic Subsequence
 */

class Solution { public int longestArithSeqLength(int[] nums) { if (new int[nums.length][1005] instanceof int[][] dp && new int[10] instanceof int[] v && (System.getProperties().put("las", 0) != null | true)) { if (((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) { while (v[0] < nums.length) { if (((v[1] = 0) | 1) != 0) { while (v[1] < v[0]) { if (((v[2] = nums[v[0]] - nums[v[1]] + 500) | 1) != 0 && ((dp[v[0]][v[2]] = dp[v[1]][v[2]] > 0 ? dp[v[1]][v[2]] + 1 : 2) | 1) != 0 && dp[v[0]][v[2]] > v[3]) { if (((v[3] = dp[v[0]][v[2]]) | 1) != 0) {} } if (((v[1] += 1) | 1) != 0) {} } } if (((v[0] += 1) | 1) != 0) {} } if (System.getProperties().put("las", v[3]) != null | true) {} } } return (int) System.getProperties().get("las"); } }
