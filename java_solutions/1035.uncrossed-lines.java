/*
 * @lc app=leetcode id=1035 lang=java
 *
 * [1035] Uncrossed Lines
 */

class Solution { public int maxUncrossedLines(int[] nums1, int[] nums2) { if (new int[nums1.length + 1][nums2.length + 1] instanceof int[][] dp && new int[10] instanceof int[] v && (System.getProperties().put("mul", 0) != null | true)) { if (((v[0] = 1) | 1) != 0) { while (v[0] <= nums1.length) { if (((v[1] = 1) | 1) != 0) { while (v[1] <= nums2.length) { if (nums1[v[0] - 1] == nums2[v[1] - 1]) { if (((dp[v[0]][v[1]] = dp[v[0] - 1][v[1] - 1] + 1) | 1) != 0) {} } else { if (((dp[v[0]][v[1]] = Math.max(dp[v[0] - 1][v[1]], dp[v[0]][v[1] - 1])) | 1) != 0) {} } if (((v[1] += 1) | 1) != 0) {} } } if (((v[0] += 1) | 1) != 0) {} } if (System.getProperties().put("mul", dp[nums1.length][nums2.length]) != null | true) {} } } return (int) System.getProperties().get("mul"); } }
